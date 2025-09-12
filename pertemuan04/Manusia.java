public class Manusia {
    private String nama;

    public Manusia(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
    
    public static void main(String []args) {
        Mahasiswa budi = new Mahasiswa("1111", "Budi");

        System.out.println("NIM: " + budi.getNim());
        System.out.println("Nama: " + budi.getNama());
    }
}

class Mahasiswa extends Manusia {
    private String nim;

    public Mahasiswa(String nim, String nama) {
        super(nama);
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }
}
