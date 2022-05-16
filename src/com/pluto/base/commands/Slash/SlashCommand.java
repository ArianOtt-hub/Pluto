package com.pluto.base.commands.Slash;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.interactions.commands.OptionType;
import net.dv8tion.jda.api.interactions.commands.build.Commands;
import net.dv8tion.jda.api.interactions.commands.build.OptionData;

public class SlashCommand {
    private JDA jda ;
private SlashInfo slashInfo;
    public SlashCommand(JDA jda) {
        this.jda = jda;
        initCommands();
    }
    private void initCommands(){
       slashInfo = new SlashInfo(jda);
    }


}
