package com.pluto.base;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class Main {
    public static JDA jda;
    public static void main(String[] args) throws LoginException {

	jda = JDABuilder.createDefault(Token.getToken()).build();
    }
}
