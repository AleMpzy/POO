public class TestaCliente{
    public static void main(String[] args){
        Cliente cliente = new Cliente();
        ClienteEspecial clientespecial = new ClienteEspecial();
        System.out.println("Valor com desconto do Cliente ja calculado: " + cliente.calcularDesconto(1000));
        System.out.println("Valor com desconto do ClienteEspecial ja calculado: " + clientespecial.calcularDesconto(1000));
    }
}