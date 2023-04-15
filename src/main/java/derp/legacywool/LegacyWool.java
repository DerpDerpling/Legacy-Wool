package derp.legacywool;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LegacyWool implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("legacy-wool");
	//classic wool
	public static final Block CAPRI_CLOTH = new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL)));
	public static final Block CHARTREUSE_CLOTH = new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL)));
	public static final Block CYAN_CLOTH = new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL)));
	public static final Block DARK_GRAY_CLOTH = new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL)));
	public static final Block GREEN_CLOTH = new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL)));
	public static final Block LIGHT_GRAY_CLOTH = new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL)));
	public static final Block MAGENTA_CLOTH = new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL)));
	public static final Block ORANGE_CLOTH = new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL)));
	public static final Block PURPLE_CLOTH = new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL)));
	public static final Block RED_CLOTH = new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL)));
	public static final Block ROSE_CLOTH = new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL)));
	public static final Block SPRING_GREEN_CLOTH = new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL)));
	public static final Block ULTRAMARINE_CLOTH = new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL)));
	public static final Block VIOLET_CLOTH = new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL)));
	public static final Block LIME_CLOTH = new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL)));
	public static final Block PINK_CLOTH = new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL)));
	public static final Block WHITE_CLOTH = new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL)));
	public static final Block YELLOW_CLOTH = new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL)));

	//old wool
	public static final Block BLACK_WOOL = new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL)));
	public static final Block BLUE_WOOL = new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL)));
	public static final Block BROWN_WOOL = new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL)));
	public static final Block CYAN_WOOL = new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL)));
	public static final Block GRAY_WOOL = new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL)));
	public static final Block GREEN_WOOL = new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL)));
	public static final Block LIGHT_BLUE_WOOL = new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL)));
	public static final Block LIGHT_GRAY_WOOL = new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL)));
	public static final Block LIME_WOOL = new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL)));
	public static final Block MAGENTA_WOOL = new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL)));
	public static final Block ORANGE_WOOL = new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL)));
	public static final Block PINK_WOOL = new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL)));
	public static final Block PURPLE_WOOL = new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL)));
	public static final Block RED_WOOL = new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL)));
	public static final Block WHITE_WOOL = new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL)));
	public static final Block YELLOW_WOOL = new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds((BlockSoundGroup.WOOL)));



	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		LOGGER.info("Hello Fabric world!");
		//old wool
		Registry.register(Registries.BLOCK, new Identifier("legacywool", "black_wool"), BLACK_WOOL);
		Registry.register(Registries.BLOCK, new Identifier("legacywool", "blue_wool"), BLUE_WOOL);
		Registry.register(Registries.BLOCK, new Identifier("legacywool", "brown_wool"), BROWN_WOOL);
		Registry.register(Registries.BLOCK, new Identifier("legacywool", "cyan_wool"), CYAN_WOOL);
		Registry.register(Registries.BLOCK, new Identifier("legacywool", "gray_wool"), GRAY_WOOL);
		Registry.register(Registries.BLOCK, new Identifier("legacywool", "green_wool"), GREEN_WOOL);
		Registry.register(Registries.BLOCK, new Identifier("legacywool", "light_blue_wool"), LIGHT_BLUE_WOOL);
		Registry.register(Registries.BLOCK, new Identifier("legacywool", "light_gray_wool"), LIGHT_GRAY_WOOL);
		Registry.register(Registries.BLOCK, new Identifier("legacywool", "lime_wool"), LIME_WOOL);
		Registry.register(Registries.BLOCK, new Identifier("legacywool", "magenta_wool"), MAGENTA_WOOL);
		Registry.register(Registries.BLOCK, new Identifier("legacywool", "orange_wool"), ORANGE_WOOL);
		Registry.register(Registries.BLOCK, new Identifier("legacywool", "pink_wool"), PINK_WOOL);
		Registry.register(Registries.BLOCK, new Identifier("legacywool", "purple_wool"), PURPLE_WOOL);
		Registry.register(Registries.BLOCK, new Identifier("legacywool", "red_wool"), RED_WOOL);
		Registry.register(Registries.BLOCK, new Identifier("legacywool", "white_wool"), WHITE_WOOL);
		Registry.register(Registries.BLOCK, new Identifier("legacywool", "yellow_wool"), YELLOW_WOOL);

		//old items
		Registry.register(Registries.ITEM, new Identifier("legacywool", "black_wool"),new BlockItem(BLACK_WOOL, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("legacywool", "blue_wool"),new BlockItem(BLUE_WOOL, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("legacywool", "brown_wool"),new BlockItem(BROWN_WOOL, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("legacywool", "cyan_wool"),new BlockItem(CYAN_WOOL, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("legacywool", "gray_wool"),new BlockItem(GRAY_WOOL, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("legacywool", "green_wool"),new BlockItem(GREEN_WOOL, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("legacywool", "light_blue_wool"),new BlockItem(LIGHT_BLUE_WOOL, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("legacywool", "light_gray_wool"),new BlockItem(LIGHT_GRAY_WOOL, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("legacywool", "lime_wool"),new BlockItem(LIME_WOOL, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("legacywool", "magenta_wool"),new BlockItem(MAGENTA_WOOL, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("legacywool", "orange_wool"),new BlockItem(ORANGE_WOOL, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("legacywool", "pink_wool"),new BlockItem(PINK_WOOL, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("legacywool", "purple_wool"),new BlockItem(PURPLE_WOOL, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("legacywool", "red_wool"),new BlockItem(RED_WOOL, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("legacywool", "white_wool"),new BlockItem(WHITE_WOOL, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("legacywool", "yellow_wool"),new BlockItem(YELLOW_WOOL, new FabricItemSettings()));

		//classic blocks
		Registry.register(Registries.BLOCK, new Identifier("legacywool", "red_cloth"), RED_CLOTH);
		Registry.register(Registries.BLOCK, new Identifier("legacywool", "white_cloth"), WHITE_CLOTH);
		Registry.register(Registries.BLOCK, new Identifier("legacywool", "yellow_cloth"), YELLOW_CLOTH);
		Registry.register(Registries.BLOCK, new Identifier("legacywool", "purple_cloth"), PURPLE_CLOTH);
		Registry.register(Registries.BLOCK, new Identifier("legacywool", "pink_cloth"), PINK_CLOTH);
		Registry.register(Registries.BLOCK, new Identifier("legacywool", "orange_cloth"), ORANGE_CLOTH);
		Registry.register(Registries.BLOCK, new Identifier("legacywool", "magenta_cloth"), MAGENTA_CLOTH);
		Registry.register(Registries.BLOCK, new Identifier("legacywool", "lime_cloth"), LIME_CLOTH);
		Registry.register(Registries.BLOCK, new Identifier("legacywool", "ultramarine_cloth"), ULTRAMARINE_CLOTH);
		Registry.register(Registries.BLOCK, new Identifier("legacywool", "light_gray_cloth"), LIGHT_GRAY_CLOTH);
		Registry.register(Registries.BLOCK, new Identifier("legacywool", "green_cloth"), GREEN_CLOTH);
		Registry.register(Registries.BLOCK, new Identifier("legacywool", "spring_green_cloth"), SPRING_GREEN_CLOTH);
		Registry.register(Registries.BLOCK, new Identifier("legacywool", "rose_cloth"), ROSE_CLOTH);
		Registry.register(Registries.BLOCK, new Identifier("legacywool", "cyan_cloth"), CYAN_CLOTH);
		Registry.register(Registries.BLOCK, new Identifier("legacywool", "violet_cloth"), VIOLET_CLOTH);
		Registry.register(Registries.BLOCK, new Identifier("legacywool", "chartreuse_cloth"), CHARTREUSE_CLOTH);
		Registry.register(Registries.BLOCK, new Identifier("legacywool", "capri_cloth"), CAPRI_CLOTH);
		Registry.register(Registries.BLOCK, new Identifier("legacywool", "dark_gray_cloth"), DARK_GRAY_CLOTH);


		//classic items

		Registry.register(Registries.ITEM, new Identifier("legacywool", "red_cloth"),new BlockItem(RED_CLOTH, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("legacywool", "white_cloth"),new BlockItem(WHITE_CLOTH, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("legacywool", "yellow_cloth"),new BlockItem(YELLOW_CLOTH, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("legacywool", "purple_cloth"),new BlockItem(PURPLE_CLOTH, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("legacywool", "pink_cloth"),new BlockItem(PINK_CLOTH, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("legacywool", "orange_cloth"),new BlockItem(ORANGE_CLOTH, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("legacywool", "magenta_cloth"),new BlockItem(MAGENTA_CLOTH, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("legacywool", "lime_cloth"),new BlockItem(LIME_CLOTH, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("legacywool", "ultramarine_cloth"),new BlockItem(ULTRAMARINE_CLOTH, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("legacywool", "light_gray_cloth"),new BlockItem(LIGHT_GRAY_CLOTH, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("legacywool", "green_cloth"),new BlockItem(GREEN_CLOTH, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("legacywool", "spring_green_cloth"),new BlockItem(SPRING_GREEN_CLOTH, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("legacywool", "rose_cloth"),new BlockItem(ROSE_CLOTH, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("legacywool", "cyan_cloth"),new BlockItem(CYAN_CLOTH, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("legacywool", "violet_cloth"),new BlockItem(VIOLET_CLOTH, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("legacywool", "chartreuse_cloth"),new BlockItem(CHARTREUSE_CLOTH, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("legacywool", "capri_cloth"),new BlockItem(CAPRI_CLOTH, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("legacywool", "dark_gray_cloth"),new BlockItem(DARK_GRAY_CLOTH, new FabricItemSettings()));

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> content.addAfter(Items.PINK_WOOL, RED_CLOTH, ORANGE_CLOTH, YELLOW_CLOTH, CHARTREUSE_CLOTH, GREEN_CLOTH, SPRING_GREEN_CLOTH, CYAN_CLOTH, CAPRI_CLOTH, ULTRAMARINE_CLOTH, VIOLET_CLOTH, PURPLE_CLOTH, MAGENTA_CLOTH, ROSE_CLOTH, DARK_GRAY_CLOTH, LIGHT_GRAY_CLOTH, WHITE_CLOTH));
	}
}
		