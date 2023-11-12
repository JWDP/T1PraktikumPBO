package Nomor_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Perpustakaan {
 public static void main(String[] args) {
     ArrayList<Buku>daftarBuku = new ArrayList<>();
     Buku buku1 = new Buku("Judul Buku 1","Non-Fiksi","Penulis 1");
     Buku buku2 = new Buku("Judul Buku 2","Fiksi","Penulis 2");
     daftarBuku.add(buku1);
     daftarBuku.add(buku2);
     
     User user = new User("user 1", "user1", "user" );
     User admin = new User("admin 1", "admin1", "admin" );
     
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        while (exit){
            System.out.println("WELCOME TO LIBRARY");
            System.out.println("Username : ");
            String username = input.nextLine();
            System.out.println("Password : ");
            String password = input.nextLine();
            
            Pengguna pengguna;
            if(username.equals(user.username) && password.equals(user.password)){
                pengguna = user;
            }else if (username.equals(admin.username) && password.equals(admin.password)){
                pengguna = admin;
            }else {
                System.out.println("USERNAME ATAU PASSWORD SALAH, SILAKAN COBA LAGI");
                continue;
            }
            System.out.println("Anda Berhasil Login sebagai"+ pengguna.role+".");
            System.out.println("MENU");
            System.out.println("1. Daftar Buku");
            System.out.println("2. Menambahkan Buku");
            System.out.println("3. Menghapus Buku");
            System.out.println("4. Keluar");
            System.out.print("Masukan Pilihan Anda : ");
            int pilihan = input.nextInt();
            input.nextLine();
            
            switch (pilihan){
                case 1 :
                    pengguna.lihatDaftarBuku(daftarBuku);
                case 2 :
                    if (pengguna.isAdmin()){
                        System.out.println("Tambahkan data buku yang ingin di inputkan: ");
                        System.out.print("Judul : ");
                        System.out.print("Genre : ");
                        System.out.print("Penulis : ");
                        String judul = input.nextLine();
                        String genre = input.nextLine();
                        String penulis = input.nextLine();
                        Buku bukuBaru = new Buku(judul,genre,penulis);
                        admin.tambahBuku(daftarBuku, bukuBaru);
                    }else{
                        System.out.println("ANDA TIDAK MEMILIKI AKSES UNTUK MENAMBAH BUKU");
                    }
                case 3:
                    if(pengguna.isAdmin()){
                        System.out.println("Masukan Judul yang akan dihapus: ");
                        System.out.print("Judul : ");                   
                        String judul = input.nextLine();
                        admin.tambahBuku(daftarBuku, judul);
                    }else{
                        System.out.println("ANDA TIDAK MEMILIKI AKSES UNTUK MENGHAPUS BUKU");
                    }
                case 4:
                    exit = true;
                    System.out.println("TERIMAKLASIH");
                default:
                    System.out.println("PILIHAN TIDAK ADA,SILAHKAN COBA LAGI");
            }
        }
    }
}
