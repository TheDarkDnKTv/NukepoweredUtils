package info.nukepowered.nputils;

import com.google.common.collect.ImmutableList;

import gregtech.api.unification.Element;
import gregtech.api.unification.material.IMaterialHandler;
import gregtech.api.unification.material.MaterialIconSet;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.material.type.*;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.unification.stack.MaterialStack;
import info.nukepowered.nputils.item.BasicMaterial;

@IMaterialHandler.RegisterMaterialHandler
public class NPUMaterials implements IMaterialHandler {
	public static FluidMaterial FishOil;
	public static FluidMaterial RawGrowthMedium;
	public static FluidMaterial SterilizedGrowthMedium;
	public static FluidMaterial SodiumHydroxideSolution;
	public static FluidMaterial NeutralMatter;
	public static FluidMaterial PositiveMatter;
	public static FluidMaterial IronChloride;
	
	public static IngotMaterial Neutronium;
	public static IngotMaterial MVSuperconductorBase;
	public static IngotMaterial HVSuperconductorBase;
	public static IngotMaterial EVSuperconductorBase;
	public static IngotMaterial IVSuperconductorBase;
	public static IngotMaterial LuVSuperconductorBase;
	public static IngotMaterial ZPMSuperconductorBase;
	public static IngotMaterial Enderium;
	
	public static DustMaterial Meat;
	public static DustMaterial AluminoSilicateWool;
	public static DustMaterial MicaPulp;
	public static DustMaterial QuartzSand;
	public static DustMaterial Massicot;
	public static DustMaterial AntimonyTrioxide;
	public static DustMaterial Zincite;
	public static DustMaterial CobaltOxide;
	public static DustMaterial ArsenicTrioxide;
	public static DustMaterial CupricOxide;
	public static DustMaterial Ferrosilite;
	
	public static BasicMaterial Plasma;
	public static BasicMaterial MVSuperconductor;
	public static BasicMaterial HVSuperconductor;
	public static BasicMaterial EVSuperconductor;
	public static BasicMaterial IVSuperconductor;
	public static BasicMaterial LuVSuperconductor;
	public static BasicMaterial ZPMSuperconductor;
	
	public static IngotMaterial ElectricalSteel;
	
	public static GemMaterial LigniteCoke;


