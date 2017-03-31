package Game.soldiers.humans.typeOfHuman;

import Game.soldiers.humans.Human;

/**
 * Created by СЕВАК on 29.03.2017.
 */
public class Commando extends Human {
    private static final String TYPE = "C." ;
    private static final int HEALTH = 850 ;
    private static final int STRENGTH = 12 ;
    private static final int SPEED = 4 ;

    public Commando(int x, int y) {

        super(x, y);
        type = TYPE;
        health = HEALTH;
        strength = STRENGTH + weapon.getDamage();
        speed = SPEED;
    }
}
