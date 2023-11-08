package Tugas5;
import java.util.Scanner;
public class KriteriaKegemukan {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
    System.out.println("******** PROGRAM MENGUKUR KRITERIA BERAT BADAN ********");
    
    //INPUT berat badan(kg) dan Tinggi Badan(m)
    System.out.print("Masukan Berat Badan(kg): ");
    double bb = input.nextDouble();
    System.out.print("Masukan Tinggi Badam(m): ");
    double tb = input.nextDouble();
    
    //Menghitung IMT
    double imt = bb / (tb*tb);
    
    //Menentukan Kriteria Kegemukan
    String kriteria;
    
    if(imt < 18.5){
        kriteria = "BERAT BADAN KURANG";
    }else if(imt >= 18.5 && imt <= 24.9){
        kriteria = "BERAT BADAN IDEAL";
    }else if (imt >= 25 && imt <= 29.9){
        kriteria = "BERAT BADAN LEBIH";
    }else if (imt >= 30 && imt <= 39.9){
        kriteria = "GEMUK";
    }else{
        kriteria = "SANGAT GEMUK";
    }
    
    //OUTPUT
    System.out.println("IMT :" + imt);
    System.out.println("Kriteria :" + kriteria);
    }
}