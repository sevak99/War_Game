package Game.weapon.weaponsOfHuman.typeOfWeapons;

import Game.weapon.weaponsOfHuman.HumanWeapon;

/**
 * Created by СЕВАК on 29.03.2017.
 */
public class Gun extends HumanWeapon {
    private static final String NAME = "Gun";
    private static final int DAMAGE = 18;

    public Gun() {
        name = NAME;
        damage = DAMAGE;
    }
}
