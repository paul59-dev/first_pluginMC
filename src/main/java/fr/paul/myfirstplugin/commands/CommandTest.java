package fr.paul.myfirstplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandTest implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {

        if (commandSender instanceof Player) {
            Player player = (Player)commandSender;

            if(command.getName().equalsIgnoreCase("test")) {
                player.sendMessage("§eBravo tu as ressis §9le test");
                return true;
            }

            if(command.getName().equalsIgnoreCase("alert")) {
                // alert --> No args
                if(args.length == 0) {
                    player.sendMessage("La commande est : /alert <message>");
                }

                if(args.length >= 1) {
                    StringBuilder bc = new StringBuilder();
                    for(String part : args) {
                        bc.append(part + " ");
                    }

                    Bukkit.broadcastMessage("§9[" + player.getName() + "] " + "§e" + bc.toString());
                }
                return true;
            }
        }

        return false;
    }
}
