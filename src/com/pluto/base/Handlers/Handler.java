package com.pluto.base.Handlers;

import net.dv8tion.jda.api.JDA;

public class Handler {
    private final JDA jda;
    private CommandHandler controller;
    public Handler(JDA Jda){
        this.jda=Jda;
    }
   private void initSubHandlers(){
        controller = new CommandHandler(jda);
   }
    public void init(){
        initSubHandlers();
        controller.initCommandHandler();
    }

}
