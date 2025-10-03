public class Barang {
    private String barcode;
    private String nama;
    private double harga;

    public Barang(String barcode, String nama, double harga) {
        this.barcode = barcode;
        this.nama = nama;
        this.harga = harga;
    }

    public String getBarcode() {
        return barcode;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }
}