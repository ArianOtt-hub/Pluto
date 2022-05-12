package com.pluto.base.commands.Utilities.Date.CurrentTime;

import com.pluto.base.Main;
import com.pluto.base.commands.Command;
import com.pluto.base.commands.Informational.InfoCommand.EmbedBuilderTool;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

public class CurrentTime extends Command {
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        Message message = event.getMessage();
        String content = message.getContentRaw();


        if (content.equals(Main.prefix + "time")) {
            try {

                event.getChannel().sendTyping().delay(Duration.ofSeconds(4));

                SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-yyyy 'at' HH:mm:ss z");

                MessageChannel channel = event.getGuildChannel();
                EmbedBuilderTool embedBuilder = new EmbedBuilderTool("Current Time",event.getAuthor().getAsTag(),"Date", formatter.format(Calendar.getInstance().getTime()), "Requested with ❤  by "+event.getAuthor().getAsTag(),event.getAuthor().getEffectiveAvatarUrl());



                channel.sendMessageEmbeds(embedBuilder.eb3.build()).queue();



            } catch (IllegalStateException ex) {
                event.getChannel().sendMessage("Oups something went wrong.. <@" + event.getAuthor().getIdLong() + "> \nIs this message sent into the discord server? Try it again there!").queue();
            }


        }
    }
}
