public class TestaConta{
    public static void main(String[] args){
        Cliente cliente = new Cliente("Alex", "Eduardo");
        Conta conta = new Conta(2805, 8000, 2000, cliente);
        try{
            conta.saca(-100000);
            System.out.println("Saque ou deposito realizado com sucesso!");
        } catch(IllegalArgumentException illegalArgumentException){
            System.out.println("Saldo insuficiente! ");
        } catch(ValorNegativoException exc){
            System.out.println(exc);
        }
        System.out.println("Dados conta: " + conta.toString());
    }
}