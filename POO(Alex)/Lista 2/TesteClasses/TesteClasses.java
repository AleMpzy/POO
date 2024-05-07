public class TesteClasses {
    public static void main(String[ ] args) {
    Universidade faculdade1 = new Universidade();
    faculdade1.nome = "Unicentro";
    faculdade1.cidade = "Guarapuava";
    faculdade1.estado = "PR";
    faculdade1.exibeDados();
    Aluno aluno1 = new Aluno();
    aluno1.nome = "Alex";
    aluno1.curso = "Matematica Aplicada e Computacional";
    aluno1.exibeDados();
    }
    }