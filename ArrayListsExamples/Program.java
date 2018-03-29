
/**
 * Write a description of class Program here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

   import java.util.ArrayList;

public class Program {
    public static void main() {

        int[] ids = {-3, 0, 100};
        ArrayList<Integer> values = new ArrayList<>();

        // Add all the ints as Integers with add.
        // ... The ints are cast to Integer implicitly.
        for (int id: ids) {
            values.add(id);
        }

        System.out.println(values);
        // The collections have the same lengths.
        System.out.println(values.size());
        System.out.println(ids.length);
    }
}