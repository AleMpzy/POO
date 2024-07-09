public class ClienteEspecial extends Cliente{
    public double calcularDesconto(double valor){
        return valor - (0.20 * valor);
    }
}