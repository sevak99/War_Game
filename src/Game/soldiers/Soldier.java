package Game.soldiers;

import Game.coordinate.Coordinates;
import Game.weapon.Weapon;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by СЕВАК on 29.03.2017.
 */
public abstract class Soldier {
    protected static final String[] NAME = {"Jone", "Ianus", "Samuel", "Glaukos", "George", "Electra", "Kevin", "Morpius", "Nemo", "Cadmus", "David", "Damon"};

    protected int health;
    protected int strength;
    protected int speed;
    protected String race;
    protected String type;
    protected String name;
    protected Weapon weapon;
    protected Coordinates coordinates;

//    Constructor
    public Soldier(int x, int y) {
        coordinates = new Coordinates(x, y);
        getName();
        createWeapon();
    }

    protected abstract void createWeapon();

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

    public int getHealth() {
        return health;
    }

    public int getX() {
        return coordinates.getX();
    }

//    setters
    public void setDamage(int damage) {
        health -= damage;
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
    }
}
