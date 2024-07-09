public class Pedido{
    private int numero;
    private Cliente cliente;
    private Veiculo veiculo;

    public Pedido(int numero, Cliente cliente, Veiculo veiculo){
        this.numero = numero;
        this.cliente = cliente;
        this.veiculo = veiculo;
    }

    public void printDados(){
        System.out.println(" Pedido: " + numero);
        System.out.println(" Cliente: ");
        cliente.printDados();
        System.out.println(" Veiculo: ");
        veiculo.printDados();
    }
}