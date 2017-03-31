package Game.coordinate;

/**
 * Created by СЕВАК on 29.03.2017.
 */
public class Coordinates {
    private int x;
    private int y;

//    Constructor
    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

//    Draw
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(x).append(":").append(y);
        System.out.print(stringBuilder);
    }

//    getters
    public int getX() {
        return x;
    }

    //    Move
    public void move(int speed, String race) {
        if(race.equals("H.")) {
            x += speed;
        }
        else {
                x -= speed;
        }
    }
}