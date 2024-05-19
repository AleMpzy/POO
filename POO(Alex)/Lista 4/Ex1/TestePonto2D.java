public class TestePonto2D {
    public static void main(String[] args){
        System.out.println("Pontos antes da instanciacao: " + Ponto2D.getContador());
        Ponto2D p1 = new Ponto2D(1, 1);
        Ponto2D p2 = new Ponto2D(2, 2);
        System.out.println("Primeiro ponto: x = " + p1.getX() + ", y = " + p1.getY());
        System.out.println("Segundo ponto: x = " + p2.getX() + ", y = " + p2.getY());
        System.out.println("Pontos depois da instanciacao: " + Ponto2D.getContador());   
    }
}