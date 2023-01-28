
/**
 * This class is to print the prime numbers from 2 to given number.
 */
public class PrimeGenerator
{    
    private static int input;

    /**
     * This constructor is constructor for the class PrimeGenerator. The constructor sets the private variable(input) of the class to its value.
     */
    public PrimeGenerator(int input)
    {
        this.input = input;
    }
    
    /**
     * This method checks if a number(y) is a prime number and returns true if it is a prime number or else returns false.
     */
    public static boolean isPrime(int y){
        boolean tf=true; //The number is prime.;
        for(int i=2; i*i <= y; i++)
        {
            if( y % i == 0)
            {
                tf=false; // The number is divisible, it is not prime.
            }
        }
        return tf;
    }
    
    /**
     * This method prints the numbers(2<=number<=input) if the number is a prime number.
     */
    public static void listPrimes()
    {
        PrimeGenerator pg = new PrimeGenerator(input);
        
        for(int i = 2; i <= pg.input; i++)
        {
            if(isPrime(i))
            {
                System.out.print(i + "\n");
            }
        }
        System.out.println("All prime numbers <=" + pg.input + " are listed"); 
    }

}
