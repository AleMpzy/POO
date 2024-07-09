public class Circulo extends Figura{
    @Override
    public double area(double raio){
        area = raio * raio * 3.14;
        return area;
    }
}