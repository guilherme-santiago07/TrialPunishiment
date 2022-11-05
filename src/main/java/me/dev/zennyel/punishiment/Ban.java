package me.dev.zennyel.punishiment;

import org.bukkit.entity.Player;

public class Ban extends Punishiment{

    public Ban(Player player, String motive, int time) {
        super(player, motive, time);
    }

    public void banPlayer(){
        getPlayer().banPlayer(getMotive());
    }

    public void tempBanPlayer(){
    }



}
