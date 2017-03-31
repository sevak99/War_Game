package Game.weapon.weaponsOfMystic.typeOfWeapon;

import Game.weapon.weaponsOfMystic.MysticWeapon;

/**
 * Created by СЕВАК on 29.03.2017.
 */
public class Knife extends MysticWeapon {
    private static final String NAME = "Knife";
    private static final int DAMAGE = 8;

    public Knife() {
        name = NAME;
        damage = DAMAGE;
    }
}
