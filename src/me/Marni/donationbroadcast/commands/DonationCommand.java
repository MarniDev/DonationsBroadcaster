package me.Marni.donationbroadcast.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 * Created by Spearhartt on 2/14/2017.
 */
public class DonationCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if (cmd.getName().equalsIgnoreCase("BDonation")) {
            if (args.length == 0) {
                ((CommandSender) sender).sendMessage("Incorrect usage!" + ChatColor.DARK_RED + "Please use /Bdonation <username> <rank> !");
                return true;
            }
        }
        if (cmd.getName().equalsIgnoreCase("BDonation")) {
            if (args.length == 1) {
                ((CommandSender) sender).sendMessage("Incorrect usage!" + ChatColor.DARK_RED + "Please use /Bdonation <username> <rank> !");
                return true;
            }
        }
        if (cmd.getName().equalsIgnoreCase("BDonation")) {
            if (args.length == 2) {
                Bukkit.getServer().broadcastMessage(args[0] + "Just bought" + args[1] + "on our website!");
                return true;
            }
        }

        return false;
    }
}
