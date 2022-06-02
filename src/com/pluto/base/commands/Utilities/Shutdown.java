package com.pluto.base.commands.Utilities;

import com.pluto.base.Main;
import com.pluto.base.commands.Command;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class Shutdown extends Command {
    JDA jda;

    public Shutdown(JDA jda) {
        this.jda = jda;
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        Message message = event.getMessage();
        String content = message.getContentRaw();
        if ( content.equals(Main.prefix + "shutdown") || content.equals(Main.prefix + "sd") && message.getAuthor().getId() == "946783826829512777") {
            try {
                if(message.getAuthor().getId().equals("946783826829512777")){
                    event.getChannel().sendMessage("Bye!\n\n||Shutting down sequence triggered by <@946783826829512777>||").queue();
                    jda.getPresence().setActivity(Activity.watching("sheeps and counting them. I am offline"));
                    jda.shutdown();
                }else{
                  throw new IllegalStateException();

                }
            } catch (IllegalStateException exception) {
                event.getMessage().delete().queue();
                event.getChannel().sendMessage(event.getAuthor().getAsMention() + " Please do not shut me down buddy :(\n\n\n**This command can only be used by <@946783826829512777>**").queue();
            }
        }
    }
}
