package com.pluto.base.commands;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Command extends ListenerAdapter {
    public void onMessageReceived(MessageReceivedEvent event){
        Message message = event.getMessage();
        String content = message.getContentRaw();

    }


    }

