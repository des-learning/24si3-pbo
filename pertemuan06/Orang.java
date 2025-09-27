public abstract class Orang {
    private String nama;

    public Orang(String nama) {
        this.nama = nama;
    }

    public abstract void menyapa(Orang lain);

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}