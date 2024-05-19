public class Ponto2D {
    private double x, y;
    private static int contador = 0;

    public Ponto2D(){
        this.x = 0.0;
        this.y = 0.0;
        ++contador;    
    }

    public Ponto2D(double x, double y){
        this.x = x;
        this.y = y;
        ++contador;
    }
    
    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }
    public static int getContador(){
        return contador;
    }
}

