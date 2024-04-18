package Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;

public class tries implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender,Command command, String label, String[] args) {
        double random = Math.random()*100;
        short distanceSquared = 100*100;

        List<Player> pl = new ArrayList<>();
        for(Player p: Bukkit.getOnlinePlayers()){
            if(p.getLocation().distanceSquared(p.getLocation()) < distanceSquared)
                pl.add(p);
        }

        String msg = String.join(" ",args);
        msg = ChatColor.translateAlternateColorCodes('&',msg);

        if(random < 50){
            for(Player p: pl){
                Player j = (Player) sender;
                p.sendMessage(ChatColor.GRAY+"*"+j.getName()+": "+msg+ChatColor.GREEN+" [Успешно]");
            }
        } else{
            for(Player p: pl){
                Player j = (Player) sender;
                p.sendMessage(ChatColor.GRAY+"*"+j.getName()+": "+msg+ChatColor.RED+" [Неуспешно]");
            }
        }

        return true;
    }

}
