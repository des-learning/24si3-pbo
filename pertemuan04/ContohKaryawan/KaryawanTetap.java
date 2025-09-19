package ContohKaryawan;

public class KaryawanTetap extends Karyawan {
    private double gajiPokok;
    private double tunjangan;

    public KaryawanTetap(double gajiPokok, double tunjangan) {
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
    }

    public double gaji() {
        return gajiPokok + tunjangan;
    }
}
