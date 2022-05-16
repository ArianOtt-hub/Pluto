package com.pluto.base.Handlers;

import com.pluto.base.commands.Slash.SlashCommand;
import net.dv8tion.jda.api.JDA;

public class SlashCommandHandler {
    private JDA jda;
    private SlashCommand slashCommand;
    public SlashCommandHandler(JDA jda){
        this.jda = jda;


    }
    public void initSlashCommands(){
        slashCommand = new SlashCommand(jda);
    }
}
