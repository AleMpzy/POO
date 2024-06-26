public class ContaEspecial extends ContaCorrente{
    public void sacar(double saque){
        this.saque = saque;
        saldo = saldo - saque;
        saldo = saldo - (0.01 * saque);
    }
    public double itsSaque(){
        taxa = 0.01 * saque;
        return taxa;
    }
}