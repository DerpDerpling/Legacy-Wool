package derp.legacywool.block.entity;

import derp.legacywool.LegacyWool;
import derp.legacywool.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static BlockEntityType<WoolConverterBlockEntity> WOOL_CONVERTER;

    public static void registerBlockEntites() {
        WOOL_CONVERTER = Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier
                (LegacyWool.MOD_ID, "wool_converter"),
                FabricBlockEntityTypeBuilder.create(WoolConverterBlockEntity::new,
                ModBlocks.WOOL_CONVERTER).build(null));
    }
}
