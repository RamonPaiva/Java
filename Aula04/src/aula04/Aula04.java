package aula04;
public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("NIC","Amarela",0.6f);
        //c1.setModelo("BIC");
        //c1.modelo = "BIC";
        
        //c1.setPonta(0.5f);
        //c1.ponta = 0.5f;
        
        c1.status();
        Caneta c2 = new Caneta("KKK","Laranja",1.7f);
        c2.status();
        //System.out.println("Tenho: "+c1.getModelo());
    }
}
