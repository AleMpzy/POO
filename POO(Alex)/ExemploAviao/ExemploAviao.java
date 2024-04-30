public class ExemploAviao {
    public static void main(String[ ] args) {
        // criando uma instância/objeto da classe Aviao
        Aviao aviaoa1 = new Aviao();
        // atribuindo os valores dos atributos
        aviaoa1.fabricante = "Boeing";
        aviaoa1.modelo = "777";
        aviaoa1.qtdeAssentos = 368;
        // executando os métodos do objeto
        aviaoa1.ligar();
    }
} 