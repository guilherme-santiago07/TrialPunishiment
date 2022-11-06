package me.dev.zennyel.punishment;

import me.dev.zennyel.punishment.main.Punishment;
import org.bukkit.entity.Player;

public class Mute extends Punishment {

    public Mute(Player player, String motive, int time, String type) {
        super(player, motive, time, type);
    }

    public Mute(Player player, String motive, String type) {
        super(player, motive, type);
    }

    public void mutePlayer(){

    }

    public void tempMutePlayer(){

    }


}
