import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JComponent;

/**
 * A class to show the Alien Face
 */
public class FaceViewer
{
   /**
     * Main Process of Question 3
     */
    public static void q3()
   {
      JFrame frame = new JFrame();
      frame.setSize(150, 250);
      frame.setTitle("An Alien Face");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      FaceComponent component =  new FaceComponent("old");
      frame.add(component);
       
      frame.setVisible(true);
      
      JOptionPane.showMessageDialog(null, "Make your own modifications on this drawing!");
      
      frame.setVisible(false);
      
      JFrame frame2 = new JFrame();
      frame2.setSize(150, 250);
      frame2.setTitle("An Alien Face");
      frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      FaceComponent component2 =  new FaceComponent("new");
      frame2.add(component2);
      
      frame2.setVisible(true);
   }
}
