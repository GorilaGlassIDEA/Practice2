package models;

import move.Facade;
import move.IceBeam;
import ru.ifmo.se.pokemon.Pokemon;

public class NidoranM extends Pokemon {
    public NidoranM(String name, int level) {
        super(name, level);
        setMove(new Facade(this),new IceBeam());
    }
}
