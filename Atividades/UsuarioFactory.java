public class UsuarioFactory {
    public static Usuario criarUsuario(String tipo, String nome){
        switch (tipo.toLowerCase()){
            case "estudante":
                return new Estudante(nome);
            case "professor":
                return new Professor(nome);
            default:
                throw new IllegalArgumentException("Tipo de usuário desconhecido: " + tipo);
        }
    }
}
