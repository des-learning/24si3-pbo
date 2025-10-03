import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TransaksiPenjualan {
    private List<ItemPenjualan> items;
    private String kasir;
    private LocalDate tanggal;
    private String pembayaran;
    private double ppn;

    public TransaksiPenjualan(String kasir, LocalDate tanggal, double ppn) {
        this.kasir = kasir;
        this.tanggal = tanggal;
        this.items = new ArrayList<>(); // inisialisasi list
        this.pembayaran = "tunai";
        this.ppn = ppn;
    }

    public List<ItemPenjualan> getItems() {
        return items;
    }

    public String getKasir() {
        return kasir;
    }

    public LocalDate getTanggal() {
        return tanggal;
    }

    public String getPembayaran() {
        return pembayaran;
    }

    public double getPpn() {
        return ppn;
    }

    public double getTotalSebelumPajak() {
        double total = 0.0;

        for (ItemPenjualan i: items) {
            total += i.getSubTotal();
        }

        return total;
    }

    public double getPajak() {
        return this.ppn * this.getTotalSebelumPajak();
    }

    public double getTotalSetelahPajak() {
        return this.getTotalSebelumPajak() + this.getPajak();
    }

    public ItemPenjualan tambahItem(Barang barang, int quantity) {
        // cari item barang yang ditambahkan, jika belum ada tambahkan item barang
        // baru
        // jika sudah ada, tambahkan quantity
        ItemPenjualan item = this.findOrCreateItemPenjualan(barang);

        item.tambahQuantity(quantity);

        return item;
    }

    public void cetakFaktur() {
        System.out.println("Tanggal: " + this.tanggal);
        System.out.println("Kasir: " + this.kasir);
        System.out.println("Pembayaran: " + this.pembayaran);
        System.out.println();
        System.out.printf("%20s %20s %20s %20s\n", "Nama", "Harga", "Quantity", "Subtotal");
        for (ItemPenjualan i: this.items) {
            Barang item = i.getItem();
            System.out.printf("%20s %20.2f %20d %20.2f\n", 
                item.getNama(), item.getHarga(),
                i.getQuantity(), i.getSubTotal()
            );
        }
        System.out.println("Total sebelum pajak: " + this.getTotalSebelumPajak());
        System.out.println("Pajak: " + this.getPajak());
        System.out.println("Total setelah pajak: " + this.getTotalSetelahPajak());
    }

    private ItemPenjualan findOrCreateItemPenjualan(Barang barang) {
        for (ItemPenjualan i: items) {
            if (i.getItem().getBarcode().equals(barang.getBarcode())) {
                return i;
            }
        }

        ItemPenjualan newItem = new ItemPenjualan(barang, 0);
        items.add(newItem);

        return newItem;
    }

}
