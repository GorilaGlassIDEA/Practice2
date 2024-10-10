package move;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class WildCharge extends PhysicalMove {
    public WildCharge() {
        super(Type.ELECTRIC, 90, 100);
    }

    @Override
    protected String describe() {
        return "использует атаку WildCharge!";
    }
}
