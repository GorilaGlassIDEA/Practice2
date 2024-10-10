package move;

import ru.ifmo.se.pokemon.*;

import java.util.Random;

public class IceBeam extends SpecialMove {
    public IceBeam() {
        super(Type.ICE, 90, 100);
    }

    @Override
    protected String describe() {
        return "использует атаку IceBeam!";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        int perSecond = new Random().nextInt(1, 100);
        if (perSecond < 11) {
            Effect.freeze(pokemon);
        }
        // 10% шанс заморозки противника
    }
}
