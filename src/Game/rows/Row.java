package Game.rows;

import Game.soldiers.Soldier;
import Game.soldiers.humans.Human;
import Game.soldiers.humans.typeOfHuman.Commando;
import Game.soldiers.humans.typeOfHuman.General;
import Game.soldiers.humans.typeOfHuman.Infantry;
import Game.soldiers.mystics.Mystic;
import Game.soldiers.mystics.typeOfMystic.Elf;
import Game.soldiers.mystics.typeOfMystic.Orc;
import Game.soldiers.mystics.typeOfMystic.Troll;

import java.util.Random;

/**
 * Created by СЕВАК on 29.03.2017.
 */
public class Row {
    private static final int countOfHuman = 3;
    private static final int numberOfCommando = 1;
    private static final int numberOfGeneral = 2;
    private static final int numberOfInfantry = 3;
    private static final int countOfMystic = 3;
    private static final int numberOfElf = 1;
    private static final int numberOfOrc = 2;
    private static final int numberOfTroll = 3;
    private static int diedHumans = 0;
    private static int diedMystics = 0;

    private int currentRow;
    private static int column;
    private Human human;
    private Mystic mystic;
    private boolean battleIsFinished = false;

//    Constructor
    public Row(int currentRow) {
        this.currentRow = currentRow;
    }

//    Set Column
    public static void setColumn(int column) {
        Row.column = column;
    }

//    Create
    public void create() {
        createHuman();
        human.firstPrint();
        createMystic();
        mystic.firstPrint();
    }

//    Create Human
    private void createHuman() {
        Random random = new Random();
        setHuman(random.nextInt(countOfHuman) + 1);
    }

    private void setHuman(int numberOfHuman) {
        switch (numberOfHuman) {
            case numberOfCommando:
                human = new Commando(0, currentRow);
                break;
            case numberOfGeneral:
                human = new General(0, currentRow);
                break;
            case numberOfInfantry:
                human = new Infantry(0, currentRow);
                break;
        }
    }

//    Create Mystic
    private void createMystic() {
        Random random = new Random();
        setMystic(random.nextInt(countOfMystic) + 1);
    }

    private void setMystic(int numberOfHuman) {
        switch (numberOfHuman) {
            case numberOfElf:
                mystic = new Elf(column - 1, currentRow);
                break;
            case numberOfOrc:
                mystic = new Orc(column - 1, currentRow);
                break;
            case numberOfTroll:
                mystic = new Troll(column - 1, currentRow);
                break;
        }
    }

//    Battle
    public void battle() {
        if(battleIsFinished == false) {
            if (human.getX() < mystic.getX()) {

                human.move();
                if(human.getX() >= mystic.getX()) {
                    attack(human, mystic);
                    attack(mystic, human);
                    return;
                } else human.drawMove();

                mystic.move();
                if(mystic.getX() <= human.getX()) {
                    attack(mystic, human);
                }
                else mystic.drawMove();
            }
            else {
                attack(human, mystic);
                attack(mystic, human);
            }
        }
    }

    private void attack(Soldier soldier1, Soldier soldier2) {
        soldier1.attack(soldier2);
        if(SoldierIsKilled(soldier2)) {
            soldier1.draw();
            System.out.print(" killed ");
            soldier2.draw();
            if(soldier2 instanceof Human) {
                diedHumans++;
                System.out.println("\nKilled Humans --------------------------- " + getDiedHumans());
            }
            if(soldier2 instanceof Mystic) {
                diedMystics++;
                System.out.println("\nKilled Mystics --------------------------- " + getDiedMystics());
            }
        }
    }

//    Is Soldier killed
    private boolean SoldierIsKilled(Soldier soldier) {
        if(soldier.getHealth() <= 0) {
            battleIsFinished = true;
            return true;
        }
        return false;
    }

//    getters
    public static int getDiedHumans() {
        return diedHumans;
    }
    public static int getDiedMystics() {
        return diedMystics;
    }

}
