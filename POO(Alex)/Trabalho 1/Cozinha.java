public class Cozinha{
    private Geladeira geladeira;
    private Microondas microondas;
    private Liquidificador liquidificador;

    public Cozinha(Liquidificador liquidificador, Microondas microondas, Geladeira geladeira){
        this.liquidificador = liquidificador;
        this.microondas = microondas;
        this.geladeira = geladeira;
    }

    public void ligar(){
        geladeira.ligar();
        microondas.ligar();
        liquidificador.ligar();
    }

    public void desligar(){
        geladeira.desligar();
        microondas.desligar();
        liquidificador.desligar();
    }
}