public class Barang {
    // attribute
    String nama;
    int hargaSatuan;
    double ppn; // 0.11

    // constructor
    public Barang(String nama, int hargaSatuan, double ppn) {
        this.nama = nama;
        this.hargaSatuan = hargaSatuan;
        this.ppn = ppn;
    }

    // totalHargaSebelumPPN = hargaSatuan * qtyJual
    // totalPPN = totalHargaSebelumPPN * ppn
    // totalHargaSetelahPPN = totalHargaSebelumPPN + totalPPN
    public double hitungTotalHarga(int qtyJual) {
        int totalHargaSebelumPPN = this.hargaSatuan * qtyJual;
        double totalPPN = totalHargaSebelumPPN * this.ppn;

        return totalHargaSebelumPPN + totalPPN;
    }

    public static void main(String []args) {
        Barang b1 = new Barang("Buku", 10000, 0.11);
        System.out.println("Total Harga: " + b1.hitungTotalHarga(5));
    }
}