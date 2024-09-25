public class ExceptionA extends Exception{
    private String mensagem;

    public ExceptionA(String mensagem){
        this.mensagem = mensagem;
    }
    
    @Override
    public String toString(){
        return mensagem;
    }
}