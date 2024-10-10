import models.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();


        Plusle plusle = new Plusle("Акакий",2);
        Tyrunt tyrunt = new Tyrunt("Растислав",2);
        Tyrantrum tyrantrum = new Tyrantrum("Калыван",2);
        NidoranM nidoranM = new NidoranM("Макарий",2);
        Nidorino nidorino = new Nidorino("Роберт",2);
        Nidoking nidoking = new Nidoking("Евпатий Коловрат",2);


        b.addAlly(nidorino);
        b.addAlly(tyrunt);
        b.addAlly(tyrantrum);

        b.addFoe(plusle);
        b.addFoe(nidoranM);
        b.addFoe(nidoking);


        b.go();
    }
}