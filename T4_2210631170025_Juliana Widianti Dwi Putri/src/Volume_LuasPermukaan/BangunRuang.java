package Volume_LuasPermukaan;

public class BangunRuang {
 
    public static void main(String[] args) {
        // TODO code application logic here
        LuasPermukaan b = new LuasPermukaan(2,3,2,2);
        LuasPermukaan c = new LuasPermukaan(2);
        Volume k = new Volume(2,3,2,2);
        
        System.out.println("Balok");
        System.out.println("Volume : " + k.getBalok2());
        System.out.println("Luas Permukaan : "+ b.getBalok());
        System.out.println();
        
        System.out.println("Kubus");
        System.out.println("Volume : " + k.getKubus2());
        System.out.println("Luas Permukaan : " + c.getKubus());
    }
    
}