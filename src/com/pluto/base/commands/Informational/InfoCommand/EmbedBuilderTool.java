package com.pluto.base.commands.Informational.InfoCommand;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Message;

public class EmbedBuilderTool {
   EmbedBuilder eb = new EmbedBuilder();
public EmbedBuilderTool(String title, String setAuthor, String setAuthorUrl, String setPictureUrl, CharSequence setDescription, String titleField, String textFieldOne, boolean setInlineModeFieldOne, String setFooter, String setImageUrl, String setThumbnail){

    eb.setTitle(title, null);
    eb.setAuthor(setAuthor,setAuthorUrl,setPictureUrl);
    eb.setDescription(setDescription);
    eb.addField(titleField,textFieldOne, setInlineModeFieldOne);
    eb.setFooter(setFooter,setImageUrl);
    eb.setThumbnail(setThumbnail);
    eb.build();
}
    public EmbedBuilderTool(String title, String setAuthor, String setPictureUrl, CharSequence setDescription, String titleField, String textFieldOne, String setFooter, String setImageUrl, String setThumbnail){

        eb.setTitle(title, null);
        eb.setAuthor(setAuthor,null,setPictureUrl);
        eb.setDescription(setDescription);
        eb.addField(titleField,textFieldOne, false);
        eb.setFooter(setFooter,setImageUrl);
        eb.setThumbnail(setThumbnail);
        eb.build();
    }



}
