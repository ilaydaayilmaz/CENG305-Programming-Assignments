import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
   This class draws two car shapes and moves them.
*/
public class CarComponent extends JComponent
{  
   private Car car1;
   private Car car2;
   
   /**
    * This constructor specify cars' location.
    */
   public CarComponent()
   {
       car1 = new Car(0, 0);
       
       int x = getWidth() - 60;
       int y = getHeight() - 30;
       
       car2 = new Car(226, 333);
   }
    
   /**
    * draws the cars
    */
   public void paintComponent(Graphics g)
   {  
       super.paintComponent(g);
       Graphics2D g2 = (Graphics2D) g;
       car1.draw(g2);   
       car2.draw(g2);
   }
   
   /**
    * moves car by...
    */
   public void movingCarBy(int dx, int dy)
   {
       car1.translateCoords(dx,dy);
       car2.translateCoords(-dx,dy);
       repaint();
       
   }
}
