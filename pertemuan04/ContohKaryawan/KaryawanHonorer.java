package ContohKaryawan;

public class KaryawanHonorer extends Karyawan {
    private int jumlahJamKerja;
    private double honorPerJam;

    public KaryawanHonorer(int jumlahJamKerja, double honorPerJam) {
        this.jumlahJamKerja = jumlahJamKerja;
        this.honorPerJam = honorPerJam;
    }

    public double gaji() {
        return jumlahJamKerja * honorPerJam;
    }
}
