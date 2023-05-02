package derp.legacywool.screen;

import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;

public class ModScreenHandlers {
    public static ScreenHandlerType<WoolConverterScreenHandler> WOOL_CONVERTER_SCREEN_HANDLER;

    public static void registerAllScreenHandlers() {
        WOOL_CONVERTER_SCREEN_HANDLER = new ScreenHandlerType<>(WoolConverterScreenHandler::new);
    }
}
