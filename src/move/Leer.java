package move;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Leer extends StatusMove {
    public Leer() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.DEFENSE, (int) pokemon.getStat(Stat.DEFENSE) - 1);
    }
    // снижает оборону обороняющегося покемона

    @Override
    protected String describe() {
        return "используется атака Leer!";
    }
}
