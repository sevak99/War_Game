package Game.soldiers.mystics.typeOfMystic;

import Game.soldiers.mystics.Mystic;

/**
 * Created by СЕВАК on 29.03.2017.
 */
public class Elf extends Mystic {
    private static final String TYPE = "E." ;
    private static final int HEALTH = 800 ;
    private static final int STRENGTH = 10 ;
    private static final int SPEED = 5 ;

    public Elf(int x, int y) {
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
