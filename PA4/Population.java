import java.util.*;
import java.lang.*;
/**
 * The Population class with 7 method
 */
public class Population
{
    // instance variables - replace the example below with your own
    private ArrayList<Person> people;
    private int order;
    
    /**
     * Constructor for objects of class Population
     * The constructor creates a n ArrayList of Person and sets the private variable order by 0(zero).
     */
    public Population()
    {
        // initialise instance variables
        this.people = new ArrayList<Person>();
        order = 0;
    }

    /**
     * This function adds a person to the ArrayList.
     */
    public void addPerson(Person person)
    {
        this.people.add(person);
    }
    
    /**
     * This function increases the order variable by 1.
     */
    public void increaseOrder()
    {
        this.order=order+1;
    }
    
    /**
     * This function returns the private variable order.
     */
    public int getOrder()
    {
        return this.order;
    }
    
    /**
     * This function returns the person at the given order.
     */
    public Person getPersonByOrder(int Order)
    {
        return this.people.get(Order);
    }
    
    /**
     * This function returns the person who has the given name.
     */
    public Person getPersonByName(String name)
    {
        int i=people.indexOf(name);
        return people.get(i);
    }
    
    /**
     * This function sorts the persons in the people ArrayList according their names lexicographically.
     */
    public void sortByName()
    {
        people.sort(Comparator.comparing(Person::getName));
    }
}
