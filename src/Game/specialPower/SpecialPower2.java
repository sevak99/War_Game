package Game.specialPower;

import Game.soldiers.Soldier;

/**
 * Created by СЕВАК on 31.03.2017.
 */
public class SpecialPower2 {
    private Soldier soldier;
    private double healthOfEnemy;

    public SpecialPower2(Soldier soldier) {
        this.soldier = soldier;
        healthOfEnemy = soldier.getHealth();
    }

    public boolean isEnemyWeek() {
        if(5*soldier.getHealth() < healthOfEnemy) {
            soldier.takeWeapon();
            return true;
        }
        else return false;
    }

    public Soldier getSoldier() {
        return soldier;
    }
}