package t6_2210631170025_juliana.widianti.d.p;

import java.util.Scanner;
 
/*
 * @author Juliana
 */
public class bilanganPrima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Batas Atas: ");
        int batasAtas = input.nextInt();

        System.out.println("Deret Bilangan Prima adalah:");
        for (int a = 0; a <= batasAtas; a++) {
            if (isPrima(a)) {
                System.out.print(a + " ");
            }
        }

        System.out.println("\n\nDeret Bilangan Bukan Prima:");
        for (int a = 0; a <= batasAtas; a++) {
            if (!isPrima(a)) {
                System.out.print(a + " ");
            }
        }
    }

    // Fungsi untuk menentukan apakah suatu bilangan prima atau bukan
    public static boolean isPrima(int angka) {
        if (angka <= 1) {
            return false;
        }

        for (int a = 2; a <= Math.sqrt(angka); a++) {
            if (angka % a == 0) {
                return false;
            }
        }

        return true;
    }
}
