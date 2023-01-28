
/**
 * The Executive class that extends Manager with 2 method.
 */
public class Executive extends Manager
{
    // instance variables 
    private String regionCode;

    /**
     * Constructor for objects of class Executive
     * The constructor sets the private variables of the class.
     */
    public Executive(String name, int salary, String department, String regionCode)
    {
        // initialise instance variables
        super(name,salary,department);
        this.regionCode = regionCode;
    }

    /**
     * This function returns the text.
     */
    public String toString()
    {
        // put your code here
        return super.toString()+"His region code is "+this.regionCode+".\n";
    }
}
