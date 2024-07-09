public class Automovel extends Veiculo{
    public Automovel(){
        System.out.println("E um automovel");
    }

    @Override
    public void verificar(){
        System.out.println("Verificar automovel");
    }

    @Override
    public void ajustar(){
        System.out.println("Ajustar automovel");
    }

    @Override
    public void limpar(){
        System.out.println("Limpar automovel");
    }
}