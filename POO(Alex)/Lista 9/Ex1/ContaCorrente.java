public class ContaCorrente{
    public double deposito;
    public double saldo = 0;
    public double saque;
    public double taxa;
    
    public void depositar(double deposito){
        this.deposito = deposito;
        saldo = saldo + deposito;
    }

    public void sacar(double saque){
        this.saque = saque;
        saldo = saldo - saque;
        saldo = saldo - (0.05 * saque);
    }

    public double obterSaldo(){
        return saldo;
    }

    public double itsSaque(){
        taxa = 0.05 * saque;
        return taxa;
    }
}