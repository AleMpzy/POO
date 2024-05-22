public class CarroApp {
    public static void main(String [] args){
        Motor m1 = new Motor("3.8L V6");
        Banco b1 = new Banco("Recaro");
        Carro c1 = new Carro("Mustang", "Conversivel", "Ford", m1, b1);

        Motor m2 = new Motor("Zetec Rocam 1.0");
        Banco b2 = new Banco("Bancouros");
        Carro c2 = new Carro("Ka", "Popular", "Ford", m2, b2);
        
        Motor m3 = new Motor("2.4 Ecotec");
        Banco b3 = new Banco("Maximus");
        Carro c3 = new Carro("Capitiva", "SUV", "Chevrolet", m3, b3);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}