public class Turma {
    private String curso;
    private String disciplina;

    public void setCurso(String c) {
        curso = c;
    }

    public void setDisciplina(String d) {
        disciplina = d;
    }

    public String getCurso() {
        return curso;
    }

    public String getDiscplina() {
        return disciplina;
    }

    public void exibir() {
        System.out.println("O curso " + curso + " tem a disciplina " + disciplina);
    }
}

