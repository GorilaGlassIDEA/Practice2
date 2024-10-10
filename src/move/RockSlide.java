package move;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

import java.util.Random;

public class RockSlide extends PhysicalMove {
    public RockSlide() {
        super(Type.ROCK, 75, 90);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        int perSecond = new Random().nextInt(1, 100);
        if (perSecond > 70) {
            pokemon.attack(pokemon);
        }
        /*       реализация двойной атаки, метод вызывает attack 1 раз
                 так как изначальная атака вызывает по умолчанию 1 раз (1+1 = 2 атаки
                 с 30% шансом)
         */
    }

    @Override
    protected String describe() {
        return "использует атаку RockSlide!";
    }
}
