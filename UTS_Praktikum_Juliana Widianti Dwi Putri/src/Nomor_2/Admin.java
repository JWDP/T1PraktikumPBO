package Nomor_2;

import java.util.ArrayList;

public class Admin extends Pengguna {
    public Admin(String username, String password, String role){
        super(username, password, role);
    }
    
    @Override
    public void lihatDaftarBuku(ArrayList<Buku> daftarBuku){
        super.lihatDaftarBuku(daftarBuku);
    }
    
    public void tambahBuku(ArrayList<Buku> daftarBuku, Buku bukuBaru){
        daftarBuku.add(bukuBaru);
        System.out.println("Buku" +bukuBaru.getJudul()+ "DI TAMBAHKAN KE PERPUS");
    }
    public void hapusBuku(ArrayList<Buku> daftarBuku, String judul) {
        for (Buku buku : daftarBuku) {
            if (isAdmin()) {
                daftarBuku.remove(buku);
                System.out.println("Buku " + judul + " dihapus dari perpustakaan.");
                return;
            }else{
                System.out.println("MAAF HANYA ADMIN YANG MEMILIKI IZIN");
            }
        }
        System.out.println("Buku " + judul + " tidak ditemukan di perpustakaan.");
    }

}
