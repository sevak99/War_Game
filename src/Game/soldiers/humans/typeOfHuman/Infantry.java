package Game.soldiers.humans.typeOfHuman;

import Game.soldiers.humans.Human;

/**
 * Created by СЕВАК on 29.03.2017.
 */
public class Infantry extends Human {
    private static final String TYPE = "I." ;
    private static final int HEALTH = 800 ;
    private static final int STRENGTH = 7 ;
    private static final int SPEED = 3 ;

    public Infantry(int x, int y) {
        super(x, y);
        type = TYPE;
        health = HEALTH;
        strength = STRENGTH + weapon.getDamage();
        speed = SPEED;
    }
}
