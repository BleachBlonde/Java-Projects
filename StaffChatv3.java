package me.BleachBlonde.StaffChatv3;

import java.util.logging.Logger;
import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class StaffChatv3 extends JavaPlugin
{
  public static final Logger logger = Logger.getLogger("Minecraft.StaffChat");

  public void onEnable() {
    logger.info("[StaffChat] enabled!");
  }

  public void onDisable() {
    logger.info("[StaffChat] disabled!");
  }

  public boolean canReadAdminChat(Player p) {
    if ((p.hasPermission("Staffchat.readwrite")) || (p.isOp()))
      return true;
    return p.isOp();
  }

  public static String FinalMessage(String[] args, int start) {
    StringBuilder msg = new StringBuilder();
    for (int i = start; i < args.length; i++) {
      if (i != start) {
        msg.append(" ");
      }
      msg.append(args[i]);
    }
    return msg.toString();
  }

  public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
  {
    Player player = (Player)sender;
    String msg = FinalMessage(args, 0);
    if (((commandLabel.equalsIgnoreCase("a")) && (player.hasPermission("Staffchat.readwrite"))) || (player.isOp())) {
      if (args.length > 0) {
        for (Player p : getServer().getOnlinePlayers())
          if (canReadAdminChat(p)) {
            p.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_RED + "StaffChat" + ChatColor.DARK_GRAY + "] " + ChatColor.GOLD + player.getDisplayName() + ": " + ChatColor.RED + msg);
            logger.info("[StaffChat] " + player.getDisplayName() + ": " + msg);
          }
      }
      else {
        player.sendMessage(ChatColor.RED + "[StaffChat] Usage: /a <your message> (without <>)");
      }
    }
    return false;
  }
}