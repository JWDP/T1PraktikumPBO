package Nomor1;

public class Hewan {
    String jenisSuara;
        
        public Hewan(String jenisSuara){
            this.jenisSuara = jenisSuara;
        }
        
        public void bersuara(){
            System.out.println(jenisSuara);
        }
        
        //override
        public boolean mamalia(){
            return false; //mengembalikan nilai yang salah
        }
}
