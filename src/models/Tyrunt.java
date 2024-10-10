package models;

import move.RockPolish;
import move.RockSlide;
import move.Tackle;
import ru.ifmo.se.pokemon.Pokemon;

public class Tyrunt extends Pokemon {

    public Tyrunt(String name, int level) {
        super(name, level);
        setMove(new RockSlide(), new RockPolish(), new Tackle());
    }
}
