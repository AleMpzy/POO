import java.util.Scanner;

public class Ex7{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[][] A = new int[3][3];
        for (int i = 0; i < 3; i++){
            System.out.println();
            for (int j = 0; j < 3; j++){
                System.out.print("Escolha o valor que quer colocar na posicao [" + i + "][" + j + "]: ");
                System.out.println();
                int v = scanner.nextInt();
                A[i][j] = v;
            }
        }

        System.out.print("Matriz A de ordem 3x3: ");

        for (int i = 0; i < 3; i++){
            System.out.println();
            for (int j = 0; j < 3; j++){
                System.out.print(" " + A[i][j]);
            }
        }
        scanner.close();
    }
}
