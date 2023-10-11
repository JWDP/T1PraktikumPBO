package Mahasiswaa;
public class MahasiswaBeraksi {

    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs = new Mahasiswa();
        
        System.out.println("Aksi Mahasiswa 1: ");
        mhs.membaca();
        mhs.nyontek();
        mhs.modifikasi();
        
        System.out.println("\nAksi Mahasiswa 2: ");
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.membaca();
        mhs2.modifikasi();
    }
    
}
