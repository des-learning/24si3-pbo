public class MataKuliah implements Comparable<MataKuliah> {
    private String kode;
    private String nama;
    private int sks;

    public MataKuliah(String kode, String nama, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public int getSks() {
        return sks;
    }

    @Override
    public String toString() {
        return kode + " - " + nama + " (" + sks + " SKS)";
    }

    @Override
    public int compareTo(MataKuliah o) {
        return this.kode.compareTo(o.kode);
        // urutkan berdasarkan nama
        //return this.nama.compareTo(o.nama);
        // urutkan berdasarkan sks, dan kemudian berdasarkan nama
        /*int hasil = this.sks - o.sks;
        if (hasil == 0) {
            return this.nama.compareTo(o.nama);
        }

        return hasil;*/
        // menggunakan method compareTo dr primitve int yang
        // di cast jadi class Integer
        // return ((Integer)this.sks).compareTo((Integer)o.sks);
    }
}
