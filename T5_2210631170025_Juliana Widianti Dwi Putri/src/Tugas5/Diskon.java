package Tugas5;
import java.util.Scanner;
public class Diskon {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("******** PROGRAM MENENTUKAN POTONGAN HARGA / DISKON ********");
        
        System.out.print("Masukan Total Pembelian: ");
        double total = input.nextDouble();
        double diskon;
        double totalFinal;
        
        if (total<50000){
            diskon = total * 0.05;
            totalFinal = total - diskon;
            
        } else if(total>=50000){
            diskon = total * 0.20;
            totalFinal = total - diskon;
            
        System.out.println("Total Pembelian: Rp. "+total);
        System.out.println("Besarnya Potongan: Rp."+diskon);
        System.out.println("Jumlah Yang Harus dibayarkan: Rp."+totalFinal);
        }      
    }
}
