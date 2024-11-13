public class NotificacaoEmail implements Notificacao{
    private Notificacao notificacao;
    public NotificacaoEmail(Notificacao notificacao){
        this.notificacao = notificacao;
    }
    @Override
    public void enviar(String mensagem) {
        notificacao.enviar(mensagem);
        System.out.println("[Email Mesagem enviada por Email: " + mensagem);
    }
}
