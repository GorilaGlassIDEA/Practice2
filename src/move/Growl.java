package move;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Growl extends PhysicalMove {
    public Growl() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setLevel(pokemon.getLevel() - 1);
//    понижает уровень обороняющегося покемона на 1 пункт
    }

    @Override
    protected String describe() {
        return "использует атаку Growl";

    }
}
