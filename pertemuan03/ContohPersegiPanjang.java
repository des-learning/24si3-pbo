public class ContohPersegiPanjang {
    public static void main(String[] args) {
        PersegiPanjang persegiPanjang = new PersegiPanjang(10, 5);

        System.out.println("Panjang: " + persegiPanjang.getPanjang());
        System.out.println("Lebar: " + persegiPanjang.getLebar());
        System.out.println("Luas: " + persegiPanjang.hitungLuas());
    }
}
