public class Restoran {
    private String menu;
    private double harga;
    private boolean spesial;

    Restoran(boolean spesial) {
        this.spesial = spesial;
    }

    public Restoran() {
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setSpesial(boolean spesial) {
        this.spesial = spesial;
    }

    public String getMenu() {
        return menu;
    }

    public double getHarga() {
        return harga;
    }

    //kalau boolean dia auto generate namanya is, tapi get juga bisa
    public boolean isSpesial() {
        return spesial;
    }

}
