public class Ex3{
    public static void main(String[] args){
        double[] array = {5, 7, 11, 22, 47};
        double soma = 0;
        double media;

        for(int i = 0; i < array.length; i++){
            soma = soma + array[i];
        }
        
        media = soma/array.length;
        System.out.println("Media: " + media);
    }
}