import java.awt.*;
import javax.swing.JFrame;

class App extends JFrame {
    private static int POINT_SIZE = 3;

    @Override public void paint(Graphics g) {
        super.paint(g);
        
        Point p1 = new Point(100,50);
        Point p2 = new Point(100,200);
        Point p3 = new Point(150,250);
        Point p4 = new Point(250,250);
        Point p5 = new Point(300,200);
        Point p6 = new Point(300,50);
        
        drawForma (g,p1, p2, p3, p4, p5, p6, Color.BLUE);
        Translada(g,p1, p2, p3, p4, p5, p6, Color.RED);
        Escala(g,p1, p2, p3, p4, p5, p6, Color.GREEN);
        Rotacao(g,p1, p2, p3, p4, p5, p6, Color.BLACK);
    }
    
    public void drawForma(Graphics g, Point p1, Point p2, Point p3, Point p4, Point p5,Point p6, Color cor) {
     
           g.setColor(cor);
           g.drawLine((int)p1.getX(), (int)p1.getY(), (int)p2.getX(), (int)p2.getY());
           g.drawLine((int)p2.getX(), (int)p2.getY(), (int)p3.getX(), (int)p3.getY());
           g.drawLine((int)p3.getX(), (int)p3.getY(), (int)p4.getX(), (int)p4.getY());
           g.drawLine((int)p4.getX(), (int)p4.getY(), (int)p5.getX(), (int)p5.getY());
           g.drawLine((int)p5.getX(), (int)p5.getY(), (int)p6.getX(), (int)p6.getY());
           g.drawLine((int)p6.getX(), (int)p6.getY(), (int)p1.getX(), (int)p1.getY());
           
           
        }
    
     public void Translada (Graphics g, Point p1, Point p2, Point p3, Point p4, Point p5,Point p6, Color cor) {
     
            int DeslocamentoX = 400; 
            int DeslocamentoY = 0;
            
           g.setColor(cor);

           g.drawLine((int)p1.getX()+ DeslocamentoX, (int)p1.getY()+ DeslocamentoY, (int)p2.getX()+ DeslocamentoX, (int)p2.getY()+ DeslocamentoY);
           g.drawLine((int)p2.getX()+ DeslocamentoX, (int)p2.getY()+ DeslocamentoY, (int)p3.getX()+ DeslocamentoX, (int)p3.getY()+ DeslocamentoY);
           g.drawLine((int)p3.getX()+ DeslocamentoX, (int)p3.getY()+ DeslocamentoY, (int)p4.getX()+ DeslocamentoX, (int)p4.getY()+ DeslocamentoY);
           g.drawLine((int)p4.getX()+ DeslocamentoX, (int)p4.getY()+ DeslocamentoY, (int)p5.getX()+ DeslocamentoX, (int)p5.getY()+ DeslocamentoY);
           g.drawLine((int)p5.getX()+ DeslocamentoX, (int)p5.getY()+ DeslocamentoY, (int)p6.getX()+ DeslocamentoX, (int)p6.getY()+ DeslocamentoY);
           g.drawLine((int)p6.getX()+ DeslocamentoX, (int)p6.getY()+ DeslocamentoY, (int)p1.getX()+ DeslocamentoX, (int)p1.getY()+ DeslocamentoY);
           
           
        }
     
     public void Escala (Graphics g, Point p1, Point p2, Point p3, Point p4, Point p5,Point p6, Color cor) {
     
            int EscalaX = 2; 
            int EscalaY = 2;
            
           g.setColor(cor);

           g.drawLine((int)p1.getX()* EscalaX, (int)p1.getY()* EscalaY, (int)p2.getX()* EscalaX, (int)p2.getY()* EscalaY);
           g.drawLine((int)p2.getX()* EscalaX, (int)p2.getY()* EscalaY, (int)p3.getX()* EscalaX, (int)p3.getY()* EscalaY);
           g.drawLine((int)p3.getX()* EscalaX, (int)p3.getY()* EscalaY, (int)p4.getX()* EscalaX, (int)p4.getY()* EscalaY);
           g.drawLine((int)p4.getX()* EscalaX, (int)p4.getY()* EscalaY, (int)p5.getX()* EscalaX, (int)p5.getY()* EscalaY);
           g.drawLine((int)p5.getX()* EscalaX, (int)p5.getY()* EscalaY, (int)p6.getX()* EscalaX, (int)p6.getY()* EscalaY);
           g.drawLine((int)p6.getX()* EscalaX, (int)p6.getY()* EscalaY, (int)p1.getX()* EscalaX, (int)p1.getY()* EscalaY);
           
        }
     
     public void Rotacao (Graphics g, Point p1, Point p2, Point p3, Point p4, Point p5,Point p6, Color cor) {
            
        double seno = Math.sin(1);
        double coso = Math.cos(0);
        System.out.println(seno);
        System.out.println(coso);
        Point r1 = new Point((int)(p1.getX()* coso - p1.getY() * seno), (int)((p1.getX() * seno) + (p1.getY() * coso)));
        Point r2 = new Point((int)(p2.getX()* coso - p2.getY() * seno), (int)((p2.getX() * seno) + (p2.getY() * coso)));
        Point r3 = new Point((int)(p3.getX()* coso - p3.getY() * seno), (int)((p3.getX() * seno) + (p3.getY() * coso)));
        Point r4 = new Point((int)(p4.getX()* coso - p4.getY() * seno), (int)((p4.getX() * seno) + (p4.getY() * coso)));
        Point r5 = new Point((int)(p5.getX()* coso - p5.getY() * seno), (int)((p5.getX() * seno) + (p5.getY() * coso)));
        Point r6 = new Point((int)(p6.getX()* coso - p6.getY() * seno), (int)((p6.getX() * seno) + (p6.getY() * coso)));


        g.setColor(cor);

        g.drawLine((int)r1.getX(), (int)r1.getY(), (int)r2.getX(), (int)r2.getY());
        g.drawLine((int)r2.getX(), (int)r2.getY(), (int)r3.getX(), (int)r3.getY());
        g.drawLine((int)r3.getX(), (int)r3.getY(), (int)r4.getX(), (int)r4.getY());
        g.drawLine((int)r4.getX(), (int)r4.getY(), (int)r5.getX(), (int)r5.getY());
        g.drawLine((int)r5.getX(), (int)r5.getY(), (int)r6.getX(), (int)r6.getY());
        g.drawLine((int)r6.getX(), (int)r6.getY(), (int)r1.getX(), (int)r1.getY());
           
        }
}





public class Main {
    public static void main(String[] args) {
        JFrame frame = new App();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1500, 800);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);     
    }
}
