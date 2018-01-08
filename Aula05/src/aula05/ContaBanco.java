package aula05;
public class ContaBanco {
//Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
//Métodos
    //construtor
    public ContaBanco() {
        this.setSaldo(0f);
        this.setStatus(false);
    }
    
    public void estadoAtual(){
        System.out.println("----------------");
        System.out.println("Conta: "+this.getNumConta());
        System.out.println("Tipo:  "+this.getTipo());
        System.out.println("Dono:  "+this.getDono());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status:"+this.isStatus());
        System.out.println("----------------");
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if("cc".equals(t)){
            this.setSaldo(50f);
        }
        else if("cp".equals(t)){
            this.setSaldo(150f);
        }
        System.out.println("Conta aberta:"+this.getDono());
        System.out.println("Saldo inicial: "+this.getSaldo());
    }
    
    public void fecharConta(){
        System.out.println(this.getDono());
        if(this.getSaldo()<0)
            System.out.println("Há um débito, pague-o depois feche a conta");
        else if(this.getSaldo()>0){
            System.out.println("Saque "+this.getSaldo()+" para fechar a conta");
        }
        else{
            this.setStatus(false);
            System.out.println("Fechada com sucesso!");
        }
    }
    
    public void depositar(float dep){
        System.out.println(this.getDono());
        if(this.isStatus()==true){
            this.setSaldo(this.getSaldo()+dep);
            System.out.println("Novo saldo: "+ this.getSaldo());
        }
        else{
            System.out.println("A conta está fechada");
        }
    }
    
    public void sacar(float saq){
        System.out.println(this.getDono());
        if(this.isStatus()==true){
            if(this.getSaldo()>=saq){
                this.setSaldo(this.getSaldo()-saq);
                System.out.println("Saque realizado com sucesso");
                System.out.println("Novo saldo: "+this.getSaldo());
            }
            else{
                System.out.println("Você não tem isso tudo na conta");
            }
        }
        else{
            System.out.println("A conta ainda está fechada");
        }
    }
    
    public void pagarMensal(){
        System.out.println(this.getDono());
        if(this.isStatus()){
            if("cc".equals(this.getTipo())){
                System.out.println("Saldo anterior: "+this.getSaldo());
                this.setSaldo(this.getSaldo()-12);
                System.out.println("Saldo atual: "+this.getSaldo());
            }
            else{
                System.out.println("Saldo anterior: "+this.getSaldo());
                this.setSaldo(this.getSaldo()-20);
                System.out.println("Saldo atual: "+this.getSaldo());
            }
        }
        else{
            System.out.println("Conta ainda fechada");
        }
    }
    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}