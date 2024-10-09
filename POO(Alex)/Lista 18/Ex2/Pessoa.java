public class Pessoa{
    public String nome(){
        return "Alex Eduardo";
    }

    public int idade(){
        return 19;
    }

    public String getNome(){
        return nome();
    }

    public int getIdade(){
        return idade();
    }
}