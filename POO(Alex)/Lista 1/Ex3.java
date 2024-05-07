import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero negativo ou positivo:");
        int n = scanner.nextInt();
        if(n>=0)
            System.out.println("Este numero eh positivo: " + n);
        else
            System.out.println("Este numero eh negativo: " + n);
        scanner.close();
    }
}