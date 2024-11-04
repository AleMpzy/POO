import java.util.ArrayList;
import java.util.List;

public class Cliente{
    private String nome;
    private List<Veiculo> veiculos;

    public Cliente(String nome){
        this.nome = nome;
        this.veiculos = new ArrayList<>();
    }

    public String getNome(){
        return nome;
    }

    public List<Veiculo> getVeiculos(){
        return veiculos;
    }

    public void adicionarVeiculo(Veiculo veiculo){
        this.veiculos.add(veiculo);
    }
}