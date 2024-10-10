package models;

import move.Leer;

public class Nidorino extends NidoranM {


    public Nidorino(String name, int level) {
        super(name, level);
        setMove(new Leer());
    }
}
