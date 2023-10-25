package Matematika1;

public class Matematika {
    
    public void pertambahan(int a, int b) {
        System.out.println("Hasil Pertambahan     : " + a + " + " + b + "  = " + (a+b));
    }

    public void pengurangan(int a, int b) {
        System.out.println("Hasil Pengurangan     : " + a + " - " + b + "   = " + (a-b));
    }

    public void perkalian(int a, int b) {
        System.out.println("Hasil Perkalian       : " + a + " * " + b + "   = " + (a*b));
    }

    public void pembagian(int a, int b) {
        if (b == 0) {
            System.out.println("Pembagian oleh 0 tidak dapat dilakukan.");
        } else {
            System.out.println("Hasil Pembagian       : " + a + " / " + b + "   = " + (a/b));
    }
 }
}