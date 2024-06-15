public class ExSala{
    public static void main(String [] args){
        Tv t = new Tv();
        HomeTheater h = new HomeTheater();
        VideoGame v = new VideoGame();

        Sala s = new Sala(t, h, v);

        System.out.println("Estado inicial dos eletronicos da sala:");
        t.observar();
        h.observar();
        v.observar();

        s.ligar();
        System.out.println("\nEstado apos ligar eletronicos da sala:");
        t.observar();
        h.observar();
        v.observar();

        s.desligar();
        System.out.println("\nEstado apos desligar eletronicos da sala:");
        t.observar();
        h.observar();
        v.observar();
    }
}