	private static long EXT2_METAL = DustMaterial.MatFlags.GENERATE_PLATE | SolidMaterial.MatFlags.GENERATE_ROD | IngotMaterial.MatFlags.GENERATE_BOLT_SCREW | SolidMaterial.MatFlags.GENERATE_GEAR | IngotMaterial.MatFlags.GENERATE_FOIL | IngotMaterial.MatFlags.GENERATE_FINE_WIRE;
	public static final DustMaterial EglinSteelBase = new DustMaterial(961, "eglin_steel_base", 0x8B4513, MaterialIconSet.SAND, 6, ImmutableList.of(new MaterialStack(Materials.Iron, 4), new MaterialStack(Materials.Kanthal, 1), new MaterialStack(Materials.Invar, 5)), 0);
	public static final IngotMaterial EglinSteel = new IngotMaterial(960, "eglin_steel", 0x8B4513, MaterialIconSet.METALLIC, 6, ImmutableList.of(new MaterialStack(NPUMaterials.EglinSteelBase, 10), new MaterialStack(Materials.Sulfur, 1), new MaterialStack(Materials.Silicon, 1), new MaterialStack(Materials.Carbon, 1)), EXT2_METAL | SolidMaterial.MatFlags.GENERATE_FRAME, null, 1048);
	public static final IngotMaterial Grisium = new IngotMaterial(959, "grisium", 0x355D6A, MaterialIconSet.METALLIC, 6, ImmutableList.of(new MaterialStack(Materials.Titanium, 9), new MaterialStack(Materials.Carbon, 9), new MaterialStack(Materials.Potassium, 9), new MaterialStack(Materials.Lithium, 9), new MaterialStack(Materials.Sulfur, 9), new MaterialStack(Materials.Hydrogen, 5)), EXT2_METAL | SolidMaterial.MatFlags.GENERATE_FRAME, null, 3850);
	public static final IngotMaterial Inconel625 = new IngotMaterial(958, "inconel_a", 0x80C880, MaterialIconSet.METALLIC, 6, ImmutableList.of(new MaterialStack(Materials.Nickel, 3), new MaterialStack(Materials.Chrome, 7), new MaterialStack(Materials.Molybdenum, 10), new MaterialStack(Materials.Invar, 10), new MaterialStack(Materials.Nichrome, 13)), EXT2_METAL | SolidMaterial.MatFlags.GENERATE_FRAME, null, 2425);
	public static final IngotMaterial MaragingSteel250 = new IngotMaterial(957, "maraging_steel_a", 0x92918D, MaterialIconSet.METALLIC, 6, ImmutableList.of(new MaterialStack(Materials.Steel, 16), new MaterialStack(Materials.Molybdenum, 1), new MaterialStack(Materials.Titanium, 1), new MaterialStack(Materials.Nickel, 4), new MaterialStack(Materials.Cobalt, 2)), EXT2_METAL | SolidMaterial.MatFlags.GENERATE_FRAME, null, 2413);
	public static final IngotMaterial Potin = new IngotMaterial(956, "potin", 0xC99781, MaterialIconSet.METALLIC, 6, ImmutableList.of(new MaterialStack(Materials.Lead, 2), new MaterialStack(Materials.Bronze, 2), new MaterialStack(Materials.Tin, 1)), EXT2_METAL | SolidMaterial.MatFlags.GENERATE_FRAME, null );
	public static final IngotMaterial Staballoy = new IngotMaterial(955, "staballoy", 0x444B42, MaterialIconSet.METALLIC, 6, ImmutableList.of(new MaterialStack(Materials.Uranium, 9), new MaterialStack(Materials.Titanium, 1)), EXT2_METAL | SolidMaterial.MatFlags.GENERATE_FRAME, null,  3450);
	public static final IngotMaterial HastelloyN = new IngotMaterial(954, "hastelloy_n", 0xDDDDDD, MaterialIconSet.METALLIC, 6, ImmutableList.of(new MaterialStack(Materials.Yttrium, 2), new MaterialStack(Materials.Molybdenum, 4), new MaterialStack(Materials.Chrome, 2), new MaterialStack(Materials.Titanium, 2), new MaterialStack(Materials.Nickel, 15)), EXT2_METAL | SolidMaterial.MatFlags.GENERATE_FRAME, null, 4350);
	public static final IngotMaterial Tumbaga = new IngotMaterial(953, "tumbaga", 0xFFB20F, MaterialIconSet.METALLIC, 6, ImmutableList.of(new MaterialStack(Materials.Gold, 7), new MaterialStack(Materials.Copper, 3)), EXT2_METAL | SolidMaterial.MatFlags.GENERATE_FRAME, null, 1200);
	public static final IngotMaterial Stellite = new IngotMaterial(952, "stellite", 0x9991A5, MaterialIconSet.METALLIC, 6, ImmutableList.of(new MaterialStack(Materials.Cobalt, 9), new MaterialStack(Materials.Chrome, 9), new MaterialStack(Materials.Manganese, 5), new MaterialStack(Materials.Titanium, 2)), EXT2_METAL | SolidMaterial.MatFlags.GENERATE_FRAME, null, 4310);
	public static final IngotMaterial Talonite = new IngotMaterial(951, "talonite", 0x9991A5, MaterialIconSet.METALLIC, 6, ImmutableList.of(new MaterialStack(Materials.Cobalt, 4), new MaterialStack(Materials.Chrome, 3), new MaterialStack(Materials.Phosphorus, 2), new MaterialStack(Materials.Molybdenum, 1)), EXT2_METAL | SolidMaterial.MatFlags.GENERATE_FRAME, null, 3454);
	public static final DustMaterial Pyrotheum = new DustMaterial(950, "pyrotheum", 0xFF9A3C, MaterialIconSet.SAND, 1, ImmutableList.of(),  Material.MatFlags.DISABLE_DECOMPOSITION | DustMaterial.MatFlags.EXCLUDE_BLOCK_CRAFTING_RECIPES | DustMaterial.MatFlags.SMELT_INTO_FLUID);


