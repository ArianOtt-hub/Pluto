package com.pluto.base.Handlers;

import com.pluto.base.commands.Slash.SlashCommand;
import net.dv8tion.jda.api.JDA;

import java.sql.SQLOutput;

public class Handler {
    private final JDA jda;
    private StartupHandler startupHandler;
    private CommandHandler controller;
    private SlashCommandHandler slashCommandHandler;
    public Handler(JDA Jda){
        this.jda=Jda;
        System.out.println("Protocol: \nHandler Instance successfully initialised");
        System.out.println("Initialising Sub Handlers...");
        initSubHandlers();

    }
   private void initSubHandlers(){
        startupHandler = new StartupHandler(jda);
        controller = new CommandHandler(jda);
        slashCommandHandler = new SlashCommandHandler(jda);
       System.out.println("Sub Handlers successfully initialised");
   }
    public void init(){
        System.out.println("init");
        startupHandler.initStartupHandler();
        controller.initCommandHandler();
        slashCommandHandler.initSlashCommands();
    }

}
