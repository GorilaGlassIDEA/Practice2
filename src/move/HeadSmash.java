package move;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

import java.util.Random;

public class HeadSmash extends PhysicalMove {

    public HeadSmash() {
        super(Type.ROCK, 150, 80);
    }

    @Override
    protected String describe() {
        return "использует атаку HeadSmash!";
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        double perSecond = (Math.random()*100);
        if (perSecond < 51) {
            pokemon.attack(pokemon);
        }
        //атака самого себя с 50% шансом
    }
}
