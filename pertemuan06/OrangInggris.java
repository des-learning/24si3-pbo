public class OrangInggris extends Orang {
    public OrangInggris(String nama) {
        super(nama);
    }

    public void menyapa(Orang lain) {
        System.out.println("Hello, " + lain.getNama());
    }
}
