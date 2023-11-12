package Nomor_2;

import java.util.ArrayList;

public class User extends Pengguna{
    public User(String username, String password, String role){
        super(username, password, role);   
    }
    
    @Override
    public void lihatDaftarBuku(ArrayList<Buku>daftarBuku){
        super.lihatDaftarBuku(daftarBuku);
    }

}