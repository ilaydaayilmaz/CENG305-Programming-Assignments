import javax.swing.JOptionPane;
/**
* Main Process
*/
public class Warmup
{
    /**
     * Main Method
     */
    public static void main(String[] args)
    {
        String s1 = "My name is İlayda YILMAZ \n" 
                    + "My ID: e236165\n" 
                    + "My Department : Statistic\n";
                    
        JOptionPane.showMessageDialog(null, s1);
                
        System.out.println("Now solution to question 1...");
        DaysAlivePrinter.q1();
        
        System.out.println("Now solution to question 2...");
        CashRegisterTester.q2();
        
        System.out.println("Now solution to question 3...");
        FaceViewer.q3();
        
        JOptionPane.showMessageDialog(null, "Happy end!");
        
    }
}