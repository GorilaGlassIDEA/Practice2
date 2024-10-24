package move;

import ru.ifmo.se.pokemon.*;

import java.util.Random;

public class IceBeam extends SpecialMove {
    public IceBeam() {
        super(Type.ICE, 90, 100);
    }
    @Override
    protected boolean checkAccuracy(Pokemon pokemon, Pokemon pokemon1) {
        return true;
    }
    @Override
    protected String describe() {
        return "использует атаку IceBeam!";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        double perSecond = Math.random();
        if ((perSecond * 100)< 11) {
            Effect.freeze(pokemon);
        }
        // 10% шанс заморозки противника
    }
}
