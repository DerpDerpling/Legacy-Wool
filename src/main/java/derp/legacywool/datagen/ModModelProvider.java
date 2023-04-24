package derp.legacywool.datagen;

import derp.legacywool.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.BLACK_WOOL, ModBlocks.BLACK_WOOL_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.BLUE_WOOL, ModBlocks.BLUE_WOOL_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.BROWN_WOOL, ModBlocks.BROWN_WOOL_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.CYAN_WOOL, ModBlocks.CYAN_WOOL_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.GRAY_WOOL, ModBlocks.GRAY_WOOL_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.GREEN_WOOL, ModBlocks.GREEN_WOOL_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.LIGHT_BLUE_WOOL, ModBlocks.LIGHT_BLUE_WOOL_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.LIGHT_GRAY_WOOL, ModBlocks.LIGHT_GRAY_WOOL_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.LIME_WOOL, ModBlocks.LIME_WOOL_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.MAGENTA_WOOL, ModBlocks.MAGENTA_WOOL_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.ORANGE_WOOL, ModBlocks.ORANGE_WOOL_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.PINK_WOOL, ModBlocks.PINK_WOOL_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.PURPLE_WOOL, ModBlocks.PURPLE_WOOL_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.RED_WOOL, ModBlocks.RED_WOOL_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.WHITE_WOOL, ModBlocks.WHITE_WOOL_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.YELLOW_WOOL, ModBlocks.YELLOW_WOOL_CARPET);


        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.CHARTREUSE_CLOTH, ModBlocks.CHARTREUSE_CLOTH_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.CYAN_CLOTH, ModBlocks.CYAN_CLOTH_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.DARK_GRAY_CLOTH, ModBlocks.DARK_GRAY_CLOTH_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.GREEN_CLOTH, ModBlocks.GREEN_CLOTH_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.LIGHT_GRAY_CLOTH, ModBlocks.LIGHT_GRAY_CLOTH_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.MAGENTA_CLOTH, ModBlocks.MAGENTA_CLOTH_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.ORANGE_CLOTH, ModBlocks.ORANGE_CLOTH_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.PURPLE_CLOTH, ModBlocks.PURPLE_CLOTH_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.RED_CLOTH, ModBlocks.RED_CLOTH_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.ROSE_CLOTH, ModBlocks.ROSE_CLOTH_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.SPRING_GREEN_CLOTH, ModBlocks.SPRING_GREEN_CLOTH_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.ULTRAMARINE_CLOTH, ModBlocks.ULTRAMARINE_CLOTH_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.VIOLET_CLOTH, ModBlocks.VIOLET_CLOTH_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.WHITE_CLOTH, ModBlocks.WHITE_CLOTH_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.YELLOW_CLOTH, ModBlocks.YELLOW_CLOTH_CARPET);
        
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
