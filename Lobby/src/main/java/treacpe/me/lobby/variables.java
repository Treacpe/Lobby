package treacpe.me.lobby;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Collections;
import java.util.List;

public class variables {

    public static ItemStack gameMenuHotbar(){
        ItemStack item = new ItemStack(Material.COMPASS, 1);
        ItemMeta data = item.getItemMeta();
        if (data != null) {
            data.setDisplayName("Game Menu (Right Click)");
            data.setLore(List.of("Right Click to bring up the Game Menu!"));
            item.setItemMeta(data);
        }
        return gameMenuHotbar();
    }

    public static ItemStack myProfileHotbar(){
        ItemStack item = new ItemStack(Material.PLAYER_HEAD, 1);
        ItemMeta data = item.getItemMeta();
        if (data != null) {
            data.setDisplayName("My Profile (Right Click)");
            data.setLore(List.of("Right-click to browse quests, view achievements" ,
                                 "activate Network Boosters and more!"));
            item.setItemMeta(data);
        }
        return gameMenuHotbar();
    }

    public static ItemStack shopHotbar(){
        ItemStack item = new ItemStack(Material.EMERALD, 1);
        ItemMeta data = item.getItemMeta();
        if (data != null) {
            data.setDisplayName("Shop (Right Click");
            data.setLore(List.of("Tokens: " + "shopTokens(Comming Soon)"));
            item.setItemMeta(data);
        }
        return shopHotbar();
    }

    public static  ItemStack collectiblesHotbar(){
        ItemStack item = new ItemStack(Material.CHEST, 1);
        ItemMeta data = item.getItemMeta();
        if (data != null) {
            data.setDisplayName("Collectibles (Right Click)");
            data.setLore(List.of("Mystery Dust: " + "(comming soon)",
                                 "Collect fun cosmetic items! Unlock new items",
                                 "using " + "Mystery Dust " + "or hitting milestone",
                                 "rewards.",
                                 " ",
                                 "Mystery Dust" + " is randomly given after playing",
                                 "games."));
        }
        return collectiblesHotbar();
    }

}
