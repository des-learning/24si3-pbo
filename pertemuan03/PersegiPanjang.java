public class PersegiPanjang {
    private int panjang;
    private int lebar;

    public PersegiPanjang(int panjang, int lebar) {
      this.setPanjang(panjang);
      this.setLebar(lebar);
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        if (panjang <= 0) {
            throw new IllegalArgumentException("Panjang harus lebih besar dari 0");
        }

        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
      if (lebar <= 0) {
            throw new IllegalArgumentException("Lebar harus lebih besar dari 0");
        }

        this.lebar = lebar;
    }

    public int hitungLuas() {
        return panjang * lebar;
    }
  }
