public class ExProcesso{
    public static void main(String[] args){
        String s = "AleMpz";
        System.out.println("Processo: " + processar(s));
    }
    
    public static String processar(String s){
        if(s == null){
            return null;
        } 
        else{
            return s.toUpperCase();
        }
    }
}