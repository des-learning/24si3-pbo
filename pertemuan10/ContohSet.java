import java.util.Set;
import java.util.HashSet;

public class ContohSet {
   public static void main(String []args) {
        Set<Integer> n = new HashSet<Integer>();

        n.add(5);
        n.add(6);
        n.add(5);
        n.add(7);
        n.add(10);
        n.add(7);
        n.add(7);

        System.out.println(n.toString());
   } 
}
