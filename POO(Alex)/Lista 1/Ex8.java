import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[20];
        System.out.println("Digite os 20 inteiros:");
        for (int i=0;i<20;i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("Escolha a operacao a ser realizada:");
        System.out.println("a. Calcular moda");
        System.out.println("b. Calcular mediana");
        System.out.println("c. Calcular media");
        char escolha = scanner.next().charAt(0);
        switch (escolha) {
            case 'a':
                System.out.println("Moda: " + moda(a));
                break;
            case 'b':
                System.out.println("Mediana: " + mediana(a));
                break;
            case 'c':
                System.out.println("Media: " + media(a));
                break;
            default:
                System.out.println("ERRO!");
        }
        scanner.close();
    }
    public static int moda(int[] a) {                         
        Map<Integer, Integer> frequencia = new HashMap<>();
        int moda = -1;
        int maxFrequencia = 0;
        for (int elemento : a) {
            int freq = frequencia.getOrDefault(elemento, 0) + 1;
            frequencia.put(elemento, freq);
            if (freq > maxFrequencia) {
                moda = elemento;
                maxFrequencia = freq;
            }
        }
        return moda;
    }                                                        
    public static float mediana(int[] a) {                                  
        Arrays.sort(a);
        int tamanho = a.length;
        if (tamanho % 2 == 0) 
            return (a[tamanho / 2 - 1] + a[tamanho / 2]) / 2.0f;
        else 
            return a[tamanho / 2];
    }
    public static float media(int[] a) {
        int s = 0;
        for (int elemento : a) 
            s += elemento;
        return (float) s / a.length;
    }
}