package Konversi;

public class KonversiSuhu2 extends KonversiSuhu1 {
        public float suhuFTR;
            public void FahrenheitToReamur(float c) {
                this.suhuFTR = ( c - 32) * 4/9;
            }
                float getFahrenheitToReamur(){
                    return suhuFTR;
                }
}