package me.Marni.donationbroadcast;

import me.Marni.donationbroadcast.commands.DonationCommand;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class DonationBroadcast extends JavaPlugin  {
	
	public void onEnable(){
		Bukkit.getServer().getLogger().info("Donation broadcasts are now enabled!");

		this.getCommand("BDonation").setExecutor(new DonationCommand());
		
	}
	public void OnDisable(){
		Bukkit.getServer().getLogger().info("Donation broadcasts are now disabled!");
	}

}