	static {
		long STD_METAL = DustMaterial.MatFlags.GENERATE_PLATE;
		long EXT_METAL = STD_METAL | SolidMaterial.MatFlags.GENERATE_ROD | IngotMaterial.MatFlags.GENERATE_BOLT_SCREW;
		long EXT2_METAL = EXT_METAL | SolidMaterial.MatFlags.GENERATE_GEAR | IngotMaterial.MatFlags.GENERATE_FOIL | IngotMaterial.MatFlags.GENERATE_FINE_WIRE;
		
		FishOil = new FluidMaterial(999, "fish_oil", 14467421, MaterialIconSet.FLUID, ImmutableList.of(), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK | Material.MatFlags.DISABLE_DECOMPOSITION);
		RawGrowthMedium = new FluidMaterial(997, "raw_growth_medium", 10777425, MaterialIconSet.FLUID, ImmutableList.of(), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK | Material.MatFlags.DISABLE_DECOMPOSITION);
		SterilizedGrowthMedium= new FluidMaterial(996, "sterilized_growth_medium", 11306862, MaterialIconSet.FLUID, ImmutableList.of(), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK | Material.MatFlags.DISABLE_DECOMPOSITION);
		SodiumHydroxideSolution = new FluidMaterial(962, "sodium_hydroxide_solution", 0x97c9c7, MaterialIconSet.FLUID, ImmutableList.of(), FluidMaterial.MatFlags.GENERATE_FLUID_BLOCK | Material.MatFlags.DISABLE_DECOMPOSITION);
		NeutralMatter = new FluidMaterial(993, "neutral_matter", 3956968, MaterialIconSet.FLUID, ImmutableList.of(), Material.MatFlags.DISABLE_DECOMPOSITION);
		PositiveMatter = new FluidMaterial(992, "positive_matter", 11279131, MaterialIconSet.FLUID, ImmutableList.of(), Material.MatFlags.DISABLE_DECOMPOSITION);
		IronChloride = new FluidMaterial(972, "iron_chloride", 0x060b0b, MaterialIconSet.FLUID, ImmutableList.of(new MaterialStack(Materials.Iron, 1), new MaterialStack(Materials.Chlorine, 3)), Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING);
		
		Neutronium = new IngotMaterial(998, "neutronium", 12829635, MaterialIconSet.METALLIC, 6, ImmutableList.of(), EXT2_METAL | gregtech.api.unification.material.type.IngotMaterial.MatFlags.GENERATE_RING | gregtech.api.unification.material.type.IngotMaterial.MatFlags.GENERATE_ROTOR | gregtech.api.unification.material.type.IngotMaterial.MatFlags.GENERATE_SMALL_GEAR | gregtech.api.unification.material.type.SolidMaterial.MatFlags.GENERATE_LONG_ROD | SolidMaterial.MatFlags.GENERATE_FRAME, Element.valueOf("Nt"), 24.0F, 12, 655360);
		MVSuperconductorBase = new IngotMaterial(988, "mv_superconductor_base", 0x535353, MaterialIconSet.SHINY, 1, ImmutableList.of(new MaterialStack(Materials.Cadmium, 5), new MaterialStack(Materials.Magnesium, 1), new MaterialStack(Materials.Oxygen, 6)), STD_METAL, null, 2500);
	    HVSuperconductorBase = new IngotMaterial(987, "hv_superconductor_base", 0x4a2400, MaterialIconSet.SHINY, 1, ImmutableList.of(new MaterialStack(Materials.Titanium, 1), new MaterialStack(Materials.Barium, 9), new MaterialStack(Materials.Copper, 10), new MaterialStack(Materials.Oxygen, 20)), STD_METAL, null, 3300);
	    EVSuperconductorBase = new IngotMaterial(986, "ev_superconductor_base", 0x005800, MaterialIconSet.SHINY, 1, ImmutableList.of(new MaterialStack(Materials.Uranium, 1), new MaterialStack(Materials.Platinum, 3)), STD_METAL, null, 4400);
	    IVSuperconductorBase = new IngotMaterial(985, "iv_superconductor_base", 0x300030, MaterialIconSet.SHINY, 1, ImmutableList.of(new MaterialStack(Materials.Vanadium, 1), new MaterialStack(Materials.Indium, 3)), STD_METAL, null, 5200);
	    LuVSuperconductorBase = new IngotMaterial(984, "luv_superconductor_base", 0x7a3c00, MaterialIconSet.SHINY, 1, ImmutableList.of(new MaterialStack(Materials.Indium, 4), new MaterialStack(Materials.Bronze, 8), new MaterialStack(Materials.Barium, 2), new MaterialStack(Materials.Titanium, 1), new MaterialStack(Materials.Oxygen, 14)), STD_METAL, null, 6000);
	    ZPMSuperconductorBase = new IngotMaterial(983, "zpm_superconductor_base", 0x111111, MaterialIconSet.SHINY, 1, ImmutableList.of(new MaterialStack(Materials.Naquadah, 4), new MaterialStack(Materials.Indium, 2), new MaterialStack(Materials.Palladium, 6), new MaterialStack(Materials.Osmium, 1)), STD_METAL, null, 8100);
	    Enderium = new IngotMaterial(976, "enderium", 0x23524a, MaterialIconSet.METALLIC, 3, ImmutableList.of(new MaterialStack(Materials.Lead, 3), new MaterialStack(Materials.Platinum, 1), new MaterialStack(Materials.EnderPearl, 1)), EXT_METAL | Material.MatFlags.DISABLE_DECOMPOSITION, null, 8.0F, 3.0F, 1280, 4500);
	    ElectricalSteel = new IngotMaterial(949, "electrical_steel", 0x636363, MaterialIconSet.METALLIC, 2, ImmutableList.of(new MaterialStack(Materials.Iron, 26), new MaterialStack(Materials.Silicon, 1)), STD_METAL | Material.MatFlags.DISABLE_DECOMPOSITION, null, 1100);
	    
	    Meat = new DustMaterial(995, "meat", 12667980, MaterialIconSet.SAND, 1, ImmutableList.of(), Material.MatFlags.DISABLE_DECOMPOSITION);
	    AluminoSilicateWool = new DustMaterial(975, "alumino_silicate_wool", 0xbbbbbb, MaterialIconSet.SAND, 1, ImmutableList.of(), Material.MatFlags.DISABLE_DECOMPOSITION);
	    MicaPulp = new DustMaterial(974, "mica_based", 0x917445, MaterialIconSet.SAND, 1, ImmutableList.of(), Material.MatFlags.DISABLE_DECOMPOSITION);
	    QuartzSand = new DustMaterial(971, "sand", 0xd2cfbc, MaterialIconSet.SAND, 1, ImmutableList.of(), Material.MatFlags.DISABLE_DECOMPOSITION);
	    Massicot = new DustMaterial(970, "massicot", 8943149, MaterialIconSet.SAND, 1, ImmutableList.of(new MaterialStack(Materials.Lead, 1), new MaterialStack(Materials.Oxygen, 1)), 0);
	    AntimonyTrioxide = new DustMaterial(969, "antimony_trioxide", 8092544, MaterialIconSet.SAND, 1, ImmutableList.of(new MaterialStack(Materials.Antimony, 2), new MaterialStack(Materials.Oxygen, 3)), 0);
	    Zincite = new DustMaterial(968, "zincite", 8947843, MaterialIconSet.SAND, 1, ImmutableList.of(new MaterialStack(Materials.Zinc, 1), new MaterialStack(Materials.Oxygen, 1)), 0);
        CobaltOxide = new DustMaterial(967, "cobalt_oxide", 3556352, MaterialIconSet.SAND, 1, ImmutableList.of(new MaterialStack(Materials.Cobalt, 1), new MaterialStack(Materials.Oxygen, 1)), 0);
        ArsenicTrioxide = new DustMaterial(966, "arsenic_trioxide", 15856113, MaterialIconSet.ROUGH, 1, ImmutableList.of(new MaterialStack(Materials.Arsenic, 2), new MaterialStack(Materials.Oxygen, 3)), 0);
        CupricOxide = new DustMaterial(964, "cupric_oxide", 526344, MaterialIconSet.SAND, 1, ImmutableList.of(new MaterialStack(Materials.Copper, 1), new MaterialStack(Materials.Oxygen, 1)), 0);
        Ferrosilite = new DustMaterial(963, "ferrosilite", 5256470, MaterialIconSet.SAND, 1, ImmutableList.of(new MaterialStack(Materials.Iron, 1), new MaterialStack(Materials.Silicon, 1), new MaterialStack(Materials.Oxygen, 3)), 0);
        
        Plasma = new BasicMaterial(990, "plasma", 15389725, MaterialIconSet.SHINY);
        MVSuperconductor = new BasicMaterial(982, "mv_superconductor", 0x535353, MaterialIconSet.SHINY);
        HVSuperconductor = new BasicMaterial(981, "hv_superconductor", 0x4a2400, MaterialIconSet.SHINY);
        EVSuperconductor = new BasicMaterial(980, "ev_superconductor", 0x005800, MaterialIconSet.SHINY);
        IVSuperconductor = new BasicMaterial(979, "iv_superconductor", 0x300030, MaterialIconSet.SHINY);
        LuVSuperconductor = new BasicMaterial(978, "luv_superconductor", 0x7a3c00, MaterialIconSet.SHINY);
        ZPMSuperconductor = new BasicMaterial(977, "zpm_superconductor", 0x111111, MaterialIconSet.SHINY);
        LigniteCoke = new GemMaterial(989, "lignite_coke", 0x8b6464, MaterialIconSet.LIGNITE, 1, ImmutableList.of(new MaterialStack(Materials.Carbon, 1)), Material.MatFlags.DECOMPOSITION_BY_ELECTROLYZING | SolidMaterial.MatFlags.MORTAR_GRINDABLE | Material.MatFlags.FLAMMABLE | DustMaterial.MatFlags.NO_SMELTING | DustMaterial.MatFlags.NO_SMASHING);
        LigniteCoke.setBurnTime(2400);
        
        MVSuperconductorBase.setCableProperties(128, 1, 2);
        HVSuperconductorBase.setCableProperties(512, 1, 2);
        EVSuperconductorBase.setCableProperties(2048, 2, 2);
        IVSuperconductorBase.setCableProperties(8192, 2, 2);
        LuVSuperconductorBase.setCableProperties(32768, 4, 2);
        ZPMSuperconductorBase.setCableProperties(131072, 4, 2);
        
        Materials.NiobiumTitanium.setFluidPipeProperties(450, 2900, true);
        Enderium.setFluidPipeProperties(650, 1500, true);
        Materials.Naquadah.setFluidPipeProperties(1000, 19000, true);
        Neutronium.setFluidPipeProperties(2800, 1000000, true);

		Materials.RedSteel.addFlag(SolidMaterial.MatFlags.GENERATE_FRAME | SolidMaterial.MatFlags.GENERATE_GEAR);
        
        Materials.Mica.addFlag(DustMaterial.MatFlags.GENERATE_ORE);
        Materials.Asbestos.addFlag(DustMaterial.MatFlags.GENERATE_ORE);
        Materials.Kaolinite.addFlag(DustMaterial.MatFlags.GENERATE_ORE);
        
        Materials.Naquadah.addFlag(IngotMaterial.MatFlags.GENERATE_FOIL);
        Materials.NaquadahEnriched.addFlag(IngotMaterial.MatFlags.GENERATE_FOIL);
        Materials.Duranium.addFlag(IngotMaterial.MatFlags.GENERATE_FOIL);
        Materials.Graphene.addFlag(IngotMaterial.MatFlags.GENERATE_FOIL);
        
        // For impellers
        Materials.Plastic.addFlag(IngotMaterial.MatFlags.GENERATE_ROTOR);
        
        Materials.GreenSapphire.addFlag(DustMaterial.MatFlags.GENERATE_PLATE);
        
        Materials.Apatite.addFlag(SolidMaterial.MatFlags.GENERATE_ROD);
        
        Materials.Rubber.addFlag(IngotMaterial.MatFlags.GENERATE_BOLT_SCREW);
        Materials.Apatite.addFlag(IngotMaterial.MatFlags.GENERATE_BOLT_SCREW);
        
        Materials.Tritanium.addFlag(SolidMaterial.MatFlags.GENERATE_FRAME);
        
        Materials.NitroFuel.addFlag(Material.MatFlags.DISABLE_DECOMPOSITION);
        Materials.Ash.addFlag(Material.MatFlags.DISABLE_DECOMPOSITION);
        
        OrePrefix.gemChipped.setIgnored(LigniteCoke);
        OrePrefix.gemFlawed.setIgnored(LigniteCoke);
        OrePrefix.gemFlawless.setIgnored(LigniteCoke);
        OrePrefix.gemExquisite.setIgnored(LigniteCoke);
	}

	@Override
	public void onMaterialsInit() {}

}
