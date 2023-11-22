package t6_2210631170025_juliana.widianti.d.p;

import java.util.Scanner;
/*
 * @author Juliana
 */
public class ganjilGenap {
        public static void main(String[] args) {
        // TODO code application logic here
        int i, bilangan1,bilangan2;
        
    Scanner input = new Scanner(System.in);
        System.out.print("Masukan Angka Awal: ");
        bilangan1 = input.nextInt();
        System.out.print("Masukan Angka Akhir: ");
        bilangan2 = input.nextInt();
        
    
    for(i=bilangan1; i<=bilangan2; i++){
    if(i%2 == 0){
        System.out.println("Bilangan Genap:"+i);
    }else{
            System.out.println("Bilangan Gnajil:"+i);
            }
    }
    }
}