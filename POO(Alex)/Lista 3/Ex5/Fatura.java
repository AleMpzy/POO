public class Fatura{
    private String numero;
    private String descricao;
    private int quantidade;
    private double preco;

    public Fatura(String n, String d, int q, double p ){
        numero = n;
        descricao = d;
        quantidade = q;
        preco = p;
    }

    public String getNumero(){
        return numero;
    }

    public void setNumero(String n){
        numero = n;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String d){
        descricao = d;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(int q){
        quantidade = q;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double p){
        preco = p;
    }

    public double getQuantidadeFatura(){
        return (preco * quantidade);
    }
    
}
