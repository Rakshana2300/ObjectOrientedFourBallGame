import processing.core.PApplet;

import java.util.ArrayList;

public class FourBallClass extends PApplet {

    public static final int WIDTH = 700;
    public static final int HEIGHT = 580;
    PApplet app = this;
    public static ArrayList<Ball> ballCollection = new ArrayList<>();

    public static void main(String[] args) {
        PApplet.main("FourBallClass", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        for (int index = 1; index < 5; index++) {
            int speed = 1;
            int height = (HEIGHT * index) / 5;
            int diameter = 15;
            ballCollection.add(new Ball(index, speed, height, diameter));
        }
    }

    @Override
    public void draw() {
        for (Ball ball:ballCollection) {
            ball.display(app);
        }
    }


}
