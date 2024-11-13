public class Biblioteca {
    private static Biblioteca instanciaUnica;
    private Biblioteca(){
        System.out.println("Biblioteca inicializada");
    }
    public static Biblioteca getInstance(){
        if (instanciaUnica == null){
            instanciaUnica = new Biblioteca();
        }
        return instanciaUnica;
    }
}
