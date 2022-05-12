package com.pluto.base.commands.Informational;

import com.pluto.base.Main;
import com.pluto.base.commands.Command;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.time.Duration;

public class InfoCommand extends Command {
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        Message message = event.getMessage();
        String content = message.getContentRaw();

        if (content.equals(Main.prefix+"info")) {
            try{
                event.getChannel().sendTyping().delay(Duration.ofSeconds(4));

                MessageChannel channel = event.getGuildChannel();
                channel.sendMessage("HIII").queue();

            }catch (IllegalStateException ex){
                event.getChannel().sendMessage("Oups something went wrong.. <@" +event.getAuthor().getIdLong()+"> \nIs this message sent into the discord server? Try it again there!").queue();
            }


        }
    }
}
