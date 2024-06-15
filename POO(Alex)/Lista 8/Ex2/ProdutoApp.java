public class ProdutoApp{
    public static void main(String[] args){ 
        Produto p1 = new Produto("Notebook",3000.00);
        Livro l1 = new Livro("O Pequeno Principe", 25.00, 100, "Antoine de Saint-Exupery");

        System.out.println(p1.descricao());
        System.out.println(l1.descricao(true));
        System.out.println("O produto eh caro? " + p1.ehCaro());
        System.out.println("O livro eh extenso? " + l1.ehExtenso());
    }
}