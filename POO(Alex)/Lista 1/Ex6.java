import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        int i, comp = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n = scanner.nextInt();
        for (i=2;i<=(n/2);i++) {
            if (n % i == 0) {
               comp++;
            }
        }
        if (comp == 0)
            System.out.println("Numero primo: "+ n);
        else 
            System.out.println("Nao eh numero primo: "+ n);
        scanner.close();
    }
}   