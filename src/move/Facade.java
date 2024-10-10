package move;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class Facade extends PhysicalMove {
    @Override
    protected String describe() {
        return "используется атака Facade!";
    }

    public Facade(Pokemon pokemon) {
        super(Type.NORMAL, 40, 100);
        Status status = pokemon.getCondition();
        if (
                status == Status.PARALYZE ||
                status == Status.POISON ||
                status == Status.BURN) {
            super.power = 70;
        }
        //увеличение атаки если покемон отпралвен, обожен или обожен
    }
}
