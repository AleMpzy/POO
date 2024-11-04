import java.util.List;
import java.util.Scanner;

public class GerenciarOficina{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Oficina oficina = new Oficina();
        Cliente cliente = null;
        Veiculo veiculo = null;

        int op;

        do{
            System.out.println("1. Cadastrar Cliente e Veiculo");
            System.out.println("2. Criar Ordem de Servico");
            System.out.println("3. Adicionar Servico a Ordem");
            System.out.println("4. Visualizar Ordens de Servico");
            System.out.println("5. Buscar Servicos por Cliente");
            System.out.println("6. Finalizar Ordem de Servico");
            System.out.println("7. Mostrar Dados do Cliente e Veiculo atual");
            System.out.println("8. Sair");
            System.out.print("Escolha uma opcao: ");
            op = scanner.nextInt();
            scanner.nextLine();

            switch(op){
                case 1:
                    System.out.print("Digite o nome do cliente: ");
                    String nome = scanner.nextLine();
                    cliente = new Cliente(nome);

                    System.out.print("Digite o ano do veiculo: ");
                    int ano = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Digite o modelo do veiculo: ");
                    String modelo = scanner.nextLine();
                    veiculo = new Veiculo(modelo, ano);

                    cliente.adicionarVeiculo(veiculo);
                    oficina.cadastrarCliente(cliente);

                    System.out.println("Cliente e veiculo cadastrados com sucesso!");
                    break;

                case 2:
                    if(cliente == null || veiculo == null)
                        System.out.println("Erro: Cadastre um cliente e veiculo primeiro.");
                    else{
                        try{
                            oficina.criarOrdemServico(cliente, veiculo);
                            System.out.println("Ordem de servico criada com sucesso!");
                        } catch(VeiculoNaoEncontradoException e){
                            System.out.println("Erro: " + e.getMessage());
                        }
                    }
                    break;

                case 3:
                    List<OrdemServico> ordensAguardando = oficina.buscarOrdensPorStatus(StatusOrdemServico.AGUARDANDO);
                    if(ordensAguardando == null || ordensAguardando.isEmpty())
                        System.out.println("Nao ha ordens de servico aguardando.");
                    else{
                        System.out.print("Escolha o tipo de servico (1 - Mecanico, 2 - Eletrico): ");
                        int tipoServico = scanner.nextInt();
                        System.out.print("Digite o preco base do servico: ");
                        double preco = scanner.nextDouble();

                        Servico servico;
                        if(tipoServico == 1)
                            servico = new ServicoMecanico(preco);
                        else
                            servico = new ServicoEletrico(preco);

                        ordensAguardando.get(0).adicionarServico(servico);
                        System.out.println("Servico adicionado a ordem com sucesso!");
                    }
                    break;

                case 4:
                    List<OrdemServico> ordensServico = oficina.buscarOrdensPorStatus(StatusOrdemServico.AGUARDANDO);
                    if(ordensServico == null || ordensServico.isEmpty())
                        System.out.println("Nao ha ordens de servico cadastradas.");
                    else{
                        System.out.println("Ordens de Servico:");
                        for(OrdemServico ordem : ordensServico){
                            System.out.println("Status: " + ordem.getStatus());
                            System.out.println("Custo Total: R$" + ordem.calcularCustoTotal());
                        }
                    }
                    break;

                case 5:
                    System.out.print("Digite o nome do cliente para buscar ordens de serviço: ");
                    String nomeClienteBusca = scanner.nextLine();
                    Cliente clienteBusca = oficina.getClientes().stream().filter(c -> c.getNome().equalsIgnoreCase(nomeClienteBusca)).findFirst().orElse(null); // busca o primeiro cliente que tenha o nome igual a nomeClienteBusca(variavel)

                    if(clienteBusca == null){
                        System.out.println("Cliente nao encontrado.");
                    } else{
                        List<OrdemServico> ordensCliente = oficina.buscarServicosPorCliente(clienteBusca);
                        if(ordensCliente == null || ordensCliente.isEmpty()) 
                            System.out.println("Nenhuma ordem de servico encontrada para este cliente.");
                         else{
                            System.out.println("Ordens de Servico do cliente " + nomeClienteBusca + ":");
                            for(OrdemServico ordem : ordensCliente){
                                System.out.println("Status: " + ordem.getStatus());
                                System.out.println("Custo Total: R$" + ordem.calcularCustoTotal());
                            }
                        }
                    }
                    break;

                case 6:
                    ordensAguardando = oficina.buscarOrdensPorStatus(StatusOrdemServico.AGUARDANDO);
                    if(ordensAguardando == null || ordensAguardando.isEmpty())
                        System.out.println("Nao ha ordens de servico aguardando.");
                    else{
                        ordensAguardando.get(0).reparar();
                        System.out.println("Ordem de servico finalizada com sucesso!");
                    }
                    break;

                case 7:
                    if(cliente == null || veiculo == null)
                        System.out.println("Nenhum cliente ou veiculo cadastrado.");
                    else{
                        System.out.println("Dados do Cliente:");
                        System.out.println("Nome: " + cliente.getNome());
                        System.out.println("Veiculos:");
                        for(Veiculo v : cliente.getVeiculos()){
                            System.out.println("- Modelo: " + v.getModelo() + ", Ano: " + v.getAno());
                        }
                    }
                    break;

                case 8:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Tente outra opcao.");
            }
        }while(op != 8);
        scanner.close();
    }
}