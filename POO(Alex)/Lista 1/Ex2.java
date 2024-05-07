import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho do lado do quadrado:");
        int l = scanner.nextInt();
        System.out.println("Area: " + l*l);
        System.out.println("Perimetro: " + 4*l);
        scanner.close();
    }
}