public class ServicoEletrico extends Servico{
    public ServicoEletrico(double preco){
        super(preco);
    }

    @Override
    public double getPreco(){
        return preco * 1.5;
    }
}