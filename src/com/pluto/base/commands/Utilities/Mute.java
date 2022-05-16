package com.pluto.base.commands.Utilities;

import com.pluto.base.Main;
import com.pluto.base.commands.Command;
import net.dv8tion.jda.api.entities.Mentions;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.events.role.RoleCreateEvent;
import net.dv8tion.jda.api.interactions.commands.OptionMapping;
import net.dv8tion.jda.api.managers.RoleManager;
import net.dv8tion.jda.api.requests.restaction.RoleAction;
import net.dv8tion.jda.internal.requests.Route;
import org.jetbrains.annotations.NotNull;

import javax.management.relation.Role;
import java.util.concurrent.TimeUnit;

public class Mute extends Command {


    public Mute() {

    }


    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        Message message = event.getMessage();
        MessageChannel channel = event.getChannel();
        String content = message.getContentRaw();

        if (content.equals(Main.prefix + "mute")) {
            message.delete().queue();
            channel.sendTyping().completeAfter(3, TimeUnit.SECONDS);
            channel.sendMessage("For how long do you want to mute this person?").queue();

        }
    }

    @Override
    public void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent event) {
        if (event.getName().equals("Mute")) {
            try {
                OptionMapping optionMapping = event.getOption("user");
                if (optionMapping == null) {
                    event.reply("For some reason, the command is incomplete. Please provide valid arguments");
                }
                event.deferReply(true).queue();
                Mentions mentions = optionMapping.getMentions();
                String a = mentions.toString();
                event.getMember(a).timeoutFor(10, TimeUnit.MINUTES).queue();
            } catch (IllegalStateException e) {
                event.getChannel().sendMessage("Oups something went wrong.. <@" + event.getMember().getIdLong() + "> \nIs this message sent into the discord server? Try it again there!").queue();
            }
        }

    }
}
