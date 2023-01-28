import lang.stride.* ;
import java.util.Scanner ;
import javax.swing.JOptionPane ;
import java.util.ArrayList;
// I did the homework in the order in the pdf.

/**
 * Main class of homework.
 */
public class Driver
{
    /**
     * Main process of homework.
     */
    public static void main(String[] params)
    {
        // Declare and initialize variable
        int question=-1;
        
        while(true)
        {
            // To choose question
            System.out.println("Press 1 for Question 1");
            System.out.println("Press 2 for Question 2");
            System.out.println("Press 3 for Question 3");
            System.out.println("Press 0 for exit.");
            
            Scanner scan = new Scanner(System.in);
            
            question = scan.nextInt();
            scan.nextLine();
            if(question==0)
                break;
                        
            switch (question) {
                //For question 1
                case 1 : {
                    //TODO
                    TicTacToe ttt = new TicTacToe();
                    ttt.playGame();
                    ttt.printBoard();
                    break;
                }
                //For question 2
                case 2 : {
                    //TODO
                    Theater t = new Theater();
                    char again;
                    do{
                        System.out.println("***********MENU***********\n"+"Press : " + "\n" + 
                                            "1 To choose your place according to seat coordinates" +
                                            "\n"+"2 To choose your place according to price" );
                        int choosingType = scan.nextInt();
                    
                        if(choosingType==1)
                        {
                            System.out.println("WELCOME \nWhere do you want to sit? Write coordinates please. (Between (0,0) and (8,9) both included)");
                            
                            int xCoord = scan.nextInt();
                            int yCoord = scan.nextInt();
                            
                            if(t.checkAvailabilityOfSeat(xCoord,yCoord)){
                                t.reserveSeat(xCoord, yCoord);
                                System.out.println("The place is reserved at "+xCoord+","+yCoord);                                
                            }else{
                                System.out.println("That place is not available. Would you like to get another one?(Y/N)");
                                char getAnotherOne = scan.next().charAt(0);
                            }
                            
                        } else if(choosingType==2){
                            System.out.println("WELCOME \nPlease enter the price of the seat that do you want to sit.");
                            int givenPrice = scan.nextInt();
                            
                            int[] coordsGivenSeat =t.findTheFirstAvailablePlaceAccordingToPrice(givenPrice);
                            t.reserveSeat(coordsGivenSeat[0],coordsGivenSeat[1]);
                            System.out.println("The place reserved is "+coordsGivenSeat[0] + "," + coordsGivenSeat[1]);
                        }
                        
                        System.out.println("Is there anyone who would you like to get a ticket?(Y/N)");
                        again = scan.next().charAt(0);
                        
                    }while(again=='Y');  
                    break;
                }
                //For question 3
                case 3 : {
                    //TODO
                    String again;
                    
                    System.out.println("Enter Draw ID");
                    String enteredDrawID = scan.nextLine();
                    System.out.println("Enter correct answer");
                    String enteredCorrectAnswer = scan.nextLine();
                    
                    Draw d = new Draw(enteredDrawID, enteredCorrectAnswer);
                    
                    
                    do{
                        System.out.println("Enter participant's name");
                        String enteredName = scan.nextLine();
                        
                        System.out.println("Enter participant's TCID");
                        String enteredTCID = scan.nextLine();
                        
                        System.out.println("Enter participant's answer");
                        String enteredAnswer = scan.nextLine();
                        
                        
                        d.addParticipant(enteredName,enteredTCID,enteredAnswer);
                        
                        System.out.println("Is there any more participant?(Y/N)");
                        again = scan.nextLine();
                    }while(again.equals("Y"));
                    d.displayWinners(d.makeDraw(d.findCorrectAnswerGivers()));
                    break;
                }
                
            }
        }
    }
}