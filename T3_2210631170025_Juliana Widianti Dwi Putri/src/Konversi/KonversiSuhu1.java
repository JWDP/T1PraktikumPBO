package Konversi;

public class KonversiSuhu1 {
    public float suhuCTF, suhuCTR;
        public void CelciusToFahrenheit(float a) {
        this.suhuCTF = ( a * 9/5 ) + 32;
    }
        float getCelciusToFarenheit(){
            return suhuCTF;
        }
                

    public void CelciusToReamur(float b) {
        this.suhuCTR = ( b * 4/5 );
    }
        float getCelciusToReamur(){
        return suhuCTR;
        }
}