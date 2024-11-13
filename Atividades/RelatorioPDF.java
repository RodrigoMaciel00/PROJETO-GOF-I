public class RelatorioPDF implements Relatorio{
    @Override
    public void gerarRelatorio(String conteudo) {
        System.out.println("Gerando relatório em PDF... ");
        System.out.println("[PDF] " + conteudo);
    }
}
