public class Main {
    public static void main(String[] args){
        Usuario estudante = UsuarioFactory.criarUsuario("Estudante", "Rodrigo Pinheiro");
        Usuario professor = UsuarioFactory.criarUsuario("Professor", "Wuldson Franco");

        System.out.println(estudante.getNome() + " é um " + estudante.getTipo());
        System.out.println(professor.getNome() + " é um " + professor.getTipo());


        Livro livro = new Livro.LivroBuilder()
                .setTitulo("Introdução à Programação com Python – 4ª Edição: Algoritmos e lógica de programação para iniciantes")
                .setAutor("Nilo Ney Coutinho Menezes")
                .setPaginas(552)
                .setGenero("Python")
                .build();
        System.out.println(livro);

        Relatorio relatorioPDF = new RelatorioPDF();
        Relatorio relatorioCSV = new RelatorioCSV();
        String conteudoRelatorio = "Relatório de Livro da Biblioteca";
        relatorioPDF.gerarRelatorio(conteudoRelatorio);
        relatorioCSV.gerarRelatorio(conteudoRelatorio);

        Notificacao notificacaoBasica = new NotificacaoBasica();
        Notificacao notificacaoEmail = new NotificacaoEmail(notificacaoBasica);
        Notificacao notificacaoSMS = new NotificacaoSMS(notificacaoEmail);

        notificacaoSMS.enviar("O Livro que vc reservou está disponivel");
    }
}
