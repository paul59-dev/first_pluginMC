package fr.paul.myfirstplugin;

import fr.paul.myfirstplugin.commands.CommandTest;
import org.bukkit.plugin.java.JavaPlugin;

public final class MyFirstPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Plugin started");
        getCommand("test").setExecutor(new CommandTest());
        getCommand("alert").setExecutor(new CommandTest());
        getServer().getPluginManager().registerEvents(new MonPluginListeners(), this);
    }

    @Override
    public void onDisable() {
        System.out.println("Plugin stopped");
    }
}
