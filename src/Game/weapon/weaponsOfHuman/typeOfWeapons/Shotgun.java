package Game.weapon.weaponsOfHuman.typeOfWeapons;

import Game.weapon.weaponsOfHuman.HumanWeapon;

/**
 * Created by СЕВАК on 29.03.2017.
 */
public class Shotgun extends HumanWeapon {
    private static final String NAME = "Shotgun";
    private static final int DAMAGE = 62;


    public Shotgun() {
        name = NAME;
        damage = DAMAGE;
    }
}
