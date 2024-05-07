import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho da base do retangulo:");
        int b = scanner.nextInt();
        System.out.println("Digite a altura do retangulo:");
        int h = scanner.nextInt();
        System.out.println("Area: " + b*h);
        System.out.println("Perimetro: " + 2*(b+h));
        scanner.close();
    }
}

