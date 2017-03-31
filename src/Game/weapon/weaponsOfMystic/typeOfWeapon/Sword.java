package Game.weapon.weaponsOfMystic.typeOfWeapon;

import Game.weapon.weaponsOfMystic.MysticWeapon;

/**
 * Created by СЕВАК on 29.03.2017.
 */
public class Sword extends MysticWeapon {
    private static final String NAME = "Sword";
    private static final int DAMAGE = 13;

    public Sword() {
        name = NAME;
        damage = DAMAGE;
    }
}
