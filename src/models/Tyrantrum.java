package models;

import move.HeadSmash;

public class Tyrantrum extends Tyrunt {
    public Tyrantrum(String name, int level) {
        super(name, level);
        setMove(new HeadSmash());
        setStats(82,121,119,69,59,71);
    }
//    добавляет еще одну атаку к TyruntModel -> TyrantrumModel
}
