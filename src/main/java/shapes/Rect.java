package shapes;

import java.awt.*;

public class Rect extends Shape{
    private int w;
    private int h;
    public Rect(Point initPos,Color col, int width, int height) {
        super(initPos, col);
        w=width;
        h=height;
    }
    public void draw (Graphics g) {
        g.fillRect(pos.x,pos.y,w,h);
    }
}
