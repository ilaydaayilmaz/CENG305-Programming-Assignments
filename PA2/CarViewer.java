import javax.swing.JFrame;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * This class shows the two moving cars in a frame
 */
public class CarViewer
{
   public static void viewCars()
   {
      final int DELAY=100;
      JFrame frame = new JFrame();

      frame.setSize(300, 400);
      frame.setTitle("Two cars");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      CarComponent component = new CarComponent();
      frame.add(component);

      frame.setVisible(true);
      
      class TimerListener implements ActionListener
      {
          public void actionPerformed(ActionEvent event)
          {
              component.movingCarBy(1,0);
              component.repaint();
          }
      }
      ActionListener tListener = new TimerListener();
      Timer time= new Timer(DELAY,tListener);
      time.start();
   }
}
