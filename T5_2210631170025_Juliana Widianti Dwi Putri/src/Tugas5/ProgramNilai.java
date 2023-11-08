package Tugas5;
import java.util.Scanner;
public class ProgramNilai {
   public static void main(String[]args){
    //Input   
        Scanner input = new Scanner(System.in);
        System.out.println("******** PROGRAM MENENTUKAN NILAI MAHASISWA ********");
        
        System.out.print("Masukan NPM: ");
            String npm = input.nextLine();
        
        System.out.print("Masukan Nama Mahasiswa: ");
            String nama = input.nextLine();
         
        System.out.print("Masukan Nilai Kehadiran: ");
            double nilaik = input.nextDouble();
        
        System.out.print("Masukan Nilai Tugas: ");
            double nilait = input.nextDouble();
        
        System.out.print("Masukan Nilai UTS: ");
            double nilaiut = input.nextDouble();
        
        System.out.print("Masukan Nilai UAS: ");
            double nilaiua = input.nextDouble();
            
    //Menentukan Nilai Akhir    
            double nilaiAkhir = (0.10 * nilaik)+(0.20 * nilait)+(0.30 * nilaiut)+(0.40 * nilaiua);
    
    // Menentukan Grade
        String grade;
        String keterangan;
        
        if(nilaiAkhir >= 76 ){
            grade = "A";
            keterangan = "ISTEMEWA";
        }else if(nilaiAkhir >=66){
            grade = "B";
            keterangan = "Baik";
        }else if(nilaiAkhir >=56){
            grade = "C";
            keterangan = "Cukup";
        }else if(nilaiAkhir >= 46){
            grade = "D";
            keterangan = "Kurang";
        }else{
            grade = "E";
            keterangan = "KURANG SEKALI";
        }
    
        System.out.println();
        
        
    //Output        
        System.out.println("NPM Mahasiswa:"+npm);
        System.out.println("Nama Mahasiswa:"+nama);
        System.out.println("Nilai Rata-rata:"+String.format("%2f",nilaiAkhir)); // Mengubah Nilai Akhir menjadi format String
        System.out.println("Nilai Tugas:"+nilait); 
        System.out.println("Grade:"+grade);
        System.out.println("Keterangan:"+keterangan);
}
}
