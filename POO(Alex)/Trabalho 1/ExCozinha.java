public class ExCozinha{
    public static void main(String [] args){
        Liquidificador l = new Liquidificador();
        Microondas m = new Microondas();
        Geladeira g = new Geladeira();

        Cozinha c = new Cozinha(l, m, g);

        System.out.println("Estado inicial:");
        l.observar();
        m.observar();
        g.observar();

        c.ligar();
        System.out.println("\nEstado após ligar eletrodomesticos:");
        l.observar();
        m.observar();
        g.observar();

        c.desligar();
        System.out.println("\nEstado após desligar eletrodomesticos:");
        l.observar();
        m.observar();
        g.observar();
    }
}