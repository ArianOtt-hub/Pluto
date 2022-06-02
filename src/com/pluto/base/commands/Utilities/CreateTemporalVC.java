package com.pluto.base.commands.Utilities;

import com.pluto.base.commands.Command;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.Region;
import net.dv8tion.jda.api.entities.*;
import net.dv8tion.jda.api.events.channel.ChannelCreateEvent;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.events.guild.voice.GuildVoiceJoinEvent;
import net.dv8tion.jda.api.exceptions.RateLimitedException;
import net.dv8tion.jda.api.managers.channel.concrete.VoiceChannelManager;
import net.dv8tion.jda.api.requests.RestAction;
import net.dv8tion.jda.api.requests.restaction.AuditableRestAction;
import net.dv8tion.jda.api.requests.restaction.ChannelAction;
import net.dv8tion.jda.api.requests.restaction.InviteAction;
import net.dv8tion.jda.api.requests.restaction.PermissionOverrideAction;
import net.dv8tion.jda.api.utils.WidgetUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;

import static com.pluto.base.Main.jda;

public class CreateTemporalVC extends Command {
    String channelID;

    @Override
    public void onGuildVoiceJoin(@NotNull GuildVoiceJoinEvent event) {
        super.onGuildVoiceJoin(event);
        String name = event.getMember().getNickname();
    }

private void creater(){
VoiceChannelManager voiceChannelManager = new VoiceChannelManager() {
    @NotNull
    @Override
    public VoiceChannelManager setUserLimit(int i) {
        return null;
    }

    @NotNull
    @Override
    public VoiceChannelManager setParent(@Nullable Category category) {
        return null;
    }

    @NotNull
    @Override
    public VoiceChannelManager sync(@NotNull IPermissionContainer iPermissionContainer) {
        return null;
    }

    @NotNull
    @Override
    public VoiceChannelManager clearOverridesAdded() {
        return null;
    }

    @NotNull
    @Override
    public VoiceChannelManager clearOverridesRemoved() {
        return null;
    }

    @NotNull
    @Override
    public VoiceChannelManager putPermissionOverride(@NotNull IPermissionHolder iPermissionHolder, long l, long l1) {
        return null;
    }

    @NotNull
    @Override
    public VoiceChannelManager putRolePermissionOverride(long l, long l1, long l2) {
        return null;
    }

    @NotNull
    @Override
    public VoiceChannelManager putMemberPermissionOverride(long l, long l1, long l2) {
        return null;
    }

    @NotNull
    @Override
    public VoiceChannelManager removePermissionOverride(@NotNull IPermissionHolder iPermissionHolder) {
        return null;
    }

    @NotNull
    @Override
    public VoiceChannelManager removePermissionOverride(long l) {
        return null;
    }

    @NotNull
    @Override
    public VoiceChannelManager setPosition(int i) {
        return null;
    }

    @NotNull
    @Override
    public VoiceChannelManager setBitrate(int i) {
        return null;
    }

    @NotNull
    @Override
    public VoiceChannelManager setRegion(Region region) {
        return null;
    }

    @NotNull
    @Override
    public VoiceChannelManager reset(long l) {
        return null;
    }

    @NotNull
    @Override
    public VoiceChannelManager reset(long... longs) {
        return null;
    }

    @NotNull
    @Override
    public VoiceChannel getChannel() {
        return null;
    }

    @NotNull
    @Override
    public VoiceChannelManager setName(@NotNull String s) {
        return null;
    }

    @NotNull
    @Override
    public VoiceChannelManager setCheck(BooleanSupplier booleanSupplier) {
        return null;
    }

    @NotNull
    @Override
    public VoiceChannelManager timeout(long l, @NotNull TimeUnit timeUnit) {
        return null;
    }

    @NotNull
    @Override
    public VoiceChannelManager deadline(long l) {
        return null;
    }

    @NotNull
    @Override
    public VoiceChannelManager reset() {
        return null;
    }

    @NotNull
    @Override
    public AuditableRestAction<Void> reason(@Nullable String s) {
        return null;
    }

    @NotNull
    @Override
    public JDA getJDA() {
        return null;
    }

    @Override
    public void queue(@Nullable Consumer<? super Void> consumer, @Nullable Consumer<? super Throwable> consumer1) {

    }

    @Override
    public Void complete(boolean b) throws RateLimitedException {
        return null;
    }

    @NotNull
    @Override
    public CompletableFuture<Void> submit(boolean b) {
        return null;
    }
};
}
    }

