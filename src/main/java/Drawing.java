import java.awt.*;
import java.awt.event.*;

public class Drawing extends Canvas {

    // Circle and Rect constructors (pt 1)
    Point p = new Point(200, 200);
    Color c = new Color(0x992266);
    int r = 50;
    private Circle circ;

    Point p2=new Point(200, 300);
    int w=100;
    int h=40;
    private Rect rect;

    // Frame initialiser
    private Frame f;
    public Drawing(){

        // Circle and Rect constructors (pt 2)
        circ=new Circle(p, c, r);
        rect=new Rect(p2, c, w, h);

        f=new Frame("My window");
        f.add(this);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
        setBackground(Color.WHITE);
        setSize(400,400);
    }
    // Circle and Rectangle drawer
    public void paint(Graphics g) {
        circ.draw(g);
        rect.draw(g);
    }
}
