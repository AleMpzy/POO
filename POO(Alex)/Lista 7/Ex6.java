public class Ex6{
    public static void main(String[] args){
        int n1 = 7;
        int n2 = 11;
        int n3 = 22;
        int n4 = 47;
        System.out.println("n1, n2, n3, n4: " + n1 + " " + n2 + " " + n3 + " " + n4);
        System.out.println("Soma de n1 + n2 = " + soma(n1, n2));
        System.out.println("Soma de n3 + n4 = " + soma(n3, n4));
        System.out.println("Soma de n1 + n2 + n3 + n4 = " + soma(n1, n2, n3, n4));
    }

    public static int soma(int...numeros){
        int soma = 0;

        for(int n: numeros){ 
            soma = soma + n;
        }

        return soma;
    }
}
