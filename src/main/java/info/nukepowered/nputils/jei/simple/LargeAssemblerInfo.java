package info.nukepowered.nputils.jei.simple;

import com.google.common.collect.Lists;
import gregtech.api.GTValues;
import gregtech.api.metatileentity.multiblock.MultiblockControllerBase;
import gregtech.common.blocks.BlockWireCoil;
import gregtech.common.blocks.MetaBlocks;
import gregtech.common.metatileentities.MetaTileEntities;
import gregtech.integration.jei.multiblock.MultiblockInfoPage;
import gregtech.integration.jei.multiblock.MultiblockShapeInfo;
import info.nukepowered.nputils.item.NPUMetaBlocks;
import info.nukepowered.nputils.item.NPUMultiblockCasing;
import info.nukepowered.nputils.machines.NPUTileEntities;
import net.minecraft.client.resources.I18n;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;

import java.util.ArrayList;
import java.util.List;

public class LargeAssemblerInfo extends MultiblockInfoPage {
	@Override
	public MultiblockControllerBase getController() {
		return NPUTileEntities.LARGE_ASSEMBLER;
	}

	@Override
	public List<MultiblockShapeInfo> getMatchingShapes() {
		ArrayList<MultiblockShapeInfo> shapeInfo = new ArrayList<>();
		for (BlockWireCoil.CoilType coilType : BlockWireCoil.CoilType.values()) {
			shapeInfo.add(MultiblockShapeInfo.builder()
					.aisle("XXX", "XXX", "XXX")
					.aisle("IXX", "X#X", "XXX")
					.aisle("OEX", "XSX", "XXX")
					.where('E', MetaTileEntities.ENERGY_INPUT_HATCH[GTValues.HV], EnumFacing.WEST)
					.where('S', NPUTileEntities.LARGE_ASSEMBLER, EnumFacing.SOUTH)
					.where('C', MetaBlocks.WIRE_COIL.getState(coilType))
					.where('X', NPUMetaBlocks.MULTIBLOCK_CASING.getState(NPUMultiblockCasing.CasingType.LARGE_ASSEMBLER))
					.where('#', Blocks.AIR.getDefaultState())
					.where('I', MetaTileEntities.ITEM_IMPORT_BUS[GTValues.LV], EnumFacing.WEST)
					.where('O', MetaTileEntities.ITEM_EXPORT_BUS[GTValues.LV], EnumFacing.WEST)
					.build());
		}

		return Lists.newArrayList(shapeInfo);
	}

	@Override
	public String[] getDescription() {
		return new String[]{I18n.format("gregtech.multiblock.large_assembler.description")};
	}
}
