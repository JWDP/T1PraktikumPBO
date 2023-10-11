package Nilai;

public class DemoNilai {

    public static void main(String[] args) {
        // TODO code application logic here
        Nilai mahasiswa = new Nilai ("Juliana", 1234567810);
        mahasiswa.nilaiAbsen = 100;
        mahasiswa.nilaiTugas = 85;
        mahasiswa.nilaiUTS = 90;
        mahasiswa.nilaiUAS = 80;
        
        mahasiswa.CetakNilai();
    }  
}