package me.dev.zennyel.punishment;

import me.dev.zennyel.punishment.main.Punishment;
import org.bukkit.entity.Player;

public class Kick extends Punishment {

    public Kick(Player player, String motive, String type) {
        super(player, motive, type);
    }

}
