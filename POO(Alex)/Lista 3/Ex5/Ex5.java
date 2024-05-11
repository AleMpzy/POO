import java.util.*;

public class Ex5{
    public static void main(String[] args) {
        Fatura f1 = new Fatura ("001", "Mouse Logitech", 1, 900);
        Fatura f2 = new Fatura ("002", "Teclado Anne Pro II", 3, 250);
        System.out.println(" Numero do pedido: " + f1.getNumero());
        System.out.println(" Descricao: " + f1.getDescricao());
        System.out.println(" Quantidade: " + f1.getQuantidade());
        System.out.println(" Preco: " + f1.getPreco());
        System.out.println("Total da fatura: " + f1.getQuantidadeFatura());
        System.out.println(" Numero do pedido: " + f2.getNumero());
        System.out.println(" Descricao: " + f2.getDescricao());
        System.out.println(" Quantidade: " + f2.getQuantidade());
        System.out.println(" Preco: " + f2.getPreco());
        System.out.println("Total da fatura: " + f2.getQuantidadeFatura());
    }
}
