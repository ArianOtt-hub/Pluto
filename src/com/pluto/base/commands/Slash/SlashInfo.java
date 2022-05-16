package com.pluto.base.commands.Slash;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.interactions.commands.Command;
import net.dv8tion.jda.api.interactions.commands.OptionType;
import net.dv8tion.jda.api.interactions.commands.build.Commands;
import net.dv8tion.jda.api.interactions.commands.build.OptionData;
import net.dv8tion.jda.api.interactions.commands.build.SubcommandGroupData;

public class SlashInfo {
    private JDA jda;

    public SlashInfo(JDA jda){
        this.jda = jda;
        init();
    }
    private void init(){
        Guild guild = jda.getGuildById("965326621873700905");
      guild.updateCommands().addCommands(
                Commands.slash("echo", "Repeats messages back to you.")
                        .addOption(OptionType.STRING, "message", "The message to repeat.")
                        .addOption(OptionType.INTEGER, "times", "The number of times to repeat the message.")
                        .addOption(OptionType.BOOLEAN, "ephemeral", "Whether or not the message should be sent as an ephemeral message."),
                Commands.slash("animal", "Finds a random animal")
                        .addOptions(
                                new OptionData(OptionType.STRING, "type", "The type of animal to find")
                                        .addChoice("Bird", "bird")
                                        .addChoice("Big Cat", "bigcat")
                                        .addChoice("Canine", "canine")
                                        .addChoice("Fish", "fish")
                        ),
                Commands.slash("mute","Mutes a certain user")


                        .addOptions(
                                new OptionData(OptionType.MENTIONABLE, "user", "Please mention a user", true),
                        new OptionData(OptionType.NUMBER, "temporal_timeout", "Will mute the user for a specific amount of time", true),

                        new OptionData(OptionType.STRING, "reason", "WIll send the muted user a specific description of his mute", true)



                ),
                Commands.slash("info", "says Hi"),
                Commands.context(Command.Type.USER, "Info"),
                Commands.context(Command.Type.USER, "Mute"),
                Commands.context(Command.Type.USER, "Kick"),
                Commands.context(Command.Type.USER,"Ban"),

                Commands.message("Delete"),
                Commands.message("Pin"),
                Commands.message("Announce")

        ).queue();



    }
}
