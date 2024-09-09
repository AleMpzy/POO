import java.util.Random;

public class Baralho{
    private Card [] cartas;
    private int topo;

    public Baralho(){
        cartas = new Card[52];
        topo = 0;
        int aux = 0;

        for(Valor valor : Valor.values()){
            for(Naipe naipe : Naipe.values()){
                cartas[aux++] = new Card(naipe, valor);
            }
        }
    }

    public void embaralhar(int cortes){
        Random random = new Random();

        for(int i = cartas.length - 1; i > 0; i--){
            int j = random.nextInt(i + 1);
            Card temp = cartas[i];
            cartas[i] = cartas[j];
            cartas[j] = temp;
        }
        topo = 0;  
    }

    public Card comprar(){
        if(topo < cartas.length){
            return cartas[topo++];  
        }
        return null;  
    }

    public int cartasRestantes(){
        return cartas.length - topo;
    }
}