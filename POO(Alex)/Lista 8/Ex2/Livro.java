public class Livro extends Produto{
    private String autor;
    private int paginas;

    public Livro(String nome, double preco, int paginas, String autor){
        super(nome, preco);
        this.paginas = paginas;
        this.autor = autor;
    }

    public boolean ehExtenso(){
        return paginas > 100;
    }

    @Override
    public String descricao(){
        return "Livro: " + nome + "Autor: " + autor;
    }

    public String descricao(boolean particularizacoes){
        if(particularizacoes == true)
            return "Livro: " + nome + " Autor: " + autor + " Numero de paginas: " + paginas + " Valor: " + preco;
        else
            return "Livro: " + nome + " Autor: " + autor;
    }
}