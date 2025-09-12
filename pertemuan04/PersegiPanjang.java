public class PersegiPanjang extends Bangun2D {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    // override/overriding
    public double getLuas() {
        return panjang * lebar;
    }

    public double getKeliling() {
        return 2 * panjang + 2 * lebar;
    }

    public static void main(String []args) {
        PersegiPanjang p = new PersegiPanjang(5.0, 3.0);
        System.out.println("Panjang: " + p.getPanjang());
        System.out.println("Lebar: " + p.getLebar());
        System.out.println("Luas: " + p.getLuas());
        System.out.println("Keliling: " + p.getKeliling());
    }
}
