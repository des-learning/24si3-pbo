public class Lingkaran extends Bangun2D {
    private double r;

    public Lingkaran(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    @Override
    public double getKeliling() {
        return 2 * 3.14 * r;
    }

    @Override
    public double getLuas() {
        return 3.14 * r * r;
    }
}
