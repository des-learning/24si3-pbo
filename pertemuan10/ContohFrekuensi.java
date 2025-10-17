import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

public class ContohFrekuensi {
   public static void main(String []args) {
    int[] data = new int[]{
        10, 5, 7, 8, 5, 8, 8, 7, 3, 7, 7, 5, 2, 1
    };

    Map<Integer, Integer> freq = new HashMap<Integer, Integer>();

    for (int i: data) {
        if (freq.containsKey(i)) {
            freq.put(i, freq.get(i) + 1);
        } else {
            freq.put(i, 1);
        }
    }
    System.out.println(freq.toString());

    Map<String, Set<Integer>> genapGanjil = new HashMap<String, Set<Integer>>();
    genapGanjil.put("genap", new HashSet<Integer>());
    genapGanjil.put("ganjil", new HashSet<Integer>());
    for (int i: data) {
        if (i % 2 == 0) {
            genapGanjil.get("genap").add(i);
        } else {
            genapGanjil.get("ganjil").add(i);
        }
    }
    System.out.println(genapGanjil.toString());
   } 
}
