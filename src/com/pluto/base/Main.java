package com.pluto.base;

import com.pluto.base.Handlers.CommandHandler;
import com.pluto.base.Handlers.Handler;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.security.auth.login.LoginException;

public class Main extends ListenerAdapter  {
    public static JDA jda;
    public static String prefix = "!";

    public static void main(String[] args) throws LoginException, InterruptedException {

	jda = JDABuilder.createDefault(Token.getToken()).build().awaitReady();
        Handler handler = new Handler(jda);
        handler.init();

    }

}
