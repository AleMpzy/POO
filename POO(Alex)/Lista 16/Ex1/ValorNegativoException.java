public class ValorNegativoException extends Exception{

    @Override
    public String toString(){
        return "Impossivel sacar ou depositar valores negativos!";
    }
}

