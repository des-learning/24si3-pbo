import java.util.List;
import java.util.LinkedList;
import java.util.Collections;

public class ContohComparator {
   public static void main(String []args) {
        List<Integer> a = new LinkedList<>();

        a.add(12);
        a.add(2);
        a.add(7);
        a.add(5);
        a.add(10);
        a.add(1);
        System.out.println(a.toString());
        Collections.sort(a, new GenapGanjilComparator());
        System.out.println(a.toString());
   } 
}
