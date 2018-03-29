
/**
 * Write a description of class ArrayListGeneral here.
 *
 * @author (Saleh)
 * @version (3/29 )
 */

import java.util.ArrayList;
public class ArrayListGeneral
{
  public static void main()
    {
        ArrayList<Integer> myArray = new ArrayList<Integer>(3);
  
      // Let's make a different kind of list
      
      int[] myList=new int[] { 1, 2, 3, 4, 5, 6, 7 };
      
      System.out.print(myList);
      
      //What happens here?
      
      for (int i:myList)
      {
      System.out.print(i);  
      }
      
    
    
    }
    
    
    
    }
