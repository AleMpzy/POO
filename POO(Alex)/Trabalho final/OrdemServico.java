import java.util.List;
import java.util.ArrayList;

enum StatusOrdemServico{
    AGUARDANDO, EM_ANDAMENTO, FINALIZADO
}

public class OrdemServico implements Reparavel{
    private Veiculo veiculo;
    private List<Servico> servicos;
    private StatusOrdemServico status;

    public OrdemServico(Veiculo veiculo){
        this.veiculo = veiculo;
        this.servicos = new ArrayList<>();
        this.status = StatusOrdemServico.AGUARDANDO;
        System.out.println("Servico na fila de espera.");
    }

    public Veiculo getVeiculo(){
        return veiculo;
    }

    public List<Servico> getServicos(){
        return servicos;
    }

    public StatusOrdemServico getStatus(){
        return status;
    }

    public void adicionarServico(Servico servico){
        servicos.add(servico);
    }

    public double calcularCustoTotal(){
        double total = 0.0;
        for(Servico servico : servicos){
            total += servico.getPreco();
        }
        return total;
    }
    
    @Override
    public void reparar(){
        System.out.println("Servico da vez:");
        System.out.println("" + veiculo);

        status = StatusOrdemServico.EM_ANDAMENTO;
        System.out.println("Reparando...");
        
        status = StatusOrdemServico.FINALIZADO;
        System.out.println("Finalizado!");
    }
}