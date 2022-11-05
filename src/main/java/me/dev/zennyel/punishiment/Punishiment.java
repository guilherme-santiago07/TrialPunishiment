package me.dev.zennyel.punishiment;

import org.bukkit.entity.Player;

public class Punishiment {

    private Player player;
    private String motive;
    private int time;
    public Punishiment(Player player, String motive) {
        this.player = player;
        this.motive = motive;
    }

    public Punishiment(Player player, String motive, int time) {
        this.player = player;
        this.motive = motive;
        this.time = time;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getMotive() {
        return motive;
    }

    public void setMotive(String motive) {
        this.motive = motive;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
