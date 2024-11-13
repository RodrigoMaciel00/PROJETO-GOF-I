public class Estudante implements Usuario{
    private String nome;

    public Estudante(String nome){
        this.nome = nome;
    }
    @Override
    public String getNome(){
        return nome;
    }
    @Override
    public String getTipo(){
        return "Estudante";
    }
}
