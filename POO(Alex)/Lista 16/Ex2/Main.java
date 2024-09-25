public class Main{
    public static void main(String[] args){
        try{
            throw new ExceptionC("ERROR C");
        } catch(ExceptionA exc){
            System.out.println(exc);
        }
        
        try {
            throw new ExceptionB("ERROR B");
        } catch(ExceptionA exc){
            System.out.println(exc);
        }
    
        try {
            throw new ExceptionA("ERROR A");
        } catch(ExceptionA exc){
            System.out.println(exc);
        }
    }
}