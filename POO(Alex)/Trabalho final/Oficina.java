import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Oficina{
    private List<Cliente> clientes;
    private List<OrdemServico> ordensServico;

    public Oficina(){
        clientes = new ArrayList<>();
        ordensServico = new ArrayList<>();
    }

    public List<Cliente> getClientes(){
        return clientes;
    }

    public void cadastrarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public void criarOrdemServico(Cliente cliente, Veiculo veiculo) throws VeiculoNaoEncontradoException{
        if(!cliente.getVeiculos().contains(veiculo)){
            throw new VeiculoNaoEncontradoException("Veiculo nao encontrado para o cliente.");
        }

        OrdemServico ordem = new OrdemServico(veiculo);
        ordensServico.add(ordem);
    }

    public List<OrdemServico> buscarOrdensPorStatus(StatusOrdemServico status){
        return ordensServico.stream().filter(o -> o.getStatus() == status).collect(Collectors.toList()); // retorna uma lista contendo todas as ordens de serviço do status solicitado
    }

    public List<OrdemServico> buscarServicosPorCliente(Cliente cliente){
        List<OrdemServico> ordensDoCliente = new ArrayList<>();
        
        for(OrdemServico ordem : ordensServico){
            if(ordem.getVeiculo() != null && cliente.getVeiculos().contains(ordem.getVeiculo())) // verificar se tem uma ordem de serviço associada ao cliente
                ordensDoCliente.add(ordem);
        }
        
        return ordensDoCliente;
    }
}