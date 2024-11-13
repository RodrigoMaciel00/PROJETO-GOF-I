public class Professor  implements Usuario{
    private String nome;
    public Professor(String nome){
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getTipo() {
        return "Professor";
    }
}
