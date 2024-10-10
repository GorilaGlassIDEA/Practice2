package models;

import move.HeadSmash;

public class Tyrantrum extends Tyrunt {
    public Tyrantrum(String name, int level) {
        super(name, level);
        setMove(new HeadSmash());
    }
//    добавляет еще одну атаку к TyruntModel -> TyrantrumModel
}
