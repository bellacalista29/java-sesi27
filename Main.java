public class Main {
    public static void main(String[] args) {
        BangunDatar bangunDatar = new BangunDatar();

        Persegi persegi = new Persegi(2);
        // persegi.sisi = 2;

        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 22;

        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 8;
        persegiPanjang.lebar = 4;

        Segitiga segitiga = new Segitiga(10,20);
        // segitiga.alas = 12;
        // segitiga.tinggi = 8;

        bangunDatar.luas();
        bangunDatar.keliling();

        persegi.luas();
        persegi.keliling();

        persegiPanjang.luas();
        persegiPanjang.keliling();

        lingkaran.luas();
        lingkaran.keliling();

        segitiga.luas();
        segitiga.keliling();
    }
}
