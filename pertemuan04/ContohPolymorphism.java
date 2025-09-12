public class ContohPolymorphism {
    public static void main(String []args) {
        Bangun2D []bangun = {
            new PersegiPanjang(5.0, 3.0),
            new Lingkaran(10.0),
        };

        for (Bangun2D b: bangun) {
            System.out.println(b.getClass().getName());
            System.out.println("Luas: " + b.getLuas());
            System.out.println("Keliling: " + b.getKeliling());
        }
    }
}
