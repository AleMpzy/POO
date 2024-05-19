public class Retangulo {
    private double comprimento;
    private double largura;

    public Retangulo(){
        this.comprimento = 1.0;
        this.largura = 1.0;    
    }

    public Retangulo(double comprimento, double largura){
        this.comprimento = 3.0;
        this.largura = 4.0;
    }

    public double CalcularP(){
        return 2 * (comprimento + largura);
    }

    public double CalcularA(){
        return comprimento * largura;
    }

    public void ImprimirP(){
        System.out.println("Perimetro do retangulo : " + CalcularP());
    }

    public void ImprimirA(){
        System.out.println("Area do retangulo : " + CalcularA());
    }

    public double getComprimento(){
        return comprimento;
    }

    public double getLargura(){
        return largura;
    }

    public void setComprimento(double comprimento){
        this.comprimento = comprimento;
    }

    public void setLargura(double largura){
        this.largura = largura;
    }
}