public class Aluno extends Pessoa implements Falante{
    @Override
    public void falar(){
        System.out.println("Olá, eu sou aluno da MAC!");
    }
    @Override
    public String seuIdioma(){
        return "Portugues";
    }

    public void identificarSe(){
        System.out.println("Eu sou o aluno " + nome() + " e estou atualmente com " + idade() + " anos de idade");
    }
}