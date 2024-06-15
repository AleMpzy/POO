public class Retangulo extends TwoDShape{
    public boolean verificarQuadrado(){ 
        if(getLargura() == getAltura())
            return true;
        else
            return false;
    }
    
    public double area(){
        return getLargura() * getAltura();
    }
}