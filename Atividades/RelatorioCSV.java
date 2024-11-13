public class RelatorioCSV implements Relatorio{
    @Override
    public void gerarRelatorio(String conteudo) {
        System.out.println("Gerando relatório em CSV... ");
        System.out.println("[CSV] " + conteudo.replace(" ", ";"));
    }
}
