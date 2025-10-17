import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ContohList {
    public static void main(String []args) {
        //List<Integer> a = new ArrayList<Integer>();
        List<Integer> a = new LinkedList<Integer>();

        a.add(10);
        a.add(5);
        a.add(7);
        a.add(9);
        a.add(2);

        System.out.println(a.toString());

        // access by index
        System.out.println(a.get(2));

        // hapus by index
        a.remove(2);
        System.out.println(a.toString());

        // hapus by value
        a.remove((Integer) 2); // (Integer) 2 -> perlakukan 2 sebagai object Integer
        System.out.println(a.toString());
    }
}