import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int a = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        int b = scanner.nextInt();
        System.out.println("Digite o terceiro numero: ");
        int c = scanner.nextInt();
        if(a>b & b>c)
            System.out.println(" A soma dos 2 maiores numeros eh: " + a + " + " + b + " = " + (a+b));
        else if(a>b & c>b)
            System.out.println(" A soma dos 2 maiores numeros eh: " + a + " + " + c +" = " + (a+c));
        else if(b>a & c>a)
            System.out.println(" A soma dos 2 maiores numeros eh: " + b + " + " + c + " = " + (b+c));
        else 
            System.out.println("Os numeros sao repetidos!");
        scanner.close();
    }
}   