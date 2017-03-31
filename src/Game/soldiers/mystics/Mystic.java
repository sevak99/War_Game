package Game.soldiers.mystics;

import Game.soldiers.Soldier;
import Game.weapon.weaponsOfMystic.typeOfWeapon.Axe;
import Game.weapon.weaponsOfMystic.typeOfWeapon.Knife;
import Game.weapon.weaponsOfMystic.typeOfWeapon.Sword;

import java.util.Random;

/**
 * Created by СЕВАК on 29.03.2017.
 */
public abstract class Mystic extends Soldier {
    private static final String RACE = "M.";
    private static final int countOfWeapon = 3;
    private static final int numberOfAxe = 1;
    private static final int numberOfKnife = 2;
    private static final int numberOfSword = 3;

    public Mystic(int x, int y) {
        super(x, y);
        createWeapon();
        race = RACE;
    }

    @Override
    protected void createWeapon() {
        Random random = new Random();
        setMysticWeapon(random.nextInt(countOfWeapon) + 1);
    }

    private  void setMysticWeapon(int numberOfWeapon) {
        switch (numberOfWeapon) {
            case numberOfAxe:
                weapon = new Axe();
                break;
            case numberOfKnife:
                weapon = new Knife();
                break;
            case numberOfSword:
                weapon = new Sword();
                break;
        }
    }
}
