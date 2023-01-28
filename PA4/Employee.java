
/**
 * The Employee class that extends the Person class with 4 method.
 *
 */
public class Employee extends Person
{
    // instance variables 
    private int salary;

    /**
     * Constructor for objects of class Employee
     * The constructor sets the private variables of the class.
     */
    public Employee(String name, int salary)
    {
        // initialise instance variables
        super(name);
        this.salary = salary;
    }

    /**
     * This function set the salary of the employee.
     */
    public void setSalary(int salary)
    {
        this.salary = salary;
    }
    
    /**
     * This function returns the salary of the employee.
     */
    public int getSalary()
    {
        return salary;
    }
    
    /**
     * This function returns the text.
     */
    public String toString()
    {
        return super.toString()+"He/She gets "+getSalary()+" salary. \n";
    }
    
}
