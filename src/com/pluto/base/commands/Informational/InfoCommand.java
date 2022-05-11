package com.pluto.base.commands.Informational;

import com.pluto.base.Main;
import com.pluto.base.commands.Command;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class InfoCommand extends Command {
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        Message message = event.getMessage();
        String content = message.getContentRaw();
        if (content.equals(Main.prefix+"info")) {
            MessageChannel channel = event.getChannel();
            channel.sendMessage("hi").queue();

        }
    }
}
