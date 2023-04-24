package derp.legacywool.block;

import derp.legacywool.LegacyWool;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.CarpetBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
private static Block registerBlock(String name, Block block) {
    registerBlockItem(name, block);
    return Registry.register(Registries.BLOCK, new Identifier(LegacyWool.MOD_ID, name), block);
}

private static Item registerBlockItem (String name, Block block) {
    return Registry.register(Registries.ITEM, new Identifier(LegacyWool.MOD_ID, name),
            new BlockItem(block, new FabricItemSettings()));
}
    //classic wool
    public static final Block CAPRI_CLOTH = registerBlock("capri_cloth", new Block (FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL))));
    public static final Block CHARTREUSE_CLOTH = registerBlock("chartreuse_cloth", new Block (FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL))));
    public static final Block CYAN_CLOTH = registerBlock("cyan_cloth", new Block (FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL))));
    public static final Block DARK_GRAY_CLOTH = registerBlock("dark_gray_cloth", new Block (FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL))));
    public static final Block GREEN_CLOTH = registerBlock("green_cloth", new Block (FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL))));
    public static final Block LIGHT_GRAY_CLOTH = registerBlock("light_gray_cloth", new Block (FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL))));
    public static final Block MAGENTA_CLOTH = registerBlock("magenta_cloth", new Block (FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL))));
    public static final Block ORANGE_CLOTH = registerBlock("orange_cloth", new Block (FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL))));
    public static final Block PURPLE_CLOTH = registerBlock("purple_cloth", new Block (FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL))));
    public static final Block RED_CLOTH = registerBlock("red_cloth", new Block (FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL))));
    public static final Block ROSE_CLOTH = registerBlock("rose_cloth", new Block (FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL))));
    public static final Block SPRING_GREEN_CLOTH = registerBlock("spring_green_cloth", new Block (FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL))));
    public static final Block ULTRAMARINE_CLOTH = registerBlock("ultramarine_cloth", new Block (FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL))));
    public static final Block VIOLET_CLOTH = registerBlock("violet_cloth", new Block (FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL))));
    public static final Block WHITE_CLOTH = registerBlock("white_cloth", new Block (FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL))));
    public static final Block YELLOW_CLOTH = registerBlock("yellow_cloth", new Block (FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL))));

    public static final Block CAPRI_CLOTH_CARPET = registerBlock("capri_cloth_carpet", new CarpetBlock (FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL))));
    public static final Block CHARTREUSE_CLOTH_CARPET = registerBlock("chartreuse_cloth_carpet", new CarpetBlock(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL))));
    public static final Block CYAN_CLOTH_CARPET = registerBlock("cyan_cloth_carpet", new CarpetBlock (FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL))));
    public static final Block DARK_GRAY_CLOTH_CARPET = registerBlock("dark_gray_cloth_carpet", new CarpetBlock (FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL))));
    public static final Block GREEN_CLOTH_CARPET = registerBlock("green_cloth_carpet", new CarpetBlock (FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL))));
    public static final Block LIGHT_GRAY_CLOTH_CARPET = registerBlock("light_gray_cloth_carpet", new CarpetBlock (FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL))));
    public static final Block MAGENTA_CLOTH_CARPET = registerBlock("magenta_cloth_carpet", new CarpetBlock (FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL))));
    public static final Block ORANGE_CLOTH_CARPET = registerBlock("orange_cloth_carpet", new CarpetBlock (FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL))));
    public static final Block PURPLE_CLOTH_CARPET = registerBlock("purple_cloth_carpet", new CarpetBlock (FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL))));
    public static final Block RED_CLOTH_CARPET = registerBlock("red_cloth_carpet", new CarpetBlock (FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL))));
    public static final Block ROSE_CLOTH_CARPET = registerBlock("rose_cloth_carpet", new CarpetBlock (FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL))));
    public static final Block SPRING_GREEN_CLOTH_CARPET = registerBlock("spring_green_cloth_carpet", new CarpetBlock (FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL))));
    public static final Block ULTRAMARINE_CLOTH_CARPET = registerBlock("ultramarine_cloth_carpet", new CarpetBlock (FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL))));
    public static final Block VIOLET_CLOTH_CARPET = registerBlock("violet_cloth_carpet", new CarpetBlock (FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL))));
    public static final Block WHITE_CLOTH_CARPET = registerBlock("white_cloth_carpet", new CarpetBlock (FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL))));
    public static final Block YELLOW_CLOTH_CARPET = registerBlock("yellow_cloth_carpet", new CarpetBlock (FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL))));

    //old wool
    public static final Block BLACK_WOOL = registerBlock("black_wool", new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL))));
    public static final Block BLUE_WOOL = registerBlock("blue_wool", new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL))));
    public static final Block BROWN_WOOL = registerBlock("brown_wool", new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL))));
    public static final Block CYAN_WOOL = registerBlock("cyan_wool", new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL))));
    public static final Block GRAY_WOOL = registerBlock("gray_wool", new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL))));
    public static final Block GREEN_WOOL = registerBlock("green_wool", new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL))));
    public static final Block LIGHT_BLUE_WOOL = registerBlock("light_blue_wool", new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL))));
    public static final Block LIGHT_GRAY_WOOL = registerBlock("light_gray_wool", new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL))));
    public static final Block LIME_WOOL = registerBlock("lime_wool", new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL))));
    public static final Block MAGENTA_WOOL = registerBlock("magenta_wool", new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL))));
    public static final Block ORANGE_WOOL = registerBlock("orange_wool", new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL))));
    public static final Block PINK_WOOL = registerBlock("pink_wool", new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL))));
    public static final Block PURPLE_WOOL = registerBlock("purple_wool", new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL))));
    public static final Block RED_WOOL = registerBlock("red_wool", new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL))));
    public static final Block WHITE_WOOL = registerBlock("white_wool", new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL))));
    public static final Block YELLOW_WOOL = registerBlock("yellow_wool", new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL))));
    //old carpet
    public static final Block BLACK_WOOL_CARPET = registerBlock("black_wool_carpet", new CarpetBlock(FabricBlockSettings.of(Material.WOOL).strength(0.2f).sounds((BlockSoundGroup.WOOL))));
    public static final Block BLUE_WOOL_CARPET = registerBlock("blue_wool_carpet", new CarpetBlock(FabricBlockSettings.of(Material.WOOL).strength(0.2f).sounds((BlockSoundGroup.WOOL))));
    public static final Block BROWN_WOOL_CARPET = registerBlock("brown_wool_carpet", new CarpetBlock(FabricBlockSettings.of(Material.WOOL).strength(0.2f).sounds((BlockSoundGroup.WOOL))));
    public static final Block CYAN_WOOL_CARPET = registerBlock("cyan_wool_carpet", new CarpetBlock(FabricBlockSettings.of(Material.WOOL).strength(0.2f).sounds((BlockSoundGroup.WOOL))));
    public static final Block GRAY_WOOL_CARPET = registerBlock("gray_wool_carpet", new CarpetBlock(FabricBlockSettings.of(Material.WOOL).strength(0.2f).sounds((BlockSoundGroup.WOOL))));
    public static final Block GREEN_WOOL_CARPET = registerBlock("green_wool_carpet", new CarpetBlock(FabricBlockSettings.of(Material.WOOL).strength(0.2f).sounds((BlockSoundGroup.WOOL))));
    public static final Block LIGHT_BLUE_WOOL_CARPET = registerBlock("light_blue_wool_carpet", new CarpetBlock(FabricBlockSettings.of(Material.WOOL).strength(0.2f).sounds((BlockSoundGroup.WOOL))));
    public static final Block LIGHT_GRAY_WOOL_CARPET = registerBlock("light_gray_wool_carpet", new CarpetBlock(FabricBlockSettings.of(Material.WOOL).strength(0.2f).sounds((BlockSoundGroup.WOOL))));
    public static final Block LIME_WOOL_CARPET = registerBlock("lime_wool_carpet", new CarpetBlock(FabricBlockSettings.of(Material.WOOL).strength(0.2f).sounds((BlockSoundGroup.WOOL))));
    public static final Block MAGENTA_WOOL_CARPET = registerBlock("magenta_wool_carpet", new CarpetBlock(FabricBlockSettings.of(Material.WOOL).strength(0.2f).sounds((BlockSoundGroup.WOOL))));
    public static final Block ORANGE_WOOL_CARPET = registerBlock("orange_wool_carpet", new CarpetBlock(FabricBlockSettings.of(Material.WOOL).strength(0.2f).sounds((BlockSoundGroup.WOOL))));
    public static final Block PINK_WOOL_CARPET = registerBlock("pink_wool_carpet", new CarpetBlock(FabricBlockSettings.of(Material.WOOL).strength(0.2f).sounds((BlockSoundGroup.WOOL))));
    public static final Block PURPLE_WOOL_CARPET = registerBlock("purple_wool_carpet", new CarpetBlock(FabricBlockSettings.of(Material.WOOL).strength(0.2f).sounds((BlockSoundGroup.WOOL))));
    public static final Block RED_WOOL_CARPET = registerBlock("red_wool_carpet", new CarpetBlock(FabricBlockSettings.of(Material.WOOL).strength(0.2f).sounds((BlockSoundGroup.WOOL))));
    public static final Block WHITE_WOOL_CARPET = registerBlock("white_wool_carpet", new CarpetBlock(FabricBlockSettings.of(Material.WOOL).strength(0.2f).sounds((BlockSoundGroup.WOOL))));
    public static final Block YELLOW_WOOL_CARPET = registerBlock("yellow_wool_carpet", new CarpetBlock(FabricBlockSettings.of(Material.WOOL).strength(0.2f).sounds((BlockSoundGroup.WOOL))));

    public static void registerModBlocks() {
        LegacyWool.LOGGER.debug("Registering ModBlocks for " + LegacyWool.MOD_ID);
    }
}