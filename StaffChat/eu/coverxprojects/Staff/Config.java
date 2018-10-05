package eu.coverxprojects.Staff;

import org.bukkit.ChatColor;
import org.bukkit.plugin.Plugin;

public class Config
{
  public static String format = "(Staff) %player% %message%";
  public static String insufficient_permission = "Insufficient permission.";
  
  public static void load(Plugin plugin)
  {
    if (plugin.getConfig().isSet("format")) {
      format = ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("format"));
    }
    if (plugin.getConfig().isSet("insufficient-permission")) {
      insufficient_permission = ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("insufficient-permission"));
    }
  }
  
  public static void save(Plugin plugin)
  {
    plugin.getConfig().set("format", format);
    plugin.getConfig().set("insufficient-permission", insufficient_permission);
    
    plugin.saveConfig();
  }
}
