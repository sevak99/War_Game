package Game.soldiers.humans;

import Game.soldiers.Soldier;
import Game.weapon.weaponsOfHuman.typeOfWeapons.Gun;
import Game.weapon.weaponsOfHuman.typeOfWeapons.Rifle;
import Game.weapon.weaponsOfHuman.typeOfWeapons.Shotgun;

import java.util.Random;

/**
 * Created by СЕВАК on 29.03.2017.
 */
public abstract class Human extends Soldier {

    private static final String RACE = "H.";
    private static final int countOfWeapon = 3;
    private static final int numberOfGun = 1;
    private static final int numberOfRifle = 2;
    private static final int numberOfShotgun = 3;

//    Constructor
    public Human(int x, int y) {
        super(x, y);
        race = RACE;
    }

//    Create Weapon
    @Override
    protected void createWeapon() {
        Random random = new Random();
        setHumanWeapon(random.nextInt(countOfWeapon) + 1);
    }

    private void setHumanWeapon(int numberOfWeapon) {
        switch (numberOfWeapon) {
            case numberOfGun:
                weapon = new Gun();
                break;
            case numberOfRifle:
                weapon = new Rifle();
                break;
            case numberOfShotgun:
                weapon = new Shotgun();
                break;
        }
    }
}