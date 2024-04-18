package Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class gme implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(args.length < 1){
            sender.sendMessage(ChatColor.RED+"gme не может быть пустым!");
            return true;
        }

        String msg = String.join(" ",args);
        msg = ChatColor.translateAlternateColorCodes('&',msg);

        Bukkit.getServer().broadcastMessage(ChatColor.WHITE +"*" + sender.getName() + ": " + msg + "*");

        return true;
    }
}
