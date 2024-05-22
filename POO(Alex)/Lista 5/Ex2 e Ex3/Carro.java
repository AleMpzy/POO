public class Carro{
    private String marca;
    private String modelo;
    private String fabricante;
    private Motor motor;
    private Banco banco;

    Carro(String marca, String modelo, String fabricante, Motor motor, Banco banco){
        this.marca = marca;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.motor = motor;
        this.banco = banco;
    }
    
    @Override
    public String toString(){
        return "Carro [Marca: "+ marca + ", Modelo: " + modelo + ", Fabricante: " + fabricante + ", Motor: " + motor.getTipo() + ", Banco: " + banco.getFabricante() + "]" ;
    }
}