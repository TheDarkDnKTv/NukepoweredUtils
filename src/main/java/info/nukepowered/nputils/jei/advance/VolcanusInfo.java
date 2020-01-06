package info.nukepowered.nputils.jei.advance;

import gregtech.api.GTValues;
import gregtech.api.metatileentity.multiblock.MultiblockControllerBase;
import gregtech.common.blocks.BlockWireCoil;
import gregtech.common.blocks.MetaBlocks;
import gregtech.common.metatileentities.MetaTileEntities;
import gregtech.integration.jei.multiblock.MultiblockInfoPage;
import gregtech.integration.jei.multiblock.MultiblockShapeInfo;
import info.nukepowered.nputils.item.NPUMetaBlocks;
import info.nukepowered.nputils.item.NPUMetalCasing;
import info.nukepowered.nputils.machines.NPUTileEntities;
import net.minecraft.client.resources.I18n;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;

import java.util.ArrayList;
import java.util.List;

public class VolcanusInfo extends MultiblockInfoPage {

	@Override
	public MultiblockControllerBase getController() {
		return NPUTileEntities.VOLCANUS;
	}

	@Override
	public List<MultiblockShapeInfo> getMatchingShapes() {
		ArrayList<MultiblockShapeInfo> shapeInfo = new ArrayList<>();
		for (BlockWireCoil.CoilType coilType : BlockWireCoil.CoilType.values()) {
			shapeInfo.add(MultiblockShapeInfo.builder()
					.aisle("IFX", "CCC", "CCC", "XXX")
					.aisle("SXE", "C#C", "C#C", "XXX")
					.aisle("ODX", "CCC", "CCC", "XXX")
					.where('X', NPUMetaBlocks.METAL_CASING.getState(NPUMetalCasing.MetalCasingType.HASTELLOY_N))
					.where('C', MetaBlocks.WIRE_COIL.getState(coilType))
					.where('S', NPUTileEntities.VOLCANUS, EnumFacing.WEST)

					.where('E', MetaTileEntities.ENERGY_INPUT_HATCH[GTValues.MV], EnumFacing.EAST)
					.where('I', MetaTileEntities.ITEM_IMPORT_BUS[GTValues.LV], EnumFacing.WEST)
					.where('O', MetaTileEntities.ITEM_EXPORT_BUS[GTValues.LV], EnumFacing.WEST)

					.where('F', MetaTileEntities.FLUID_IMPORT_HATCH[GTValues.LV], EnumFacing.NORTH)
					.where('D', MetaTileEntities.FLUID_IMPORT_HATCH[GTValues.LV], EnumFacing.SOUTH)


					.where('#', Blocks.AIR.getDefaultState())
					.build());
		}
		return shapeInfo;
	}

	@Override
	public String[] getDescription() {
		return new String[]{I18n.format("gregtech.multiblock.volcanus.description")};
	}
}
