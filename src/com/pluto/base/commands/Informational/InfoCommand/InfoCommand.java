package com.pluto.base.commands.Informational.InfoCommand;

import com.pluto.base.Main;
import com.pluto.base.commands.Command;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.time.Duration;

public class InfoCommand extends Command {

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        Message message = event.getMessage();
        String content = message.getContentRaw();
        EmbedBuilderTool embed = new EmbedBuilderTool("Information",
                "Arian Ott",
                "https://gist.github.com/zekroTJA/c8ed671204dafbbdf89c36fc3a1827e1",
                "https://media.idownloadblog.com/wp-content/uploads/2021/09/Apple-September-Event-California-Streaming-BasicAppleGuy-iDownloadBlog-6K-No-Logo.png",
                "This is the Infor Window",
                "General", "Lol0", true, "FOOR", "https://media.idownloadblog.com/wp-content/uploads/2021/09/Apple-September-Event-California-Streaming-BasicAppleGuy-iDownloadBlog-6K-No-Logo.png",
                "https://media.idownloadblog.com/wp-content/uploads/2021/09/Apple-September-Event-California-Streaming-BasicAppleGuy-iDownloadBlog-6K-No-Logo.png");

        if (content.equals(Main.prefix + "info")) {
            try {
                event.getChannel().sendTyping().delay(Duration.ofSeconds(4));

                MessageChannel channel = event.getGuildChannel();

                channel.sendMessageEmbeds(embed.eb.build()).queue();
                channel.sendMessage("**Requested by: "+event.getAuthor().getAsTag()+"**").queue();


            } catch (IllegalStateException ex) {
                event.getChannel().sendMessage("Oups something went wrong.. <@" + event.getAuthor().getIdLong() + "> \nIs this message sent into the discord server? Try it again there!").queue();
            }


        }
    }
}


