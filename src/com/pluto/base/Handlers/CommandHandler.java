package com.pluto.base.Handlers;

import com.pluto.base.commands.Informational.InfoCommand.InfoCommand;
import com.pluto.base.commands.Slash.SlashCommand;
import com.pluto.base.commands.Utilities.CreateTemporalVC;
import com.pluto.base.commands.Utilities.Date.CurrentTime.CurrentTime;
import com.pluto.base.commands.Utilities.Mute;
import com.pluto.base.commands.Utilities.Shutdown;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class CommandHandler extends ListenerAdapter {
    private JDA jda;
    public CommandHandler(JDA jda){
        this.jda = jda;

    }
    public void initCommandHandler(){
        jda.addEventListener(new InfoCommand());
        jda.addEventListener(new CurrentTime());
        jda.addEventListener(new Mute());
        jda.addEventListener(new CreateTemporalVC());
        jda.addEventListener(new Shutdown(jda));
    }

}
