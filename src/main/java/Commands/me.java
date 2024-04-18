package Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class me implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        int distanceSquared = 100*100;

        List<Player> pl = new ArrayList<>();
        for(Player p: Bukkit.getOnlinePlayers()){
            if(p.getLocation().distanceSquared(p.getLocation()) < distanceSquared)
                pl.add(p);
        }

        String msg = String.join(" ",args);
        msg = ChatColor.translateAlternateColorCodes('&',msg);

        for(Player player: pl){
            Player senderpl = (Player) sender;

            player.sendMessage(ChatColor.GRAY+"*"+senderpl.getName()+": "+ChatColor.WHITE+msg+ChatColor.GRAY+"*");
        }

        return true;
    }
}
