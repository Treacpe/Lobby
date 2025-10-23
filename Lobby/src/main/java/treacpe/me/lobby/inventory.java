package treacpe.me.lobby;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class inventory implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player player){

            player.getInventory().setItem(0, variables.gameMenuHotbar());
            player.getInventory().setItem(1, variables.myProfileHotbar());
            player.getInventory().setItem(2, variables.shopHotbar());
            player.getInventory().setItem(3, variables.collectiblesHotbar());

        }

        return true;
    }

}
