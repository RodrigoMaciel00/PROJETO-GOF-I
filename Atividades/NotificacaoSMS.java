public class NotificacaoSMS implements Notificacao{
    private Notificacao notificacao;
    public NotificacaoSMS(Notificacao notificacao){
        this.notificacao = notificacao;
    }
    @Override
    public void enviar(String mensagem){
        notificacao.enviar(mensagem);
        System.out.println("[SMS] Mensagem enviada por SMS: " + mensagem);
    }
}
