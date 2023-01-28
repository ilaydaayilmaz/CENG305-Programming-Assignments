/**
 * This class is for the problem 2 and includes 3 methods with 
 * a constructor.
 */
public class Theater
{
    //instance variables - replace the example below with your own
    private static int[][] seatsPrices;
    /**
     * Is constructor for the class Theater and, sets the private
     * variable seatsPrices to their values.
     */
    public Theater()
    {
        //initialise instance variables
        int[][] seatsPrices= {{10,10,10,10,10,10,10,10,10,10},
                            {10,10,10,10,10,10,10,10,10,10},
                            {10,10,10,10,10,10,10,10,10,10},
                            {10,10,20,20,20,20,20,20,10,10},
                            {10,10,20,20,20,20,20,20,10,10},
                            {10,10,20,20,20,20,20,20,10,10},
                            {20,20,30,30,40,40,30,30,20,20},
                            {20,30,30,40,50,50,40,30,30,20},
                            {30,40,50,50,50,50,50,50,40,30}};
        this.seatsPrices=seatsPrices;
        
        
    }
    /**
     * Checks availability of the seat 
     * with respect to its coordinates(i,j).
     */
    public boolean checkAvailabilityOfSeat(int i, int j){
        //TODO
        if(seatsPrices[i][j]==0){
            return false;
        } else {
            return true;
        }
    }
    /**
     * Reserves the seat which means 
     * sets the price of the seat (i,j) to zero.
     */
    public void reserveSeat(int i, int j){
        //TODO
        this.seatsPrices[i][j] = 0 ;
    }
    /**
     * Finds the first available seat with 
     * respect to the price.
     */
    public int[] findTheFirstAvailablePlaceAccordingToPrice(int price){
        int[] coordinates = {-1,-1};
        boolean founded =false;
        //TODO
        for(int i = 0 ; i < 9 ; i++)
        {
             for(int j = 0 ; j < 10 ; j++)
             {
                 if(seatsPrices[i][j] == price){
                     coordinates[0]=i;
                     coordinates[1]=j;
                     founded=true;
                     break;
                 }
             }
             if(founded)
             {
                 break;
             }
        }
        return coordinates;
    }
}