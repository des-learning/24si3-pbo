import java.time.LocalDate;

public class DemoTransaksiPenjualan {
    public static void main(String []args) {
        TransaksiPenjualan p = new TransaksiPenjualan(
            "Budi", LocalDate.now(), 0.11
            );

        Barang b1 = new Barang("B0001", "Buku", 10000.0);
        Barang b2 = new Barang("B0002", "Pena", 5000.0);
        Barang b3 = new Barang("B0003", "Pensil", 3000.0);
        p.tambahItem(b1, 10);
        p.tambahItem(b1, 2);
        p.tambahItem(b2, 7);
        p.tambahItem(b3, 2);

        p.cetakFaktur();
    }
}
