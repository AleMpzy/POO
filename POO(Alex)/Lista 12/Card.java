enum Naipe{
    COPAS, OUROS, ESPADAS, PAUS
}

enum Valor{
    AS, DOIS, TRES, QUATRO, CINCO, SEIS, SETE, OITO, NOVE, DEZ, VALETE, DAMA, REI
}

public class Card{
    private Naipe naipe;
    private Valor valor;

    public Card(Naipe naipe, Valor valor){
        this.naipe = naipe;
        this.valor = valor;
    }

    @Override
    public String toString(){
        return valor + " de " + naipe;
    }
}