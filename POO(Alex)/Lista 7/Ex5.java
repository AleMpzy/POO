public class Ex5{
    public static void main(String[] args){
        int[] array = {7, 10, 11, 22, 28, 33, 47, 15, 25, 5};
        int x = 15;

        MaiorDiferenca(array);
        OrdemArray(array);
        Comparar(array, x);

    }

    public static void MaiorDiferenca(int[] array){
        int md = 0;
        int p1 = 0; 
        int p2 = 0;

        for(int i = 0; i < array.length - 1; i++){
            int d = (array[i] - array[i + 1]);
            if(d > md){
                md = d;
                p1 = i;
                p2 = i + 1;
            }
        }

        System.out.println("Maior diferenca entre as posicoes consecutivas: " + md + "! Entre as posicoes: " + p1 + " e " + p2);
    }

    public static void OrdemArray(int[] array){
        boolean crescente = true;
        boolean decrescente = true;

        for(int i = 0; i < array.length - 1; i++){
            if(array[i] > array[i+1])
                decrescente = false;
        }

        for(int i = 0; i < array.length - 1; i++){
            if(array[i] > array[i+1])
                crescente = false;
        }

        if(crescente)
            System.out.println("Ordem crescente!");
        else if(decrescente)
            System.out.println("Ordem decrescente!");
        else 
            System.out.println("Array nao ordenado!");
    }

    public static void Comparar(int[] array, int x){
        int xmaior = 0;
        int xmenor = 0;
        int xigual = 0;

        for(int i = 0; i < array.length; i++){
            if(x > array[i])
                 xmaior++;
            else if(x < array[i])
                xmenor++;
            else
                xigual++;
        }

        System.out.println("Numeros maiores que " + x + ": " + xmenor);
        System.out.println("Numeros menores que " + x + ": " + xmaior);
        System.out.println("Numeros iguais a " + x + ": " + xigual); 
    }
}