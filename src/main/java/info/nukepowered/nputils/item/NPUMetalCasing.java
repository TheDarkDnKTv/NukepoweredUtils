package info.nukepowered.nputils.item;

import gregtech.common.blocks.VariantBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class NPUMetalCasing extends VariantBlock<NPUMetalCasing.MetalCasingType> {

	public NPUMetalCasing() {
		super(Material.IRON);
		setUnlocalizedName("npu_metal_casing");
		setHardness(5.0f);
		setResistance(10.0f);
		setSoundType(SoundType.METAL);
		setHarvestLevel("pickaxe", 2);
		setDefaultState(getState(NPUMetalCasing.MetalCasingType.RED_STEEL_CASING));
	}

	@Override
	public boolean canCreatureSpawn(IBlockState state, IBlockAccess world, BlockPos pos, EntityLiving.SpawnPlacementType type) {
		return false;
	}

	public enum MetalCasingType implements IStringSerializable {

		RED_STEEL_CASING("red_steel"),
		TUMBAGA("tumbaga"),
		POTIN("potin"),
		STELLITE_TALONITE("stellite_talonite"),
		STABALLOY("staballoy"),
		EGLIN_STEEL("eglin_steel"),
		GRISIUM("grisium"),
		MARAGING_STEEL("maraging_steel"),
		INCONEL("inconel"),
		HASTELLOY_N("hastelloy_n");

		private final String name;

		MetalCasingType(String name) {
			this.name = name;
		}

		@Override
		public String getName() {
			return this.name;
		}

	}
}
