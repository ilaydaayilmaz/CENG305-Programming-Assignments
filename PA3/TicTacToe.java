import java.util.Scanner ;
import javax.swing.JOptionPane;
import java.util.*;
/**
 * This class is for the problem 1 and includes 4 methods
 * with a constructor.
 */
public class TicTacToe
{
    //instance variables - replace the example below with your own
    private String[][] board = new String[3][3];
    /**
     * Constructor for objects of class TicTacToe.
     * Initialize the private variable board(3x3).
     */
    public TicTacToe()
    {
        //initialise instance variables
        for(int i=0; i<3; i++)
            for(int j=0; j<3;j++)
                board[i][j] = "-";
    }
    /**
     * Prints the coordinates on the board and 
     * the current view of the board.
     */
    public void printBoard()
    {
        System.out.println("COORDINATES ON THE BOARD");
        System.out.println("(0,0)   (0,1)   (0,2)\n");
        System.out.println("(1,0)   (1,1)   (1,2)\n");
        System.out.println("(2,0)   (2,1)   (2,2)\n");
        
        System.out.println("CURRENT BOARD");
        for(int i=0; i<3; i++){
            for(int j=0; j<3 ; j++){
                System.out.print(board[i][j]+"   ");
            }
            System.out.println("\n");
        }

    }
    /**
     * Prints the available coordinates on the board.
     */
    public void printAvailableCoordinates()
    {
        //TODO
        System.out.println("AVAILABLE COORDINATES ON THE BOARD");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3 ; j++)
            {
                if(board[i][j]=="-")
                {
                    System.out.print("("+i+","+j+"), ");
                }
            }
        }
        System.out.println("\n");
    }
    /**
     * Checks whether there is a winner. 
     * Checks rows, colums and diagonal coordinates if 
     * there are three of the same mark(X or O).
     */
    public int checkWinDrawn()
    {
        //TODO
        //Row
        for(int i=0;i<3;i++){
            if(board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != "-")
            {
                return 0;
            }
        }
        //Column
        for(int j=0;j<3;j++)
        {
            if(board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] !="-")
            {
                return 0;
            }
        }
        //Diagonals
        if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != "-")
        {
            return 0;
        }
        if(board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[2][0] != "-")
        {
            return 0;
        }
        //Nobody win
        int emptySlot=0;
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3 ; j++)
            {
                if(board[i][j]=="-")
                {
                    emptySlot++;
                }
            }
        }
        if(emptySlot==0){
            return 0;
        }
        return 1;
    }
    /**
     * Lets the players to put their marks 
     * to the available coordinates.
     */
    public void playGame()
    {
        //TODO
        boolean isPlayer1=true;
        while(checkWinDrawn()==1)
        {
            String symbol= "O";
            if(isPlayer1==true){
                JOptionPane.showMessageDialog(null, "It is FIRST PLAYER turn");
                symbol = "O";
            } else if(isPlayer1==false){
                JOptionPane.showMessageDialog(null, "It is SECOND PLAYER turn");
                symbol = "X";
            }
            printBoard();
            printAvailableCoordinates();
            
            String coordinates = JOptionPane.showInputDialog("Please enter the coordinates of the place you would like to mark:");
            char row = coordinates.charAt(0);
            char column = coordinates.charAt(2);
            int rowNumber=Character.getNumericValue(row);
            int columnNumber=Character.getNumericValue(column);
            
            if(board[rowNumber][columnNumber]=="-"){
                board[rowNumber][columnNumber]=symbol;
            }
            
            if(isPlayer1==true){
                isPlayer1=false;
            } else if(isPlayer1==false){
                isPlayer1=true;
            }
            
        }
        
        if(checkWinDrawn()==0){
            //I print opposite of isPlayer1 because at the end of while loop I converted to opposite.
            if(isPlayer1==false){
                JOptionPane.showMessageDialog(null, "FIRST PLAYER WINS");
            }else if(isPlayer1==true){
                JOptionPane.showMessageDialog(null, "SECOND PLAYER WINS");
            }
        }

    }
}