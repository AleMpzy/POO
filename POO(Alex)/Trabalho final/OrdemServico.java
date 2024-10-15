enum StatusOrdemServico{
    AGUARDANDO, EM_ANDAMENTO, FINALIZADO
}

public class OrdemServico implements Reparavel{
    private OrdemServico ordemServico[];
    private Servico servico;

    public OrdemServico(Servico servico){
        this.servico = servico;
    }

    public Servico getServico(){
        return servico;
    }

    public void setServico(Servico servico){
        this.servico = servico;
    }

    @Override
    public void reparar(){
        
    }
    
}