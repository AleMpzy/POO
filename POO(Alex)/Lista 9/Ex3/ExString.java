public class ExString{
    public static void main(String [] args){
        String nome = "ALEX";
        String nomem = "alex";
        analiseString(nome, nomem);
    }

    public static void analiseString(String nome, String nomem){
        if(nome.equals(nomem)){ 
            System.out.println("Sao iguais!");
        }   
        else{
            System.out.println("Sao diferentes!");
        }

        if(nome.equalsIgnoreCase(nomem)){ 
            System.out.println("Sao iguais!");
        }
        else{ 
            System.out.println("Sao diferentes!");
        }
    }
}