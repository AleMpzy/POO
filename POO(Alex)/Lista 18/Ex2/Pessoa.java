public class Pessoa{
    private String nome(){
        return "Alex Eduardo";
    }

    private int idade(){
        return 19;
    }

    public String getNome(){
        return nome();
    }

    public int getIdade(){
        return idade();
    }
}