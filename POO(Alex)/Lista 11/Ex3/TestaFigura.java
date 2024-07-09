public class TestaFigura{
    public static void main(String[] args){
        Figura[] figura = new Figura[2];
        figura[0] = new Quadrado();
        figura[1] = new Circulo();
        System.out.println("Area do Quadrado: " + figura[0].area(4));
        System.out.println("Area do Circulo: " + figura[1].area(3));
    }
}