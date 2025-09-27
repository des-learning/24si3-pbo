public class OrangJepang extends Orang {
    public OrangJepang(String nama) {
        super(nama);
    }

    public void menyapa(Orang lain) {
        System.out.pritnln("Hi, " + lain.getNama());
    }

    public void samurai() {
        System.out.println("some samurai action");
    }
}
