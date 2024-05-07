import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        do{ 
            System.out.println("Digite um numero da semana: ");
             n = scanner.nextInt();
            if(n==1)
                System.out.println("Domingo! ");
            else if(n==2)
                System.out.println("Segunda! ");
            else if(n==3)
                System.out.println("Terca! ");
            else if(n==4)
                System.out.println("Quarta! ");
            else if(n==5)
                System.out.println("Quinta! ");
            else if(n==6)
                System.out.println("Sexta! ");
            else if(n==7)
                System.out.println("Sabado! ");
            else 
                System.out.println("Erro");
        }while (n<1 || n>7);
        scanner.close();
    }
}   