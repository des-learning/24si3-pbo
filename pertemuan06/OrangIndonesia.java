public class OrangIndonesia extends Orang {
    public OrangIndonesia(String nama) {
        super(nama);
    }

    // override
    public void menyapa(Orang lain) {
        System.out.println("Hi, " + lain.getNama());
    }

    // overloading
    public void menyapa(OrangIndonesia lain) {
        System.out.println("Selamat pagi, " + lain.getNama());
    }

    public void menyapa(OrangInggris lain) {
        System.out.println("Good morning, " + lain.getNama());
    }

    public void menyapa(Orang lain, String sapaan) {
        System.out.println(sapaan + ", " + lain.getNama());
    }
}
