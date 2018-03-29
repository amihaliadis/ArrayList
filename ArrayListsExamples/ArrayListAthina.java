
/**
 * Write a 
 */
import java.util.ArrayList;
public class ArrayListAthina{
    public void main(){
        ArrayList<String> ClothingBrands = new ArrayList<String>();
        ArrayList<String> Bags = new ArrayList<String>();
        ArrayList<String> Temp = new ArrayList<String>();
        ArrayList<String> Temp1 = new ArrayList<String>();

        ClothingBrands.add("AE");
        ClothingBrands.add("Hollister");
        Bags.add("ABC");
        Bags.add("XYZ");
        Temp.add("");
        Temp.add("");
        Temp1.add("");
        Temp1.add("");


        System.out.println("After the Swap:");
        int index = 0;
        int i =0;

        while(index < ClothingBrands.size())
        {
            ClothingBrands.get(index);
            Temp.set(index,ClothingBrands.get(index));
            Bags.get(index);
            Temp1.set(index,Bags.get(index));
            index++;

        }
        while (i < 2)
        {
            System.out.println(Temp.get(i));
            System.out.println(Temp1.get(i));
            i++;
        }
        

    }
}
