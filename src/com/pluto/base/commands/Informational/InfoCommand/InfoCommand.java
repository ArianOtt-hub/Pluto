package com.pluto.base.commands.Informational.InfoCommand;

import com.pluto.base.Main;
import com.pluto.base.commands.Command;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.events.interaction.command.UserContextInteractionEvent;
import net.dv8tion.jda.api.events.interaction.component.SelectMenuInteractionEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.interactions.commands.SlashCommandInteraction;
import org.jetbrains.annotations.NotNull;

import java.time.Duration;

public class InfoCommand extends Command {
    EmbedBuilderTool embed = new EmbedBuilderTool("Information",
            "Arian Ott",
            "https://gist.github.com/zekroTJA/c8ed671204dafbbdf89c36fc3a1827e1",
            "https://media.idownloadblog.com/wp-content/uploads/2021/09/Apple-September-Event-California-Streaming-BasicAppleGuy-iDownloadBlog-6K-No-Logo.png",
            "This is the Infor Window",
            "General", "Lol0", true, "FOOR", "https://media.idownloadblog.com/wp-content/uploads/2021/09/Apple-September-Event-California-Streaming-BasicAppleGuy-iDownloadBlog-6K-No-Logo.png",
            "https://media.idownloadblog.com/wp-content/uploads/2021/09/Apple-September-Event-California-Streaming-BasicAppleGuy-iDownloadBlog-6K-No-Logo.png");

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        Message message = event.getMessage();
        String content = message.getContentRaw();

        if (content.equals(Main.prefix + "info")) {
            try {
                message.delete().queue();

                event.getChannel().sendTyping().delay(Duration.ofSeconds(4));

                MessageChannel channel = event.getGuildChannel();

                channel.sendMessageEmbeds(embed.eb1.build()).queue();



            } catch (IllegalStateException ex) {
                event.getChannel().sendMessage("Oups something went wrong.. <@" + event.getAuthor().getIdLong() + "> \nIs this message sent into the discord server? Try it again there!").queue();
            }


        }
    }
private int messageID;
    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {



        if (event.getName().equals("info")) {
            event.deferReply(true).queue(); // Tell discord we received the command, send a thinking... message to the user

            System.out.println("HI");
            MessageChannel channel = event.getChannel();
            channel.sendMessageEmbeds(embed.eb1.build()).queue();


        }
    }

    @Override
    public void onUserContextInteraction(@NotNull UserContextInteractionEvent event) {
        if(event.getName().equals("Info")){
         event.replyEmbeds(embed.eb1.build()).queue();
        }
    }
}


