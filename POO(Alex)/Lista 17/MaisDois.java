public class MaisDois implements Series{
    public int inicio = 0;
    public int valor = 0;

    public MaisDois(){
    }
    
    @Override
    public int getNext(){
        return  valor = valor + 2;
    }

    @Override
    public void reset(){
        valor = inicio;
    }

    @Override
    public void setStart(int inicio){
        valor = inicio;
    }
    
    @Override
    public String toString(){
        return "Resultado: " + valor; 
    }

}