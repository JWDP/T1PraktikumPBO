package Volume_LuasPermukaan;

public class LuasPermukaan {
    public float p,l,t,s;
 
    //overloading
    protected LuasPermukaan(float p, float l,float t,float s){
        this.p = p;
        this.l = l;
        this.t = t;
        this.s = s;
    }
    protected LuasPermukaan(float s){
        this.s = s;
    }
    protected float getBalok(){
        return 2*((p*l)+(p*t)+(l*t));
    }
    public float getKubus(){
        return 6*(s*s);
    }
}
