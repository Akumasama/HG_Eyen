package me.SimulaCraft;

import net.md_5.bungee.api.ChatColor;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class HGV extends JavaPlugin{

	
	public void onEnable(){
		this.getLogger().info("Plugin Enabled!");
	}
	
	
	public void onDisable(){
		this.getLogger().info("Plugin Disabled!");
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args ){
		
		if(sender instanceof Player){
			Player p = (Player) sender;
			if(cmd.getName().equalsIgnoreCase("ping")){
				
				p.sendMessage(ChatColor.GREEN+"Hello we are writing a new great plugin!");
				p.damage(2.0);
				
				return true;
			}
			
		}
		
		return false;
	}
}