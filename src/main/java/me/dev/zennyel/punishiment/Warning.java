package me.dev.zennyel.punishiment;

import org.bukkit.entity.Player;

public class Warning extends Punishiment{

    History history;

    public Warning(Player player, String motive) {
        super(player, motive);
        this.history = new History(player, new Warning(player, motive));
    }

    public void warnPlayer(){
        history.add();
    }


}
