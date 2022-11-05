package me.dev.zennyel;

import org.bukkit.plugin.java.JavaPlugin;

public final class Punishiment extends JavaPlugin {

    @Override
    public void onEnable() {


    }
    @Override
    public void onDisable() {

    }

    public static Punishiment getInstance() {
        return JavaPlugin.getPlugin(Punishiment.class);
    }


}
