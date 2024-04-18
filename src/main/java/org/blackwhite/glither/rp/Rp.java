package org.blackwhite.glither.rp;

import Commands.gme;
import Commands.me;
import Commands.tries;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.Map;

public final class Rp extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("me").setExecutor(new me());
        getCommand("gme").setExecutor(new gme());
        getCommand("try").setExecutor(new tries());

    }

    @Override
    public void onDisable() {

    }
}




