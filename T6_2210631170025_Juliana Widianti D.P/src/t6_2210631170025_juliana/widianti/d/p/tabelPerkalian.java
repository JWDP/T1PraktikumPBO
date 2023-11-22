package t6_2210631170025_juliana.widianti.d.p;
/*
 * @author Juliana
 */
import java.util.Scanner;

public class tabelPerkalian {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Nilai n (lebih kecil dari 10 atau sama dengan 10): ");
        int n = input.nextInt();
        
        if( n >10){
            System.out.println("MAAF,NILAI N MELAMPAUI KETENTUAN YANG ADA");
        } else{
            System.out.println("TABEL PERKALIAN " + n + "x" + n + ":");
            System.out.println("----------------------------------------------------------");
            // MENAMPILKAN HEADER KOLOM //
            System.out.print("\t");
            for (int i = 1; i <= n; i++){
                System.out.print( i + "\t" );
            }
            System.out.println("\n--------------------------------------------------------");
            
            // MENAMPILKAN ISI TABEL // 
            for (int i = 1; i <= n; i++){
                System.out.print(i+" | ");
                for(int j = 1; j <= n; j++){
                    System.out.print( i * j + "\t" );
                }
                System.out.println();
            }   
            System.out.println("\n--------------------------------------------------------");

        }
        
    }
}
