import java.util.Scanner;

public class TesteString{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        analiseString(palavra);
        scanner.close();
    }

    public static void analiseString(String palavra){
        if(palavra.length() < 8){
            System.out.println("Erro!");
        }
        else{
            System.out.println("Palavra criada: " + palavra.substring(0,2) + palavra.substring(palavra.length() -2));
        }
    }
}