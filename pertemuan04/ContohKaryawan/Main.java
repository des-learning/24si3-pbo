package ContohKaryawan;

public class Main {
    public static void main(String []args) {
        KaryawanTetap kt = new KaryawanTetap(1000000, 20000000);
        KaryawanHonorer kh = new KaryawanHonorer(40, 100000);

        System.out.println("Gaji karyawan tetap: "  + kt.gaji());
        System.out.println("Gaji karyawan honorer: " + kh.gaji());
    }
}
