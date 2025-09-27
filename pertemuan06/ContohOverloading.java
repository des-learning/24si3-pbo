public class ContohOverloading {
    public static void main(String []args) {
        OrangIndonesia budi = new OrangIndonesia("Budi");
        OrangIndonesia anto = new OrangIndonesia("Anto");
        OrangInggris alex = new OrangInggris("Alex");
        OrangJepang naruto = new OrangJepang("Naruto");


        budi.menyapa(alex);
        budi.menyapa(naruto);

        budi.menyapa(anto, "Selamat malam");
        budi.menyapa(alex, "Good evening");
        budi.menyapa(naruto, "こんばんは");
        budi.menyapa(anto, "こんばんは");

        budi.menyapa(anto); // selamat pagi
        // upcasting
        budi.menyapa((Orang) anto); // hi

        Orang[] orang = new Orang[]{
            new OrangIndonesia("Anto"),
            new OrangInggris("John"),
            new OrangJepang("Musashi"),
        };

        for (Orang o: orang) {
            System.out.println(o.getNama());
            // subcasting
            if (o instanceof OrangJepang) {
                OrangJepang j = (OrangJepang) o;
                j.samurai();
            }
        }
    }
}
