package Game.soldiers.mystics.typeOfMystic;

import Game.soldiers.mystics.Mystic;

/**
 * Created by СЕВАК on 29.03.2017.
 */
public class Orc extends Mystic {
    private static final String TYPE = "O." ;
    private static final int HEALTH = 1200 ;
    private static final int STRENGTH = 15 ;
    private static final int SPEED = 1 ;

    public Orc(int x, int y) {
        super(x, y);
        type = TYPE;
        health = HEALTH;
        strength = STRENGTH + weapon.getDamage();
        speed = SPEED;
    }

    @Override
    public boolean haveSpecialPower2() {
        return false;
    }
}
