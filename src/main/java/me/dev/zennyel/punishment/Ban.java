package me.dev.zennyel.punishment;

import me.dev.zennyel.punishment.history.History;
import me.dev.zennyel.punishment.main.Punishment;
import org.bukkit.entity.Player;

public class Ban extends Punishment {

    History history = new History(getPlayer(), new Ban(getPlayer(), getMotive(), "ban"));

    public Ban(Player player, String motive, int time, String type) {
        super(player, motive, time, type);
    }

    public Ban(Player player, String motive, String type) {
        super(player, motive, type);
    }

    public void banPlayer(){
        getPlayer().banPlayer(getMotive());
        history.add();
    }

    public void tempBanPlayer(){
    }



}
