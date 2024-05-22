public class Dispositivo {
    private int codigo;
    private String nome;

    Dispositivo(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }

    public void usar(String usuario){
        System.out.println(usuario + " Usando o dispositivo: " + nome);
    }
}