package Nomor1;

import java.util.Scanner;

public class SuaraHewan {
    public static void main(String[]args){
       Scanner input = new Scanner(System.in);
       System.out.print("Masukan Jenis Hewan : ");
       String jenisHewan = input.nextLine();
       
       Hewan hewan;
    
       if(jenisHewan.equalsIgnoreCase("Kucing")){ // Mmembandinghkan dua string tanpa perbedaan huruf besar dan kecil
           hewan = new Kucing();
       }else if (jenisHewan.equalsIgnoreCase("Anjing")){
           hewan = new Anjing();
       }else{
           System.out.println("Maaf Jenis Hewan tidak tersedia");
       return;
       }
       
// Melakukan Percabangan untuk menenrtukan hewan tersebut mamalia atau bukan   
       
       System.out.println("Suara Hewan tersebut: ");
               hewan.bersuara();
               
               if(hewan.mamalia()){
                   System.out.println("Hewan ini merupakan hewan mamalia");
               }else{
                   System.out.println("Hewan ini bukan mamalia");
               }
    
    }
}
