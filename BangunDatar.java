public class BangunDatar {

    float luas()
    {
        System.out.println("Menghitung luas bangun datar");
        return 0;
    }

    float keliling()
    {
        System.out.println("Menghitung keliling bangun datar");
        return 0;
    }
}

class Persegi extends BangunDatar {
    float sisi;

    Persegi() {
        this.sisi = 0;
    }

    Persegi(float sisi) {
        this.sisi = sisi;
    }

    @Override
    float luas() {
        float area = this.sisi * this.sisi;
        System.out.println("Luas persegi = " + area);
        return area;
    }

    @Override
    float keliling() {
        float perimeter = this.sisi * 4;
        System.out.println("Keliling persegi = " + perimeter);
        return perimeter;
    }
}

class Lingkaran extends BangunDatar {
    float r;
    float Pi = (float)3.14;

    Lingkaran() {
        this.r = 0;
    }

    Lingkaran(float r) {
        this.r = r;
    }

    @Override
    float luas() {
        float area = Pi * this.r * this.r;
        System.out.println("Luas lingkaran = " + area);
        return area;
    }

    @Override
    float keliling() {
        float perimeter = Pi * 2 * this.r;
        System.out.println("Keliling lingkaran = " + perimeter);
        return perimeter;
    }
}

class PersegiPanjang extends BangunDatar {
    float panjang, lebar;

    PersegiPanjang() {
        this.panjang = 0;
        this.lebar = 0;
    }

    PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    float luas() {
        float area = this.panjang * this.lebar;
        System.out.println("Luas persegi panjang = " + area);
        return area;
    }

    @Override
    float keliling() {
        float perimeter = 2 * this.panjang * this.lebar;
        System.out.println("Keliling persegi panjang = " + perimeter);
        return perimeter;
    }
}

class Segitiga extends BangunDatar {
    float alas, tinggi;

    Segitiga() {
        this.alas = 0;
        this.tinggi = 0;
    }

    Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    float luas() {
        float area = (this.alas * this.tinggi)/2;
        System.out.println("Luas segitiga = " + area);
        return area;
    }

    @Override
    float keliling() {
        float perimeter = 3 * this.alas;
        System.out.println("Keliling segitiga = " + perimeter);
        return perimeter;
    }
}