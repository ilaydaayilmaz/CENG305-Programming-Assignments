import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.lang.*;
import java.util.*;
/**
 * This program displays the people in the population.
 */
public class PopulationViewer
{
    // instance variables 
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 100;
    int order=0;    
    /**
     * To show the Names
     */
    public void viewNames(Population population){
        JFrame frame = new JFrame();
        
        // The button to trigger the calculation
        JButton button = new JButton("Show next person in the population");
        
        // The application adds interest to this bank account
        
        // The label for displaying the results
        final JLabel label = new JLabel("Person name: " + population.getOrder());
        
        // The panel that holds the user−interface components
        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(label);
        frame.add(panel);
        
        /**
         * The IncreaseOrderOfPersonListener class that implements ActionListener sort the people by their name,
         * show in the panel.
         */
        class IncreaseOrderOfPersonListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event) 
            {
                //TODO
                population.sortByName();
                label.setText("Person name: " + population.getPersonByOrder(population.getOrder()).getName() );
                population.increaseOrder();

            }
        }
        
        ActionListener listener = new IncreaseOrderOfPersonListener();
        button.addActionListener(listener);
        
        frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
