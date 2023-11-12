
package Nomor_2;

import java.util.ArrayList;

public class Buku{
    private String judul;
    private String genre;
    private String penulis;

    public Buku(String judul, String genre, String penulis) {
        this.judul = judul;
        this.genre = genre;
        this.penulis = penulis;
    }

    public String getJudul() {
        return judul;
    }

    public String getGenre() {
        return genre;
    }
    public String getPenulis() {
        return penulis;
    }
}