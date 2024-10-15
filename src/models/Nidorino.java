package models;

import move.Leer;

public class Nidorino extends NidoranM {


    public Nidorino(String name, int level) {
        super(name, level);
        setMove(new Leer());
        setStats(61,72,57,55,55,65);

    }

}
