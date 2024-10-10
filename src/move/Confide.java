package move;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

import java.util.Random;

public class Confide extends SpecialMove {
    @Override
    protected String describe() {
        return "использует атаку Confide!";
    }

    public Confide() {
        super(Type.FAIRY, 0, 0);
//        не наносит урон
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.confuse();
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        v = new Random().nextInt(10,100)/10.0;
        super.applyOppDamage(pokemon, v);
    }
}
