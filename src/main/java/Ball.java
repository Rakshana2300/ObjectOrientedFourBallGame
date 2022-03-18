import processing.core.PApplet;

public class Ball {
    private int index;
    private int speed;
    private int height;
    private int diameter;

    public Ball(int index, int speed, int height, int diameter) {
        this.index = index;
        this.speed = speed;
        this.height = height;
        this.diameter = diameter;
    }

    public void display(PApplet applet){
        applet.ellipse(speed, height, diameter, diameter);
        speed+=index;
    }

}
