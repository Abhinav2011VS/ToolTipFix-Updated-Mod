package net.abhinav.tooltipfix;

import com.mojang.logging.LogUtils;
import net.fabricmc.api.ModInitializer;

public class ToolTipFix implements ModInitializer {

    @Override
    public void onInitialize() {
        ModConfig.enableTooltipWrapping = true;

        LogUtils.getLogger().info("ToolTipFix loaded!");
    }
}
