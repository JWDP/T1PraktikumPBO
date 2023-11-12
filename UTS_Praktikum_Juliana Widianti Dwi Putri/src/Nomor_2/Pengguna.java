package Nomor_2;

import java.util.ArrayList;

// Abstraksi dan Polimorfisme
public abstract class Pengguna{
    protected String username;
    protected String password;
    protected String role;

    public void Pengguna( String username, String password){
        this.username = username;
        this.password = password;
    }
   public void lihatDaftarBuku(ArrayList<Buku>daftarBuku){
    System.out.println("DAFTAR BUKU PERPUSTAKAAN");
    for(Buku buku : daftarBuku){
       System.out.println("Judul: "+buku.getJudul());
       System.out.println("Genre: "+buku.getGenre());
       System.out.println("Penulis: "+buku.getPenulis()); 
       System.out.println("-------------------------"); 
    }
   }
    public boolean isAdmin(){
        return role.equals("Admin");
    }
}
