package move;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Charm extends PhysicalMove {
    public Charm() {
        super(Type.FAIRY, 0, 100);
    }

    @Override
    protected String describe() {
        return "использует атаку Charm!";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setLevel(pokemon.getLevel()-1);
//        также как и тип Growl снижает уровень покемона на 1
    }
}
