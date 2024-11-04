public class ServicoMecanico extends Servico{
    public ServicoMecanico(double preco){
        super(preco);
    }

    @Override
    public double getPreco(){
        return preco * 1.25;
    }
}