public class ContohInterface {
    public static void main(String[] args) {
        Object[] o = new Object[]{new Burung(), new Kucing(), new Nyamuk(), new Pesawat()};

        for (Object i: o) {
            if (i instanceof Flyable) {
                Flyable j = (Flyable) i;
                j.fly();
            } else {
                System.out.println(i.getClass().getName() + " is not flyable");
            }
        }
    }
}
