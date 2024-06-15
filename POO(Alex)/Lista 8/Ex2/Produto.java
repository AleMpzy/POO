public class Produto{
    protected String nome;
    protected double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public boolean ehCaro(){
        return preco > 50.0;
    }

    public String descricao(){
        return "Produto: " + nome + " Valor: " + preco;
    }
}