package t6_2210631170025_juliana.widianti.d.p;
/*
 * @author Juliana
 */
public class deretHuruf {
    public static void main(String[] args) {
        char hurufAwal = 'Z';
        char hurufAkhir = 'A';

        System.out.println("Deret Huruf Z - A:");
        
        char huruf = hurufAwal;
        do{
            System.out.print(huruf + " ");
            huruf--;
        }
        while(huruf >= hurufAkhir);
    }
}
