import java.util.Scanner;

public class Teste{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite seu CPF: ");
        String cpf = scanner.nextLine();
        Cliente cliente = new Cliente(nome, cpf);
        cliente.printDados();

        System.out.println("Digite o numero do seu primeiro pedido: ");
        int numero1 = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.println("Digite o modelo do seu carro: ");
        String modelo1 = scanner.nextLine();
        System.out.println("Digite o preco do seu carro: ");
        double preco1 = scanner.nextDouble();
        System.out.println("Digite o ano do seu carro: ");
        int ano1 = scanner.nextInt();

        System.out.println("");
        
        Veiculo carro = new Carro(modelo1, preco1, ano1);
        Pedido pedido1 = new Pedido(numero1, cliente, carro);
        pedido1.printDados(); 

        System.out.println("Digite o numero do seu segundo pedido: ");
        int numero2 = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.println("Digite o modelo da sua moto: ");
        String modelo2 = scanner.nextLine();
        System.out.println("Digite o preco da sua moto: ");
        double preco2 = scanner.nextDouble();
        System.out.println("Digite os km da sua moto: ");
        double km = scanner.nextDouble();

        System.out.println("");
        
        Veiculo moto = new Moto(modelo2, preco2, km);
        Pedido pedido2 = new Pedido(numero2, cliente, moto);
        pedido2.printDados(); 

        scanner.close();
    }
}