package me.dev.zennyel.database;

import com.mongodb.*;
import me.dev.zennyel.punishment.main.Punishment;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.net.UnknownHostException;

public class MongoDB {
private DBCollection players;
private DB mcserverdb;
private MongoClient client;
public MongoDB (String ip, int port){
    connect(ip, port);
}
     public boolean connect(String ip, int port) {
        try {
            client = new MongoClient(ip, port);
        } catch (UnknownHostException e) {
            Bukkit.getConsoleSender().sendMessage("Could not connect to database");
            e.printStackTrace();
        }
        mcserverdb = client.getDB("minecraft");
        players = mcserverdb.getCollection("players");
        return true;
    }

    public void addPunishment(Player player, Punishment punishiment){
        DBObject obj = new BasicDBObject("player", player);
        obj.put("punishiment", punishiment);
    }

    public void updatePunishment(Player player, Punishment punishiment){
        DBObject obj = new BasicDBObject("player", player);
        DBObject found = players.findOne(obj);
        if (found == null){
            return;
        }
        DBObject r = new BasicDBObject("player", player);
        r.put("punishiment", punishiment);
        players.update(found, r);
    }

    public Punishment getPunishments(Player player){
         DBObject r = new BasicDBObject("player", player);
         DBObject found = players.findOne(r);
        if (found == null) {
            return null;
        }
        return (Punishment) found.get("punishiment");
    }





}
