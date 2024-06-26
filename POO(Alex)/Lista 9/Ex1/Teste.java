public class Teste{
    public static void main(String[] args){
        ContaCorrente c1 = new ContaCorrente();
        ContaEspecial e1 = new ContaEspecial();

        c1.depositar(1000);
        c1.sacar(100);
        System.out.println("Valor da taxa do saque: " + c1.itsSaque());
        System.out.println("Valor do seu saldo atual: " + c1.obterSaldo());

        e1.depositar(1000);
        e1.sacar(100);
        System.out.println("Valor da taxa do saque: " + e1.itsSaque());
        System.out.println("Valor do seu saldo atual: " + e1.obterSaldo());
    }
}