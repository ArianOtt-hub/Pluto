package com.pluto.base.Handlers;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

public class StartupHandler {
    private JDA jda;
    public StartupHandler( JDA jda){
        this.jda = jda;

        jda.getPresence().setPresence(OnlineStatus.ONLINE, true);
        jda.getPresence().setActivity(Activity.watching("Many Members"));
    }
    public void initStartupHandler(){

    }

}
