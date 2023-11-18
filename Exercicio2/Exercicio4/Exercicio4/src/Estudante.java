class Estudante extends Pessoa {
    private int matricula;
    private String curso;

    public Estudante(String nome, int idade, int matricula, String curso) {
        super(nome, idade);
        this.matricula = matricula;
        this.curso = curso;
    }



    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}