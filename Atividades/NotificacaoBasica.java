public class NotificacaoBasica implements Notificacao{
    @Override
    public void enviar(String mensagem) {
        System.out.println("Notificação Enviada: " + mensagem);
    }
}
