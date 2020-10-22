import java.awt.*;

public class Rect {
    private int w;
    private int h;
    private Point pos;
    private Color col;
    public Rect(Point initPos,Color col, int width, int height) {
        w=width;
        h=height;
        pos=initPos;
        this.col=col;
    }
    public void draw (Graphics g) {
        g.setColor(col);
        g.fillRect(pos.x,pos.y,w,h);
    }
}
