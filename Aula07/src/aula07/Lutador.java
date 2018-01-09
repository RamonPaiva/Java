package aula07;
public class Lutador {
    private String nome,nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias,derrotas,empates;

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    
    public void apresentar(){
        System.out.println("---------------");
        System.out.println("Lutador: "+this.getNome());
        System.out.println("Origem:  "+this.getNacionalidade());
        System.out.println("Idade:   "+this.getIdade());
        System.out.println("Altura:  "+this.getAltura());
        System.out.println("Peso:    "+this.getPeso());
        System.out.println("Vitorias:"+this.getVitorias());
        System.out.println("Derrotas:"+this.getDerrotas());
        System.out.println("Empates: "+this.getEmpates());
        System.out.println("---------------");
    }
    
    public void status(){
        System.out.println("---------------");
        System.out.println("Nome:     "+this.getNome());
        System.out.println("Categoria:"+ this.getCategoria());
        System.out.println("Vitorias: "+this.getVitorias());
        System.out.println("Derrotas: "+this.getDerrotas());
        System.out.println("Empates:  "+this.getEmpates());
        System.out.println("---------------");
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        String res;
        if(this.getPeso()<52.2){
            res = "Inválido";
        }
        else if(this.getPeso()<=70.3){
            res="Leve";
        }
        else if(this.getPeso()<=83.9){
            res="Médio";
        }
        else if(this.getPeso()<=120.3){
            res = "Pesado";
        }
        else{
            res="Inválido";
        }
        this.categoria = res;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
       
}