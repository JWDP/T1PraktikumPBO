package Volume_LuasPermukaan;
//balok = p * l * t
//kubus = s * s * s
public class Volume extends LuasPermukaan {

    public Volume(float p, float l, float t, float s){
        super(p,l,t,s);     
    }
    public float getBalok2(){
        return (p*l*t);
    }
    public float getKubus2(){
        return (s*s*s);
    }
}
