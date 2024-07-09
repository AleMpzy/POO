public class Cliente{
    public double valor;

    public double calcularDesconto(double valor){
        return valor - (0.10 * valor);
    }
}