import java.util.List;
import java.util.LinkedList;
import java.util.Collections;

public class ContohComparable {
   public static void main(String []args) {
    List<Integer> a = new LinkedList<>();

    a.add(7);
    a.add(5);
    a.add(10);
    a.add(1);
    System.out.println(a.toString());
    Collections.sort(a);
    System.out.println(a.toString());

    //////
    List<MataKuliah> matakuliah = new LinkedList<>();

    matakuliah.add(new MataKuliah("D0002", "Perancangan Database", 3));
    matakuliah.add(new MataKuliah("P0002", "Pemrograman Web", 1));
    matakuliah.add(new MataKuliah("D0001", "Dasar Pemrograman", 2));
    matakuliah.add(new MataKuliah("P0001", "Artificial Intelligence", 3));

    System.out.println("Sebelum di urutkan");
    for (MataKuliah m: matakuliah) {
        System.out.println(m.toString());
    }

    Collections.sort(matakuliah);

    System.out.println("Setelah di urutkan");
    for (MataKuliah m: matakuliah) {
        System.out.println(m.toString());
    }
   } 
}
