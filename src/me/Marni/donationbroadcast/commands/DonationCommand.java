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

    /** This handles the commmand sent when a player uses "/BDonation" */
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        /** A switch statement changes depending on the value returned by the operation */
        switch (args.length) {
            /** In this case, when the args.length == 2 it will execute the contained code */
            case 2:
                Bukkit.getServer().broadcastMessage(args[0] + "Just bought" + args[1] + "on our website!");
                return true; //Return true when the command succeeds
            /** In ALL OTHER CASES, this is the code that will execute */
            default:
                sender.sendMessage("Incorrect usage!" + ChatColor.DARK_RED + "Please use /Bdonation <username> <rank> !");
                return false; //Return false when the command fails
        }
    }
}
