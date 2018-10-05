package eu.coverxprojects.Staff;

import org.bukkit.plugin.java.JavaPlugin;

public class Main
  extends JavaPlugin
{
  public void onEnable()
  {
    Config.load(this);
    Config.save(this);
    
    getCommand("sc").setExecutor(new ScCommand());
  }
}
