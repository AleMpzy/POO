public class TesteString{
    public static void main(String [] args){
        String palavra = "Programacao Orientada A Objetos";
        analiseStrings(palavra);
    }

    public static void analiseStrings(String palavra){
        int cont = 0;
        String vogais = "aeiouAEIOU";

        System.out.println("Numero de caracteres da palavra: " + palavra.length());
        for(int i = 0; i < palavra.length(); i++){
            if(vogais.indexOf(palavra.charAt(i)) != -1){
                cont++;
            }
        }
        System.out.println("Numero de vogais: " + cont);
    }
}