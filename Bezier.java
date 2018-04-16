import javax.swing.*;
import java.awt.*;
 
class Bezier extends JFrame {
    
    private static int POINT_SIZE = 30;

    @Override public void paint(Graphics g) {
        super.paint(g);
        Point p1 = new Point(1,1);
        Point p2 = new Point(700,700);
        Point p3 = new Point(400,1);
        
        drawCurve(g, p1, p2, p3, Color.red);
    }

    public void drawCurve(Graphics g, Point p1, Point p2, Point p3, Color cor) {
    System.out.println("Entrei na função");
    int i=100;
    while (i>=0) {
            Point p20 = pontoDeControle (i, p1, p2, p3);
            System.out.println("p1x: " + p20);
            
            int x = (int)  p20.getX();
            System.out.println("x: " + x);
            int y = (int) p20.getY();
            System.out.println("y: " + y);
            
           g.setColor(cor);
           g.drawLine(x, y, x, y);
           g.fillRect(x, y, POINT_SIZE, POINT_SIZE);
           g.drawOval(x, y, 10,10);
        i--;
        }
    }
    
    public Point pontoDeControle(int t, Point  p0, Point p1, Point p2) {
        
        float umMenosT = ((100- (float) t)/100);
        float umMenosTQuadrado = umMenosT * umMenosT;
        float tQuadrato = (float)t/100 *(float)t/100;
        float tdiv = (float) t/100;

        
        float p0x = (float) p0.getX() * umMenosTQuadrado;
        float p0y = (float) p0.getY() * umMenosTQuadrado;
        
        float p1x = 2 * tdiv * umMenosT * (float) p1.getX();
        float p1y = 2 * tdiv * umMenosT * (float) p1.getY();
        

        
        float p2x = tQuadrato * (float) p2.getX();
        float p2y = tQuadrato * (float) p2.getY();
        
        float xMaisNovo = p0x + p1x + p2x;
        float yMaisNovo = p0y + p1y + p2y;
        
        Point PointDrawn = new Point ((int)xMaisNovo, (int)yMaisNovo);
        
        
        return PointDrawn;
    }

    public static void main(String... args) {
        JFrame frame = new Bezier();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
