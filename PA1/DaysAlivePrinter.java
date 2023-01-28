import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 * Shows the number of days lived based on the entered birthday.
 */

public class DaysAlivePrinter
{
    /**
     * Main Process of Question 1
     */
    public static void q1()
    {
        String Process = "Now process Q1";
        JOptionPane.showMessageDialog(null, Process);
      
        int birthdayYear=Integer.parseInt(JOptionPane.showInputDialog("My birth year is "));
        int birthdayMonth=Integer.parseInt(JOptionPane.showInputDialog("My birth month is "));
        int birthdayDay=Integer.parseInt(JOptionPane.showInputDialog("My birth day is "));
      
        String birthDate= "My birth date is \n"
                        +birthdayDay
                        +"/"
                        +birthdayMonth
                        +"/"
                        +birthdayYear;
        JOptionPane.showMessageDialog(null, birthDate);
      
        Day Birthday = new Day(birthdayYear, birthdayMonth, birthdayDay);
      
        Day today = new Day();
        JOptionPane.showMessageDialog(null, "Today: "+today);
        int daysAlive = today.daysFrom(Birthday);
        JOptionPane.showMessageDialog(null,"I have lived "+daysAlive+" days until today.");
    }
}

