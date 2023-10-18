package Bingoo;
public class BingoSong {
    String a, b, c, d, e, clap;
    
    public BingoSong(){
        this.a = "B";
        this.b = "I";
        this.c = "N";
        this.d = "G";
        this.e = "O";
        this.clap = "(clap)";
    }

    public void TextBingo(){
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And Bingo was his name-o.");
        System.out.println(a+"-"+b+"-"+c+"-"+d+"-"+e);
        System.out.println(a+"-"+b+"-"+c+"-"+d+"-"+e);
        System.out.println(a+"-"+b+"-"+c+"-"+d+"-"+e);
        System.out.println("And Bingo was his name-o.");
        System.out.println();
    }
    
public void MenampilkanBingoSong(){
        for (int x = 0; x <= 5; x++){
            if (x > 0) {
                if (x == 1) this.a = clap;
                if (x == 2) this.b = clap;
                if (x == 3) this.c = clap;
                if (x == 4) this.d = clap;
                if (x == 5) this.e = clap;
            }
            TextBingo();
        }
    }
}