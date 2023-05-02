package derp.legacywool.screen;

import derp.legacywool.LegacyWool;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class WoolConverterScreen extends HandledScreen<WoolConverterScreenHandler> {
    private static final Identifier TEXTURE = new Identifier(LegacyWool.MOD_ID, "textures/gui/wool_converter_gui.png");

    public WoolConverterScreen(WoolConverterScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }

    @Override
    protected void drawBackground(MatrixStack matrices, float delta, int mouseX, int mouseY) {

    }
}
