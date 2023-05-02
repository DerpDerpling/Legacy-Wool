package derp.legacywool;

import derp.legacywool.block.ModBlocks;
import derp.legacywool.block.entity.ModBlockEntities;
import derp.legacywool.screen.ModScreenHandlers;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static derp.legacywool.block.ModBlocks.*;

public class LegacyWool implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("legacy-wool");
	public static final String MOD_ID = "legacywool";


	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		LOGGER.info("Hello Fabric world!");
		ModBlocks.registerModBlocks();
		ModBlockEntities.registerBlockEntites();
		ModScreenHandlers.registerAllScreenHandlers();

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> content.addAfter(Items.PINK_CARPET,
				//classic
				RED_CLOTH, ORANGE_CLOTH, YELLOW_CLOTH, CHARTREUSE_CLOTH, GREEN_CLOTH, SPRING_GREEN_CLOTH, CYAN_CLOTH,
				CAPRI_CLOTH, ULTRAMARINE_CLOTH, VIOLET_CLOTH, PURPLE_CLOTH, MAGENTA_CLOTH, ROSE_CLOTH, DARK_GRAY_CLOTH,
				LIGHT_GRAY_CLOTH, WHITE_CLOTH, RED_CLOTH_CARPET, ORANGE_CLOTH_CARPET, YELLOW_CLOTH_CARPET, CHARTREUSE_CLOTH_CARPET,
				GREEN_CLOTH_CARPET, SPRING_GREEN_CLOTH_CARPET, CYAN_CLOTH_CARPET, CAPRI_CLOTH_CARPET, ULTRAMARINE_CLOTH_CARPET,
				VIOLET_CLOTH_CARPET, PURPLE_CLOTH_CARPET, MAGENTA_CLOTH_CARPET, ROSE_CLOTH_CARPET, DARK_GRAY_CLOTH_CARPET, LIGHT_GRAY_CLOTH_CARPET,
				WHITE_CLOTH_CARPET,
				//old
				WHITE_WOOL, LIGHT_GRAY_WOOL, GRAY_WOOL, BLACK_WOOL, BROWN_WOOL, RED_WOOL, ORANGE_WOOL, YELLOW_WOOL, LIME_WOOL,
				GREEN_WOOL, CYAN_WOOL, LIGHT_BLUE_WOOL, BLUE_WOOL, PURPLE_WOOL, MAGENTA_WOOL, PINK_WOOL, WHITE_WOOL_CARPET, LIGHT_GRAY_WOOL_CARPET,
				GRAY_WOOL_CARPET, BLACK_WOOL_CARPET, BROWN_WOOL_CARPET, RED_WOOL_CARPET, ORANGE_WOOL_CARPET, YELLOW_WOOL_CARPET, LIME_WOOL_CARPET,
				GREEN_WOOL_CARPET, CYAN_WOOL_CARPET, LIGHT_BLUE_WOOL_CARPET, BLUE_WOOL_CARPET, PURPLE_WOOL_CARPET, MAGENTA_WOOL_CARPET,
				PINK_WOOL_CARPET));
	}
}
		