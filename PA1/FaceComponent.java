import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;
import java.awt.BasicStroke;
import javax.swing.JOptionPane;

/*
   A component that draws an alien face
*/
public class FaceComponent extends JComponent
{  
   String x;
   public FaceComponent(String y) {
       x=y;
    }
   public void paintComponent(Graphics g)
   {  
      // Recover Graphics2D 
      Graphics2D g2 = (Graphics2D) g;

      // Draw the head
      Ellipse2D.Double head = new Ellipse2D.Double(5, 10, 100, 150);
      g2.draw(head);

      if(x=="old"){
          // Draw the eyes
          g2.setColor(Color.GREEN);
          Rectangle eye = new Rectangle(25, 70, 15, 15);
          g2.fill(eye);
          eye.translate(50, 0);
          g2.fill(eye);
          
          // Draw the mouth
          Line2D.Double mouth = new Line2D.Double(30, 110, 80, 110);
          g2.setColor(Color.RED);
          g2.draw(mouth);
        } else{
          // Draw the eyes
          g2.setColor(Color.GREEN);
          Ellipse2D.Double eye3 = new Ellipse2D.Double(25, 70, 25, 25);
          g2.fill(eye3);
          Ellipse2D.Double eye4 = new Ellipse2D.Double(75, 70, 25, 25);
          g2.fill(eye4);  
          
          // Draw the nose
          Line2D.Double nose = new Line2D.Double(57, 81, 57, 97);
          g2.setColor(Color.BLACK);
          g2.draw(nose);
      
          // Draw the mouth
          g2.setStroke(new BasicStroke(4));
          Line2D.Double mouth2 = new Line2D.Double(30, 110, 80, 110);
          g2.setColor(Color.RED);
          g2.draw(mouth2);
        }
      
      // Draw the greeting
      g2.setColor(Color.BLUE);
      g2.drawString("Hello, World!", 5, 175);
   }
}
