package me.dev.zennyel.punishiment;

public enum PunishimentUnit {
    SECOND("sec", 0),
    MINUTE("min", 1),
    HOUR("hour", 60),
    DAY("day", 1440),
    WEEK("week", 10080),
    MONTH("month", 43200),
    YEAR("year", 518400);

    public int multi;

    public String name;

    PunishimentUnit(String n, int mult) {
        this.name = n;
        this.multi = mult;
    }

    public static long getTicks(String un, int time) {
        long sec;
        try {
            sec = (time * 60);
        } catch (NumberFormatException ex) {
            return 0L;
        }
        byte b;
        int i;
        PunishimentUnit[] arrayOfPunishimentUnit;
        for (i = (arrayOfPunishimentUnit = values()).length, b = 0; b < i; ) {
            PunishimentUnit unit = arrayOfPunishimentUnit[b];
            if (un.startsWith(unit.name))
                return (sec *= unit.multi) * 1000L;
            b++;
        }
        return 0L;
    }


}
