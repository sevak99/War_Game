package Game.weapon.weaponsOfHuman.typeOfWeapons;

import Game.weapon.weaponsOfHuman.HumanWeapon;

/**
 * Created by СЕВАК on 29.03.2017.
 */
public class Rifle extends HumanWeapon {
    private static final String NAME = "Rifle";
    private static final int DAMAGE = 37;


    public Rifle() {
        name = NAME;
        damage = DAMAGE;
    }
}
