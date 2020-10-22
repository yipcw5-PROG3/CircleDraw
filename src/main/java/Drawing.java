import java.awt.*;
import java.awt.event.*;

public class Drawing extends Canvas {
    private Frame f;
    Point p = new Point(200, 200);
    Color c = new Color(0x992266);
    int r = 50;
    private Circle circ;
    public Drawing(){
        circ=new Circle(p, c, r);
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
    public void paint(Graphics g) {
        circ.draw(g);
    }
}
