import shapes.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Drawing extends Canvas {

    // shapes.Circle and shapes.Rect constructors (pt 1)
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

        // shapes.Circle and shapes.Rect constructors (pt 2)
        circ=new Circle(p, c, r);
        rect=new Rect(p2, c, w, h);

        setupFrame();
        setupCanvas();
    }

    private void setupCanvas() {
        setBackground(Color.WHITE);
        setSize(400,400);
    }

    private void setupFrame() {
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
    }

    // shapes.Circle and Rectangle drawer
    public void paint(Graphics g) {
        circ.draw(g);
        rect.draw(g);
    }
}
