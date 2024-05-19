public class TesteRetangulo {
    public static void main(String[] args){
        Retangulo r1 = new Retangulo(); // sem parametros o comprimento e a largura sao = 1
        r1.ImprimirP();
        r1.ImprimirA();

        Retangulo r2 = new Retangulo(3.0, 4.0);
        r2.ImprimirP();
        r2.ImprimirA();

        r2.setComprimento(5.0);
        r2.setLargura(6.0);
        r2.ImprimirP();
        r2.ImprimirA();
    }
}


