public class Main{
    public static void main(String [] args){
        Baralho baralho = new Baralho();

        baralho.embaralhar();

        Card cartaComprada1 = baralho.comprar();
        System.out.println("Carta comprada: " + cartaComprada1);
        

        Card cartaComprada2 = baralho.comprar();
        System.out.println("Carta comprada: " + cartaComprada2);
        

        Card cartaComprada3 = baralho.comprar();
        System.out.println("Carta comprada: " + cartaComprada3);
        

        Card cartaComprada4 = baralho.comprar();
        System.out.println("Carta comprada: " + cartaComprada4);
        

        Card cartaComprada5 = baralho.comprar();
        System.out.println("Carta comprada: " + cartaComprada5);

        System.out.println("Cartas restantes: " + baralho.cartasRestantes());
    }
}