package Game.soldiers.humans.typeOfHuman;

import Game.soldiers.humans.Human;

/**
 * Created by СЕВАК on 29.03.2017.
 */
public class General extends Human {
    private static final String TYPE = "G." ;
    private static final int HEALTH = 1000 ;
    private static final int STRENGTH = 10 ;
    private static final int SPEED = 2 ;

    public General(int x, int y) {
        super(x, y);
        type = TYPE;
        health = HEALTH;
        strength = STRENGTH + weapon.getDamage();
        speed = SPEED;
    }

    @Override
    public boolean haveSpecialPower2() {
        return true;
    }
}
