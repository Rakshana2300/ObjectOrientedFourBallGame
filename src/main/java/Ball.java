import processing.core.PApplet;

public class Ball {
    private int position;
    private int height;
    private int diameter;

    public Ball(int position, int height, int diameter) {
        this.position = position;
        this.height = height;
        this.diameter = diameter;
    }

    public void display(int index, PApplet applet){
        applet.ellipse(position, height, diameter, diameter);
        position+=index;
    }

}
