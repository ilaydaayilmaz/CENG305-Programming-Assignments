import java.util.ArrayList;
import java.util.Random;
/**
 * This class is for the problem 3 and includes 4 methods with
 * a constuctor.
 */
public class Draw
{
    private ArrayList<Reader> participants;
    private String drawID;
    private String correctAnswer;
    /**
     * Is constructor for the class Draw and,
     * sets the private variables to their values and creates 
     * an empty array list of the participant readers.
     */
    public Draw(String drawID, String correctAnswer)
    {
        //TODO
        participants = new ArrayList<Reader>();
        this.drawID = drawID;
        this.correctAnswer = correctAnswer;
    }
    /**
     * Adds the participants 
     * to the arraylist participants.
     */
    public void addParticipant(String name, String TCID, String answer)
    {
        Reader rd = new Reader(name, TCID, answer);
        participants.add(rd);
    }
    /**
     * Finds the correct answer givers
     * among the participants and returns an arraylist of them.
     */
    public ArrayList<Reader> findCorrectAnswerGivers()
    {
        //TODO
        ArrayList<Reader> correctAnswerGivers = new ArrayList<Reader>();
        int size = participants.size();
        for(int i =0; i<size; i++)
        {
            String participantAnswer = participants.get(i).getanswer();
            if (participantAnswer.equals(correctAnswer))
            {
                correctAnswerGivers.add(participants.get(i));
            }
        }
        return correctAnswerGivers;
    }
    /**
     * Makes a draw among the correct answer givers 
     * and return an arraylist of the winners.
     */
    public ArrayList<Reader> makeDraw(ArrayList<Reader> correctAnswerGivers)
    {
        //TODO
        ArrayList<Reader> randomWinners = new ArrayList<Reader>();
        Random random = new Random();
        int numberOfWinners = correctAnswerGivers.size();
        //First winner
        Reader win1 = correctAnswerGivers.get(random.nextInt(numberOfWinners));
        randomWinners.add(win1);
        
        correctAnswerGivers.remove(win1); // to not get the same person twice
        
        //Second winner
        Reader win2 = correctAnswerGivers.get(random.nextInt(numberOfWinners));
        randomWinners.add(win2);
        
        return randomWinners;
    }
    /**
     * Displays the TC IDs and names of 
     * the two winners.
     */
    public void displayWinners(ArrayList<Reader> winners){
        //TODO
        int sizeOfWinners= winners.size();
        for(int i = 0; i<sizeOfWinners; i++){
            System.out.print((i+1)+". winner's TCID = "+winners.get(i).getTCID()+" Name = "+winners.get(i).getname()+"\n");
        }
    }
}