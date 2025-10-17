import java.util.Hashtable;
import java.util.Map;

public class ContohMap {
    public static void main(String []args) {
        Map<String,Integer> nilai = new Hashtable<String,Integer>();

        nilai.put("budi", 20);
        nilai.put("susi", 80);
        nilai.put("agus", 70);
        nilai.put("tuti", 90);
        nilai.put("rudi", 70);
        nilai.put("budi", 70);

        System.out.println(nilai.toString());

        System.out.println(nilai.get("rudi"));

        nilai.remove("agus");

        System.out.println(nilai.toString());

        // loop by key
        System.out.println(nilai.keySet().toString());
        for (String i: nilai.keySet()) {
            System.out.println("Nilai " + i + ": " + nilai.get(i));
        }

        // loop by map entry
        for (Map.Entry<String, Integer> n: nilai.entrySet()) {
            System.out.println("Nilai " + n.getKey() + ": " + n.getValue());
        }
    }
}
