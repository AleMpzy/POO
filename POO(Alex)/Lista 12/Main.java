public class Main{
    public static void main(String [] args){
        Baralho baralho = new Baralho();
        System.out.println("Cartas restantes: " + baralho.cartasRestantes());

        // Embaralha o baralho simulando cortes
        baralho.embaralhar(3);

        Card cartaComprada = baralho.comprar();
        System.out.println("Carta comprada: " + cartaComprada);
        System.out.println("Cartas restantes: " + baralho.cartasRestantes());

        Card cartaComprada2 = baralho.comprar();
        System.out.println("Carta comprada: " + cartaComprada2);
        System.out.println("Cartas restantes: " + baralho.cartasRestantes());

        Card cartaComprada3 = baralho.comprar();
        System.out.println("Carta comprada: " + cartaComprada3);
        System.out.println("Cartas restantes: " + baralho.cartasRestantes());
    }
}