package Konversi;

public class DemoKonversiSuhu {

    public static void main(String[] args) {
        // TODO code application logic here
        float a = 20;
        float b = 50;
        float c = 80;
        
        KonversiSuhu2 ks = new KonversiSuhu2();
        
        ks.CelciusToFahrenheit(a);
        System.out.println(" Apabila Suhu " +  a  + " derajat celcius dikonversikan ke fahrenheit menjadi "  +  ks.getCelciusToFarenheit());
        
        ks.CelciusToReamur(b);
        System.out.println(" Apabila Suhu " +  b  +  " derajat celcius dikonversikan ke fahrenheit menjadi " + ks.getCelciusToReamur());
        
        ks.FahrenheitToReamur(c);
        System.out.println(" Apabila Suhu " +  c  +  " derajat Farenheir dikonversi ke Reamur menjadi " + ks.getFahrenheitToReamur());
       
    }
}    