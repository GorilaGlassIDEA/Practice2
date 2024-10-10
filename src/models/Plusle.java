package models;

import move.Charm;
import move.Confide;
import move.Growl;
import move.WildCharge;
import ru.ifmo.se.pokemon.*;

public class Plusle extends Pokemon {
    public Plusle(String name, int level) {
        super(name, level);
        setMove(new Charm(), new Confide(), new Growl(), new WildCharge());
    }
}
