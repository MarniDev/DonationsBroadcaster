package me.Marni.donationbroadcast;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class DonationBroadcast extends JavaPlugin  {
	
	public void onEnable(){
		Bukkit.getServer().getLogger().info("Donation broadcasts are now enabled!");
		
	}
	public void OnDisable(){
		Bukkit.getServer().getLogger().info("Donation broadcasts are now disabled!");
	}
   

		
		
	public boolean onCommand(Command sender, Command cmd, String commandLabel, String[] args)	{
		
		if (cmd.getName().equalsIgnoreCase("BDonation")){
			if (args.length == 0){
				((CommandSender) sender).sendMessage("Incorrect usage!" + ChatColor.DARK_RED + "Please use /Bdonation <username> <rank> !");
				return true;
			}							
			}
		if (cmd.getName().equalsIgnoreCase("BDonation")){
			if (args.length == 1){
				((CommandSender) sender).sendMessage("Incorrect usage!" + ChatColor.DARK_RED + "Please use /Bdonation <username> <rank> !");
				return true;
			}
		}
		if (cmd.getName().equalsIgnoreCase("BDonation")){
			if (args.length == 2){
				Bukkit.getServer().broadcastMessage(args[0] + "Just bought" + args[1] + "on our website!");
				return true;
			}
		}	
			
		
			
			
		
		return true;
		
		
	}
	

}
