package eu.coverxprojects.Staff;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ScCommand
  implements CommandExecutor
{
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
  {
    if (sender.hasPermission("coverxprojects.staffchat"))
    {
      String message = "";
      String[] arrayOfString;
      int j = (arrayOfString = args).length;
      for (int i = 0; i < j; i++)
      {
        String word = arrayOfString[i];
        message = message + word + " ";
      }
      for (Player player : Bukkit.getOnlinePlayers()) {
        if (player.hasPermission("coverxprojects.staffchat")) {
          player.sendMessage(Config.format.replace("%player%", sender.getName()).replace("%message%", message));
        }
      }
    }
    else
    {
      sender.sendMessage(Config.insufficient_permission);
    }
    return true;
  }
}
