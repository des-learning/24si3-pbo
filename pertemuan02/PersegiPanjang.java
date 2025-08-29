public class PersegiPanjang {
    // attribute
    int panjang;
    int lebar;

    // method constructor
    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int hitungLuas() {
        return this.panjang * this.lebar;
    }

    public static void main(String []args) {
        PersegiPanjang p1 = new PersegiPanjang(10, 5);

        System.out.println("Panjang: " + p1.panjang);
        System.out.println("Lebar: " + p1.lebar);
        System.out.println("Luas: " + p1.hitungLuas());
    }
}