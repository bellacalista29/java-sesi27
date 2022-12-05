public class Makanan {
    public static void main(String[] args) {
        Restoran data = new Restoran();

            data.setMenu("Ayam Goreng");
            data.setHarga(17000);
            data.setSpesial(true);

            System.out.println("Menu makanan : " + data.getMenu());
            System.out.println("Harga makanan : Rp." + data.getHarga());
            System.out.println("Menu spesial : " + data.isSpesial());
    }
}
