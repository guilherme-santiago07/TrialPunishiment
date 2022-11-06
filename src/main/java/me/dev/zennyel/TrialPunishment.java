package me.dev.zennyel;

import org.bukkit.plugin.java.JavaPlugin;

public final class TrialPunishment extends JavaPlugin {

    @Override
    public void onEnable() {


    }
    @Override
    public void onDisable() {

    }

    public static TrialPunishment getInstance() {
        return JavaPlugin.getPlugin(TrialPunishment.class);
    }


}
