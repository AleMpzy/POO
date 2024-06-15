public class TestaProtegido{ 
    public static void main(String[] args){ 
        Protegido exemplo = new Protegido(8); 
        System.out.println("x: "+ exemplo.getI()); 
        ProtegidoSub exemplo1 = new ProtegidoSub(4); 
        exemplo1.mudar(12); 
        System.out.println("x: "+ exemplo1.getI()); 
    } 
}

/*
x: 8
Esta mensagem é impressa após a chamada ao método getI -> exemplo da classe Protegido, onde o valor de i foi inicializado como 8.

x: 12
Esta mensagem é impressa após a chamada ao método getI -> exemplo1 da classe ProtegidoSub, onde o valor de i foi inicializado como 4 e depois alterado para 12 pelo método mudar.
Por mais que o exemplo1 seja da classe ProtegidoSub, ela é uma subclasse que herda a superclasse Protegido por isso quando damos getI() o valor fornecido é 12.
O exemplo1.mudar(12) tambem é da classe ProtegidoSub porem como dito na linha anterior ele herda o metodo ajustar da superclasse Protegido, assim mudando seu valor para 12.

Já o atributo i ter sido definido com o modificador de acesso private é porque ele so pode ser alterado na propia classe.
E ele tem um metodo ajustar(int i) na propia classe para altera-lo.
Esse é o o motivo do metodo ajustar ter acesso protected. Ele pode ser chamado por outra classe -> mudar() do ProtegidoSub, assim ajustando i que so pode ser alterado na classe Protegido.
O valor 12 no exemplo1 so é possivel por causa disso.
*/