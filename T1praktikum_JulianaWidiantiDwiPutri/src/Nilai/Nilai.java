package Nilai;

public class Nilai {
    String nama;
    int Nim;
    double nilaiAbsen;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    
   public Nilai(String nama,int Nim){
       this.Nim = Nim;
       this.nama = nama;
       this.nilaiAbsen = nilaiAbsen;
       this.nilaiTugas = nilaiTugas;
       this.nilaiUTS = nilaiUTS;
       this.nilaiUAS = nilaiUAS;
   }
   
   public void CetakNilai(){
       double nilaiAkhir = (nilaiAbsen * 0.10) + (nilaiTugas * 0.20) + (nilaiUTS * 0.30) + (nilaiUAS * 0.40);
       System.out.println("NIM: " + Nim);
       System.out .println("Nama: " + nama);
       System.out.println("Nilai Absen[10%]: " + nilaiTugas);
       System.out.println("Nilai Tugas[20%]: " + nilaiTugas);
       System.out.println("Nilai UTS[30%]: " + nilaiUTS);
       System.out.println("Nilai UAS[40%]: " + nilaiUAS);
       System.out.println("Nilai Akhir : " + nilaiAkhir);
       
   }
}   


