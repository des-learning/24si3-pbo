// concrete class
public class PersegiPanjang extends Bangun2D {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // override
    @Override
    public double getKeliling() {
        return 2 * panjang + 2 * lebar;
    }

    @Override
    public double getLuas() {
        return panjang * lebar;
    }

    public static void main(String []args) {
        PersegiPanjang p = new PersegiPanjang(10, 3);

        System.out.println(p.getLuas());
        System.out.println(p.getKeliling());
    }
}
