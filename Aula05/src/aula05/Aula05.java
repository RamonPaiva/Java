package aula05;
public class Aula05 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        ContaBanco p2 = new ContaBanco();
        p1.setDono("Jubileu");
        p1.setNumConta(01);
        p1.abrirConta("cc");
        //p1.depositar(100f);
        p1.sacar(50f);
        p1.fecharConta();
        p1.estadoAtual();
        
        
        p2.setNumConta(02);
        p2.setDono("Creuza");
        p2.abrirConta("cp");
        p2.depositar(500f);
        p2.sacar(1000f);
        p2.estadoAtual();
    }
}
