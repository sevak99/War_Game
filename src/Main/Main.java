package Main;

import Game.Game;

import java.util.Scanner;

/**
 * Created by СЕВАК on 29.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
}

//Խաղը ավարտվում է երբ թիմերից մեկում գոնե կեսը մահացել են
//Սկզբից քայլում է human@, հետո mystic@, և երբ հանդիպում են սկսւմ են մենամարտել, ընդ որում մենամարտը սկսում է human@