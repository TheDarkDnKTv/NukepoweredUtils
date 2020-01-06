package info.nukepowered.nputils.machines.advance;

import gregtech.api.capability.IMultipleTankHandler;
import gregtech.api.capability.impl.MultiblockRecipeLogic;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.MetaTileEntityHolder;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.MultiblockAbility;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.multiblock.BlockPattern;
import gregtech.api.multiblock.FactoryBlockPattern;
import gregtech.api.recipes.CountableIngredient;
import gregtech.api.recipes.Recipe;
import gregtech.api.recipes.RecipeBuilder;
import gregtech.api.render.ICubeRenderer;
import gregtech.common.metatileentities.multi.electric.MetaTileEntityElectricBlastFurnace;
import info.nukepowered.nputils.NPUMaterials;
import info.nukepowered.nputils.NPUTextures;
import info.nukepowered.nputils.item.NPUMetaBlocks;
import info.nukepowered.nputils.item.NPUMetalCasing;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.IFluidTank;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.IItemHandlerModifiable;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TileEntityVolcanus extends MetaTileEntityElectricBlastFurnace {

	private static final MultiblockAbility<?>[] ALLOWED_ABILITIES = {MultiblockAbility.IMPORT_ITEMS, MultiblockAbility.EXPORT_ITEMS, MultiblockAbility.IMPORT_FLUIDS, MultiblockAbility.EXPORT_FLUIDS, MultiblockAbility.INPUT_ENERGY};

	public TileEntityVolcanus(ResourceLocation metaTileEntityId) {
		super(metaTileEntityId);
		this.recipeMapWorkable = new VolacanusRecipeLogic(this);
		reinitializeStructurePattern();
	}

	@Override
	public MetaTileEntity createMetaTileEntity(MetaTileEntityHolder holder) {
		return new TileEntityVolcanus(metaTileEntityId);
	}

	@Override
	protected BlockPattern createStructurePattern() {
		return FactoryBlockPattern.start()
				.aisle("XXX", "CCC", "CCC", "XXX")
				.aisle("XXX", "C#C", "C#C", "XXX")
				.aisle("XSX", "CCC", "CCC", "XXX")
				.where('S', selfPredicate())
				.where('X', statePredicate(getCasingState()).or(abilityPartPredicate(ALLOWED_ABILITIES)))
				.where('C', heatingCoilPredicate())
				.where('#', isAirPredicate())
				.build();
	}


	@Override
	protected IBlockState getCasingState() {
		return NPUMetaBlocks.METAL_CASING.getState(NPUMetalCasing.MetalCasingType.HASTELLOY_N);
	}

	@Override
	public ICubeRenderer getBaseTexture(IMultiblockPart sourcePart) {
		return NPUTextures.HASTELLOY_N;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World player, List<String> tooltip, boolean advanced) {
		super.addInformation(stack, player, tooltip, advanced);
		tooltip.add(I18n.format("gregtech.multiblock.volcanus.description"));
	}


	public class VolacanusRecipeLogic extends MultiblockRecipeLogic {

		public VolacanusRecipeLogic(RecipeMapMultiblockController tileEntity) {
			super(tileEntity);
		}

		@Override
		protected Recipe findRecipe(long maxVoltage, IItemHandlerModifiable inputs, IMultipleTankHandler fluidInputs) {
			Recipe recipe = super.findRecipe(maxVoltage, inputs, fluidInputs);
			if (recipe == null) {
				return null;
			}
			List<CountableIngredient> newRecipeInputs = new ArrayList<>();
			List<FluidStack> newFluidInputs = new ArrayList<>();
			List<ItemStack> outputI = new ArrayList<>();
			List<FluidStack> outputF = new ArrayList<>();
			this.multiplyInputsAndOutputs(newRecipeInputs, newFluidInputs, outputI, outputF, recipe, 1);
			RecipeBuilder<?> newRecipe = recipeMap.recipeBuilder()
					.inputsIngredients(newRecipeInputs)
					.fluidInputs(newFluidInputs)
					.outputs(outputI)
					.fluidOutputs(outputF)
					.EUt((int) (recipe.getEUt() * 0.8))
					.duration((int) (recipe.getDuration() / 3.0));
			return newRecipe.build().getResult();
		}

		@Override
		protected boolean drawEnergy(int recipeEUt) {
			boolean enoughEnergy = super.drawEnergy(recipeEUt);
			Optional<IFluidTank> fluidTank =
					getInputFluidInventory().getFluidTanks().stream()
							.filter(iFluidTank -> iFluidTank.getFluid() != null)
							.filter(iFluidTank -> iFluidTank.getFluid().isFluidEqual(NPUMaterials.Pyrotheum.getFluid(1)))
							.findFirst();
			if (fluidTank.isPresent()) {
				IFluidTank tank = fluidTank.get();
				if (tank.getCapacity() > 1 && enoughEnergy) {
					tank.drain(1, true);
					return true;
				}
			}
			return false;
		}

		protected void multiplyInputsAndOutputs(List<CountableIngredient> newRecipeInputs, List<FluidStack> newFluidInputs, List<ItemStack> outputI, List<FluidStack> outputF, Recipe r, int multiplier) {
			for (CountableIngredient ci : r.getInputs()) {
				CountableIngredient newIngredient = new CountableIngredient(ci.getIngredient(), ci.getCount() * multiplier);
				newRecipeInputs.add(newIngredient);
			}
			for (FluidStack fs : r.getFluidInputs()) {
				FluidStack newFluid = new FluidStack(fs.getFluid(), fs.amount * multiplier);
				newFluidInputs.add(newFluid);
			}
			for (ItemStack s : r.getOutputs()) {
				int num = s.getCount() * multiplier;
				ItemStack itemCopy = s.copy();
				itemCopy.setCount(num);
				outputI.add(itemCopy);
			}
			for (FluidStack f : r.getFluidOutputs()) {
				int fluidNum = f.amount * multiplier;
				FluidStack fluidCopy = f.copy();
				fluidCopy.amount = fluidNum;
				outputF.add(fluidCopy);
			}
		}
	}

}
