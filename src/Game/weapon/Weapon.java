package Game.weapon;

/**
 * Created by СЕВАК on 29.03.2017.
 */
public abstract class Weapon {
    protected int damage;
    protected String name;

//    getters
    public int getDamage() {
        return damage;
    }

//    Draw
    public void draw() {
        System.out.print(name);
    }
}
