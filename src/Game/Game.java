package Game;

import Game.rows.Row;
import java.util.Scanner;

/**
 * Created by СЕВАК on 29.03.2017.
 */
public class Game {
    private int row;
    private int column;
    private Row[] rows;

    public void start() {
        createBattleField();

        System.out.println("Game Started");
        System.out.println();

        createSoldiers();
        System.out.println("Soldiers are created\n");

        a:
        for(;;) {
            System.out.println("--------------------------------\n");
            for (int i = 0; i < rows.length; i++) {
                rows[i].battle();
                if (2*Row.getDiedHumans() >= row) {
                    System.out.println("\n\nMystics Win the Game!");
                    break a;
                }
                if (2*Row.getDiedMystics() >= row) {
                    System.out.println("\n\nHumans Win the Game!");
                    break a;
                }
            }
        }

    }

//    Create Soldier
    private void createSoldiers() {

        Row.setColumn(column);
        rows = new Row[row];
        for(int i = 0; i < rows.length; i++) {
            rows[i] = new Row(i);
            rows[i].create();
        }
    }

//    Create Battle Fields
    private void createBattleField() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of row: ");
        row = scanner.nextInt();

        System.out.print("Enter number of column: ");
        column = scanner.nextInt();

        System.out.println();
    }
}