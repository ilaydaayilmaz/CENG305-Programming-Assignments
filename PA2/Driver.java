import lang.stride.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * This class is the main class of homework.
 */
public class Driver
{
    /**
     * This method takes the question number and displays its output.
     */
    public static void main(String[] params)
    {
        int question=-1;
    
        while(true)
        {
            System.out.println("Press 1 for Question 1");
            System.out.println("Press 2 for Question 2");
            System.out.println("Press 3 for Question 3");
            System.out.println("Press 0 for exit.");
            Scanner scan = new Scanner(System.in);
            question = scan.nextInt();
            scan.nextLine();
            if(question==0)
                break;
                
            switch(question) {
                case 1 : {
                    //Code to test Problem 1
                    DrunkardWalk.walkRandomly();     
                    break;
                }
                case 2 : {
                    //Code to test Problem 2
                    System.out.println("Enter a number (integer)");
                    int number=scan.nextInt();
                    PrimeGenerator primeG= new PrimeGenerator(number);
                    primeG.listPrimes();
                    break;
                }
                case 3 : {
                    //Code to test Problem 3
                    CarViewer cViewer = new CarViewer();
                    cViewer.viewCars();
                    break;
                }
            }
        }
    }
}