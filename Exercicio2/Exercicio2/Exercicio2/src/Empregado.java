public class Empregado extends Pessoa {
    private String matricula;
    private double salario;

    public Empregado(String nome, String sexo, int idade, String matricula, double salario) {
        super(nome, sexo, idade);
        this.matricula = matricula;
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double valorInss() {
        return salario * 0.11;
    }

    @Override
    public String toString() {
        return super.toString() + ", Matrícula: " + matricula + ", INSS: " + valorInss();
    }
}