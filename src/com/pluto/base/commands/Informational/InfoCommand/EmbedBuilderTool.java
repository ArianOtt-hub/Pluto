package com.pluto.base.commands.Informational.InfoCommand;

import net.dv8tion.jda.api.EmbedBuilder;

public class EmbedBuilderTool {
   EmbedBuilder eb1 = new EmbedBuilder();
public EmbedBuilderTool(String title, String setAuthor, String setAuthorUrl, String setPictureUrl, CharSequence setDescription, String titleField, String textFieldOne, boolean setInlineModeFieldOne, String setFooter, String setImageUrl, String setThumbnail){

    eb1.setTitle(title, null);
    eb1.setAuthor(setAuthor,setAuthorUrl,setPictureUrl);
    eb1.setDescription(setDescription);
    eb1.addField(titleField,textFieldOne, setInlineModeFieldOne);
    eb1.setFooter(setFooter,setImageUrl);
    eb1.setThumbnail(setThumbnail);
    eb1.setColor(0x0080FF);
    eb1.build();
}
EmbedBuilder eb2 = new EmbedBuilder();
    public EmbedBuilderTool(String title, String setAuthor, String setPictureUrl, CharSequence setDescription, String titleField, String textFieldOne, String setFooter, String setImageUrl, String setThumbnail){

        eb2.setTitle(title, null);
        eb2.setAuthor(setAuthor,null,setPictureUrl);
        eb2.setDescription(setDescription);
        eb2.addField(titleField,textFieldOne, false);
        eb2.setFooter(setFooter,setImageUrl);
        eb2.setThumbnail(setThumbnail);
        eb2.build();
    }
    public EmbedBuilder eb3 = new EmbedBuilder();
    public EmbedBuilderTool(String title, String setAuthor,   String titleField, String textFieldOne, String setFooter, String setImageUrl) {

        eb3.setTitle(title, null);
        eb3.setAuthor(setAuthor, null, null);

        eb3.addField(titleField, textFieldOne, false);
        eb3.setFooter(setFooter, setImageUrl);
    }

}
