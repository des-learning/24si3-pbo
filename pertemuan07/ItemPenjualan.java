public class ItemPenjualan {
    // aggregation ItemPenjualan has a Barang
    private Barang item;
    private int quantity;

    public ItemPenjualan(Barang item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public Barang getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getSubTotal() {
        return this.item.getHarga() * this.quantity;
    }

    public int tambahQuantity(int quantity) {
        this.quantity += quantity;

        return this.quantity;
    }

    public int kurangQuantity(int quantity) {
        this.quantity -= quantity;

        if (this.quantity <= 0) {
            this.quantity = 0;
        }

        return this.quantity;
    }
}
