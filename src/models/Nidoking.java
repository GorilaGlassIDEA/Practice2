package models;

import move.Bulldoze;

public class Nidoking extends Nidorino {
    public Nidoking(String name, int level) {
        super(name, level);
        setMove(new Bulldoze());
    }
}
