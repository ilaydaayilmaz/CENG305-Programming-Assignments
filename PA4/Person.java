import java.lang.*;
import java.util.*;
/**
 * The Person class that implements the Comparable interface with 5 method
 */
public class Person implements Comparable<Person>
{
    // instance variables 
    private String name;

    /**
     * Constructor for objects of class Person
     * The constructor sets the private variable(name) of the class.
     */
    public Person(String name)
    {
        // initialise instance variables
        this.name = name;
    }

    /**
     * This function set the name of the person.
     */
    public void setName(String name)
    {
        // put your code here
        this.name = name;
    }
    
    
    /**
     * This function returns the name of the person.
     */
    public String getName()
    {
        return this.name;
    }
    
    /**
     * This function returns the text (”His/her name is”+ this.name+”.”)
     */
    public String toString()
    {
        return "His/her name is "+this.name+". \n";
    }
    
    /**
     * a compareTo function which overloads the compareTo in Comparable Interface
     */
    public int compareTo(Person othePerson)
    {
        //return this.getName().compareTo(othePerson.getName());
        return name.compareTo(othePerson.name);

    }
}
