package me.dev.zennyel.punishment;

import me.dev.zennyel.punishment.history.History;
import me.dev.zennyel.punishment.main.Punishment;
import org.bukkit.entity.Player;

public class Warning extends Punishment {

    History history;

    public Warning(Player player, String motive, String type) {
        super(player, motive, type);
    }

    public void warnPlayer(){
        history.add();
    }


}
