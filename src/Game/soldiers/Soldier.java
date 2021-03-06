package Game.soldiers;

import Game.coordinate.Coordinates;
import Game.specialPower.SpecialPower2;
import Game.weapon.Weapon;

import java.util.Random;

/**
 * Created by СЕВАК on 29.03.2017.
 */
public abstract class Soldier {
    protected static final String[] NAME = {"Jone", "Ianus", "Samuel", "Glaukos", "George", "Electra", "Kevin", "Morpius", "Nemo", "Cadmus", "David", "Damon"};

    protected double health;
    protected double strength;
    protected int speed;
    protected String race;
    protected String type;
    protected String name;
    protected Weapon weapon;
    protected Coordinates coordinates;
    protected SpecialPower2 specialPower2;
    private boolean haveSpecialPower1 = false;

//    Constructor
    public Soldier(int x, int y) {
        coordinates = new Coordinates(x, y);
        getName();
        createWeapon();
    }

    protected abstract void createWeapon();
    public abstract boolean haveSpecialPower2();

//    Draw
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(race).append(" ")
                .append(type).append(" ")
                .append(name).append(" ")
                .append("(").append(getHealth()).append(")");
        System.out.print(stringBuilder);
    }

//    First Print
    public void firstPrint() {
        draw();
        System.out.print(" arrived at ");
        coordinates.draw();
        System.out.print(". Armed with ");
        weapon.draw();
        System.out.println();
    }

//    getters
    public String getName() {
        Random random = new Random();
        name = NAME[random.nextInt(NAME.length)];
        return name;
    }

    public double getHealth() {
        return health;
    }

    public int getX() {
        return coordinates.getX();
    }

    public double getStrength() {
        return strength;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    //    setters
    public void setDamage(double damage) {
        health -= damage;
    }

//    Special Power 1
    public void specialPower1() {
        strength *= 12/10;
        haveSpecialPower1 = true;
    }

//    Special Power 2
    public void setSpecialPower2(Soldier soldier) {
        specialPower2 = new SpecialPower2(soldier);
    }
    public void takeWeapon() {
        if(haveSpecialPower1) {
            strength -= (float)1.2*weapon.getDamage();
        } else strength -= weapon.getDamage();
    }

    //    Move
    public void move() {
        coordinates.move(speed, race);
    }

    public void drawMove() {
        draw();
        System.out.print(" moved to ");
        coordinates.draw();
        System.out.println();
    }

//    Attack
    public void attack(Soldier soldier) {
        draw();
        System.out.print(" attacks ");
        soldier.draw();
        System.out.println(". Damage: " + strength);
        soldier.setDamage(strength);
        if(haveSpecialPower2() && (specialPower2.getSoldier().getWeapon() != null) && specialPower2.isEnemyWeek()) {
            draw();
            System.out.print(" took ");
            soldier.getWeapon().draw();
            System.out.print(" from ");
            soldier.draw();
            System.out.println();

            specialPower2.getSoldier().weapon = null;
        }
    }
}