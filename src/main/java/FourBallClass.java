import processing.core.PApplet;

import java.util.ArrayList;

public class FourBallClass extends PApplet {

    public static final int WIDTH = 700;
    public static final int HEIGHT = 580;
    PApplet app = this;
    public static ArrayList<Ball> ballCollection = new ArrayList<>();

    public static void main(String[] args) {
        PApplet.main("FourBallClass", args);
        ballCollectionInitialisation();
    }

    private static void ballCollectionInitialisation() {
        for (int index = 0; index < 4; index++) {
            ballCollection.add(new Ball(1, (HEIGHT*(index+1))/5, 15));
        }
    }


    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        for (int index = 0; index < 4; index++) {
            Ball ball = ballCollection.get(index);
            ball.display(index+1,app);

        }
    }


}
