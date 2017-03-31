package Game.soldiers.mystics.typeOfMystic;

import Game.soldiers.mystics.Mystic;

/**
 * Created by СЕВАК on 29.03.2017.
 */
public class Troll extends Mystic {
    private static final String TYPE = "T." ;
    private static final int HEALTH = 2000 ;
    private static final int STRENGTH = 30 ;
    private static final int SPEED = 2 ;

    public Troll(int x, int y) {
        super(x, y);
        type = TYPE;
        health = HEALTH;
        strength = STRENGTH + weapon.getDamage();
        speed = SPEED;
    }
}