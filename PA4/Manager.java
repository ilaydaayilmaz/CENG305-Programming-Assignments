
/**
 * The Manager class that extends Employee class with 4 method.
 *
 */
public class Manager extends Employee
{
    // instance variables 
    private String department;

    /**
     * Constructor for objects of class Manager
     * The constructor sets the private variables of the class.
     */
    public Manager(String name, int salary, String department)
    {
        // initialise instance variables
        super(name,salary);
        this.department = department;
    }

    /**
     * This function set the department of the manager.
     */
    public void setDepartment(String department)
    {
       this.department = department;
    }
    
    /**
     * This function returns the department of the manager.
     */
    public String getDepartment()
    {
        return department;
    }
    
    /**
     * This function returns the text.
     */
    public String toString()
    {
        return super.toString()+"His/her department is "+getDepartment()+".\n";
    }
}
