class Professor extends Pessoa {
    private int registro;
    private String disciplina;

    public Professor(String nome, int idade, int registro, String disciplina) {
        super(nome, idade);
        this.registro = registro;
        this.disciplina = disciplina;
    }



    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}