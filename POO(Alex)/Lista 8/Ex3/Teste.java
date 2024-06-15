public class Teste{
    public static void main(String[] args){
        Notebook note = new Notebook();
    }
}

/* É impresso:

   Computador()
   Notebook()   
   Codigo: 12345 

   O " Computador() " é impresso pois, implicitamente, ele é chamado na classe Notebook quando usamos extends Computador.
   O " Notebook() " é impresso pois ele esta na propia classe Notebook.
   O " Codigo: 12345 " é impresso pelo metodo ligar().

   Todos eles sao parte da classe Notebook, como no main temos uma instancia de Notebook -> note. Todos construtores ou metodos ligados a classe Notebook serao impressos.
*/