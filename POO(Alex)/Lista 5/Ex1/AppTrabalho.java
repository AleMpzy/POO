public class AppTrabalho {
    public static void main(String[] args){
        Dispositivo dispositivo1 = new Dispositivo(1, "Notebook");
        Dispositivo dispositivo2 = new Dispositivo(2, "Desktop");

        Usuario usuario1 = new Usuario(1, "Alex");
        Usuario usuario2 = new Usuario(2, "Eric");

        usuario1.setDispositivo(dispositivo1);
        usuario1.trabalhar();
        usuario2.setDispositivo(dispositivo2);
        usuario2.trabalhar();
    }
}