package Matematika;
public class Matematika {
    int tambah = 0;
    int kurang = 0;
    int kali = 0;
    int bagi = 0;
    
    void pertambahan(int a, int b) {
        tambah = a + b;
        System.out.println("Pertambahan     : " + a + " + " + b + "  = " + tambah);
    }

    void pengurangan(int a, int b) {
        kurang = a - b;
        System.out.println("Pengurangan     : " + a + " - " + b + "   = " + kurang);
    }

    void perkalian(int a, int b) {
        kali = a * b;
        System.out.println("Perkalian       : " + a + " * " + b + "   = " + kali);
    }

    void pembagian(int a, int b) {
        bagi = a/b;
        if (b == 0) {
            System.out.println("Pembagian oleh 0 tidak dapat dilakukan.");
        } else {
            System.out.println("Pembagian       : " + a + " / " + b + "   = " + bagi);
    }
    }
}