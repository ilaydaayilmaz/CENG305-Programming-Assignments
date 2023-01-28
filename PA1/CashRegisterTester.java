import javax.swing.JOptionPane;

/**
   A class to test the CashRegister class.
*/
public class CashRegisterTester
{
   /**
     * Main Process of Question 2
     */
    public static void q2()
   {
      CashRegister register = new CashRegister();

      register.recordPurchase(Double.parseDouble(JOptionPane.showInputDialog("Notebook price:")));
      register.recordPurchase(Double.parseDouble(JOptionPane.showInputDialog("Pen price:")));
      register.receivePayment(Double.parseDouble(JOptionPane.showInputDialog("I gave this amount of TL to the cashier for this shopping.")));

      double change = register.giveChange();

      JOptionPane.showMessageDialog(null, "The cashier gave "+change+" TL as change.");      
   }
}
