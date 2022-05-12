package com.pluto.base.Handlers;

import com.pluto.base.commands.Informational.InfoCommand.InfoCommand;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class CommandHandler extends ListenerAdapter {
    private JDA jda;
    public CommandHandler(JDA jda){
        this.jda = jda;
    }
    public void initCommandHandler(){
        jda.addEventListener(new InfoCommand());
    }

}
