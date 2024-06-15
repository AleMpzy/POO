public class Triangulo extends TwoDShape{
    protected String estilo;

    public double area(){
        return (getLargura() * getAltura()) / 2;
    }

    public void mostraEstilo(){
        System.out.println("Triangulo = " + estilo);
    }
}