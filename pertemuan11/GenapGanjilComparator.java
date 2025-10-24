import java.util.Comparator;

public class GenapGanjilComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        int genapGanjilO1 = o1 % 2;
        int genapGanjilO2 = o2 % 2;

        return genapGanjilO1 - genapGanjilO2;
    }
}
