import lang.stride.*;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 * The Driver class for whole assignment
 */
public class Driver
{
    public static void main(String[] params)
    {
        int question=-1;
        while(true)
        {
            System.out.println("Press 1 for Question 1");
            System.out.println("Press 2 for Question 2");
            System.out.println("Press 3 for Question 3");
            System.out.println("Press 0 for exit.");
            
            Scanner scan = new Scanner(System.in);
            question = scan.nextInt();
            scan.nextLine();
            if(question==0)
                break;
            //scan.nextLine();
            
            switch(question){
                case 1: {
                    Person person = new Person("Ali");
                    System.out.println(person.toString());
                    Employee employee = new Employee("Ali",8000);
                    System.out.println(employee.toString());
                    Manager manager = new Manager("Mahmut",18000,"Finance");
                    System.out.println(manager.toString());
                    Executive executive =new Executive("Huma",28000,"ProductSupply","Agean01");
                    System.out.println(executive.toString());
                    break;                    
                }
                
                case 2: {
                    char answer;
                    System.out.println("Do you want to add a person?(Y/N)");
                    answer = scan.nextLine().charAt(0);
                    int count = 0;
                    Person minP=null, maxP=null;
                    
                    while(answer=='Y'){
                        count+=1;
                        System.out.println("Enter the name of the person!");
                        String name = scan.nextLine();
                        Person person = new Person(name);
                        if(count==1){
                            minP = person;
                            maxP = person;
                        }
                        else{
                            if(person.compareTo(minP)<0){
                                minP=person;
                            }
                            if(person.compareTo(maxP)>=0){
                                maxP=person;
                            }
                        }
                        System.out.println("Do you want to add a person?(Y/N)");
                        answer = scan.nextLine().charAt(0);
                    }
                    System.out.println("First name:"+minP.getName()+"\n");
                    System.out.println("Last name:"+maxP.getName()+"\n");
                    break;
                }
                
                case 3:{
                    Population population = new Population ( );
                    System.out.println("Do you want to add a person?(Y/N)");
                    char answer = scan.nextLine().charAt(0);
                    // scan.nextLine();
                    while(answer=='Y'){
                        System.out.println("Enter the name of the person!");
                        String name = scan.nextLine();
                        Person person = new Person(name);
                        population.addPerson(person);
                        System.out.println("Do you want to add a person?(Y/N)");
                        answer = scan.nextLine().charAt(0);
                        // scan.nextLine();
                    }
                    population.sortByName();
                    PopulationViewer pw = new PopulationViewer();
                    pw.viewNames(population);
                }
            }
        }
    }
}
