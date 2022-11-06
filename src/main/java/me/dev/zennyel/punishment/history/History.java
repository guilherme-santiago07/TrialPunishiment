package me.dev.zennyel.punishment.history;

import me.dev.zennyel.TrialPunishment;
import me.dev.zennyel.database.MongoDB;
import me.dev.zennyel.punishment.main.Punishment;
import org.bukkit.entity.Player;

public class History {

    private Player player;
    private Punishment punishment;
    String ip = TrialPunishment.getInstance().getConfig().getString("database.ip");
    int port = TrialPunishment.getInstance().getConfig().getInt("database.port");

    public History(Player player, Punishment punishiment){
        this.player = player;
        this.punishment = punishiment;
    }

    public Punishment punishment(){
        MongoDB db = new MongoDB(ip, port);
        return db.getPunishments(player);
    }

    public void add(){
        MongoDB db = new MongoDB(ip, port);
        db.addPunishment(getPlayer(), getPunishment());
    }

    public void delete(){
        MongoDB db = new MongoDB(ip, port);
        db.updatePunishment(player, null);
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Punishment getPunishment() {
        return punishment;
    }

    public void setPunishment(Punishment punishment) {
        this.punishment = punishment;
    }
}
