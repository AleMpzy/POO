public class Moto extends Veiculo{
    private double km;

    public Moto(String modelo, double preco, double km){
        super(modelo, preco);
        this.km = km;
    }
    
    @Override
    public double getPreco(){
        return super.getPreco();
    }

    public void setKm(double km){
        this.km = km;
    }
}