import java.util.*;
/**
 * This class randomly picks one of four directions and goes there, then again randomly picks one of four directions, and so on 100 times.
 * At the and print the ending coordinates.
 */

public class DrunkardWalk
{
    private static int stepNumber=100;
    private static int coordX;
    private static int coordY;

    /**
     * This constructor is constructor for the class DrunkardWalk.
     * The constructor sets the private variable(stepnumber) of the class to its value.
     */
    public DrunkardWalk(int stepNumber)
    {
        this.stepNumber=stepNumber;
        this.coordX=0;
        this.coordY=0;
    }

    /**
     * This method produces a random number and returns that number.
     */
    public static int randomDirection()
    {
        Random random = new Random();
        
        int direction = random.nextInt(4)+1;

        return direction;
    }
    
    /**
     * This method contains a loop from zero to stepNumber and changes the coordinates according to generated random direction
     */
    public static void walkRandomly()
    {
        DrunkardWalk dw =new DrunkardWalk(100);
        
        //1:Left, 2:Down, 3:Right, 4:Up
        for(int i=0; i< dw.stepNumber; i++)
        {
            int ourDirection=randomDirection();
            if(ourDirection==1){
                coordX-=1;
            }
            else if(ourDirection==2)
            {
                coordY-=1;
            }
            else if(ourDirection==3)
            {
                coordX+=1;
            }
            else if(ourDirection==4)
            {
                coordY+=1;
            }
        }
        
        System.out.println("Arrived (" + coordX + "," + coordY + ")" );
    }
}
