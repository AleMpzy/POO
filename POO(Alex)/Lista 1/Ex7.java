import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int c = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os elementos do array:");
        for (int i=0;i<a.length;i++) {
            System.out.println("Elemento " + (i + 1) + ": ");
            a[i] = scanner.nextInt();
        }
        for (int i=0;i<a.length;i++) {
            if (a[i] % 2 == 0) {
                c++;
            }
        }
        System.out.println("Quantidade de numeros pares no array: " + c);
        scanner.close();
    }
}