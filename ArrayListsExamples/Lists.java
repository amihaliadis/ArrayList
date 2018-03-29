
/**
 * Write a description of class AnotherWay here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
/**
 * Basic list introduction.
 *
 * @ S.A.
 * @version (3-29-018)
 */
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Lists
{
    enum people {TheGood, TheBad, TheUgly}
    
    public static void main()
    {
    ArrayList<String> kids=new ArrayList<String>();
    
    kids.add("John");
    kids.add("Sally");
    kids.add("John");
    

    
    System.out.println(kids);
    
    kids.remove(2);
    
    System.out.println(kids);
    
    
    System.out.print(" The list of kids has a size of ");
    System.out.println(kids.size());
    

    kids.add("John");
    
    
    System.out.println(kids.size());
    
    
    
    
    int girl=kids.indexOf("Sally");
    System.out.println("The kid at index "+ girl+" is a girl");
    
    
    
    int johnny=kids.indexOf("John");
    System.out.println("john is the kid number "+ (johnny+1));   
    
     
    boolean t=kids.add("");
    System.out.println(t);
    
//    ArrayList<int> numbers=new ArrayList<int>();
    ArrayList<Integer> numbers=new ArrayList<Integer>(); 
    System.out.println("Here is the numbers ");    
    System.out.println(numbers);    
    
    System.out.println("Moving on ");    
    System.out.println("Enumerated types now.");
      
    
    
     people Clint,Lee,Eli;
        
        Clint=people.TheGood;
        Lee=people.TheBad;
        Eli=people.TheUgly;
     
     ArrayList<people> Cast=new ArrayList<people>();
     
     Cast.add(Clint);
     Cast.add(Lee);
     Cast.add(Eli);
     
     System.out.print(Cast);
     System.out.println();
     System.out.println("Clint is at index"+Cast.indexOf(Clint));


    }
}