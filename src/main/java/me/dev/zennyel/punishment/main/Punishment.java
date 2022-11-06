package me.dev.zennyel.punishment.main;

import org.bukkit.entity.Player;

import java.util.Date;

public class Punishment {


    private Player issuer;
    private Player player;
    private String motive;
    private int time;

    private Date date;
    private Date expire;

    private String type;

    public Punishment(Player player, String motive, int time, String type) {
        this.player = player;
        this.motive = motive;
        this.time = time;
        this.type = type;
    }

    public Punishment(Player player, String motive, String type) {
        this.player = player;
        this.motive = motive;
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getExpire() {
        return expire;
    }

    public void setExpire(Date expire) {
        this.expire = expire;
    }

    public Player getIssuer() {
        return issuer;
    }

    public void setIssuer(Player issuer) {
        this.issuer = issuer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
