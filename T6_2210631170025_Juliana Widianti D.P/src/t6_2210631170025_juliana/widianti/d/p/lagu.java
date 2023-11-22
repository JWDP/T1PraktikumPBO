package t6_2210631170025_juliana.widianti.d.p;
/*
 * @author Juliana
 */
import java.util.Scanner;
public class lagu {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Nilai N (Jumlah anak Ayam):");
        int anak = input.nextInt();
        
          // Bagian pertama lagu
        for (int i = anak; i >= 0; i--) {
            System.out.println("Anak ayam turunlah " + i);
            if (i > 0) {
                System.out.println("Mati satu tinggallah " + (i - 1));
            }
        }

        // Bagian kedua lagu
        System.out.println("\nMati satu tinggallah induknya");
        System.out.println("Induk ayam turun ke lapang");
        System.out.println("Mencari anaknya yang hilang");

        // Bagian ketiga lagu (ulang bagian pertama)
        for (int i = anak; i >= 0; i--) {
            System.out.println("Mati satu tinggallah " + i);
        }

        // Bagian keempat lagu (ulang bagian kedua)
        System.out.println("\nMati satu tinggallah induknya");
        System.out.println("Induk ayam turun ke lapang");
        System.out.println("Mencari anak yang hilang");
        
    }   
}
