package me.Marni.donationbroadcast;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.permissions.Permission;
import org.bukkit.plugin.PluginManager;

public class Donationbroadcast extends JavaPlugin  {
    public Permission playerPermission = new Permission("Bdonation.use");

    public void onEnable(){
        Bukkit.getServer().getLogger().info("Donation broadcasts are now enabled!");

        this.getCommand("BDonation").setExecutor(new DonationCommand());
        PluginManager pm = getServer().getPluginManager();
        pm.addPermission(playerPermission);

    }
    public void OnDisable(){
        Bukkit.getServer().getLogger().info("Donation broadcasts are now disabled!");
    }

}
