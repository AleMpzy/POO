public class CD extends Produto{
    private int nfaixas;

    public CD(String nome, double preco, int nfaixas){
        super(nome, preco);
        this.nfaixas = nfaixas;
    }

    @Override
    public String toString(){
        return super.toString() + "; Numero de faixas: " + nfaixas;
    }
}