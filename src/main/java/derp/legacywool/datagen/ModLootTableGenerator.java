package derp.legacywool.datagen;

import derp.legacywool.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {

    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.BLACK_WOOL);
        addDrop(ModBlocks.BLUE_WOOL);
        addDrop(ModBlocks.BROWN_WOOL);
        addDrop(ModBlocks.CYAN_WOOL);
        addDrop(ModBlocks.GRAY_WOOL);
        addDrop(ModBlocks.GREEN_WOOL);
        addDrop(ModBlocks.LIGHT_BLUE_WOOL);
        addDrop(ModBlocks.LIGHT_GRAY_WOOL);
        addDrop(ModBlocks.LIME_WOOL);
        addDrop(ModBlocks.MAGENTA_WOOL);
        addDrop(ModBlocks.ORANGE_WOOL);
        addDrop(ModBlocks.PINK_WOOL);
        addDrop(ModBlocks.PURPLE_WOOL);
        addDrop(ModBlocks.RED_WOOL);
        addDrop(ModBlocks.WHITE_WOOL);
        addDrop(ModBlocks.YELLOW_WOOL);
        
        addDrop(ModBlocks.BLACK_WOOL_CARPET);
        addDrop(ModBlocks.BLUE_WOOL_CARPET);
        addDrop(ModBlocks.BROWN_WOOL_CARPET);
        addDrop(ModBlocks.CYAN_WOOL_CARPET);
        addDrop(ModBlocks.GRAY_WOOL_CARPET);
        addDrop(ModBlocks.GREEN_WOOL_CARPET);
        addDrop(ModBlocks.LIGHT_BLUE_WOOL_CARPET);
        addDrop(ModBlocks.LIGHT_GRAY_WOOL_CARPET);
        addDrop(ModBlocks.LIME_WOOL_CARPET);
        addDrop(ModBlocks.MAGENTA_WOOL_CARPET);
        addDrop(ModBlocks.ORANGE_WOOL_CARPET);
        addDrop(ModBlocks.PINK_WOOL_CARPET);
        addDrop(ModBlocks.PURPLE_WOOL_CARPET);
        addDrop(ModBlocks.RED_WOOL_CARPET);
        addDrop(ModBlocks.WHITE_WOOL_CARPET);
        addDrop(ModBlocks.YELLOW_WOOL_CARPET);

        addDrop(ModBlocks.CAPRI_CLOTH);
        addDrop(ModBlocks.CHARTREUSE_CLOTH);
        addDrop(ModBlocks.CYAN_CLOTH);
        addDrop(ModBlocks.DARK_GRAY_CLOTH);
        addDrop(ModBlocks.GREEN_CLOTH);
        addDrop(ModBlocks.LIGHT_GRAY_CLOTH);
        addDrop(ModBlocks.MAGENTA_CLOTH);
        addDrop(ModBlocks.ORANGE_CLOTH);
        addDrop(ModBlocks.PURPLE_CLOTH);
        addDrop(ModBlocks.RED_CLOTH);
        addDrop(ModBlocks.ROSE_CLOTH);
        addDrop(ModBlocks.SPRING_GREEN_CLOTH);
        addDrop(ModBlocks.ULTRAMARINE_CLOTH);
        addDrop(ModBlocks.VIOLET_CLOTH);
        addDrop(ModBlocks.WHITE_CLOTH);
        addDrop(ModBlocks.YELLOW_CLOTH);

        addDrop(ModBlocks.CAPRI_CLOTH_CARPET);
        addDrop(ModBlocks.CHARTREUSE_CLOTH_CARPET);
        addDrop(ModBlocks.CYAN_CLOTH_CARPET);
        addDrop(ModBlocks.DARK_GRAY_CLOTH_CARPET);
        addDrop(ModBlocks.GREEN_CLOTH_CARPET);
        addDrop(ModBlocks.LIGHT_GRAY_CLOTH_CARPET);
        addDrop(ModBlocks.MAGENTA_CLOTH_CARPET);
        addDrop(ModBlocks.ORANGE_CLOTH_CARPET);
        addDrop(ModBlocks.PURPLE_CLOTH_CARPET);
        addDrop(ModBlocks.RED_CLOTH_CARPET);
        addDrop(ModBlocks.ROSE_CLOTH_CARPET);
        addDrop(ModBlocks.SPRING_GREEN_CLOTH_CARPET);
        addDrop(ModBlocks.ULTRAMARINE_CLOTH_CARPET);
        addDrop(ModBlocks.VIOLET_CLOTH_CARPET);
        addDrop(ModBlocks.WHITE_CLOTH_CARPET);
        addDrop(ModBlocks.YELLOW_CLOTH_CARPET);
    }
}