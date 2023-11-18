public class Gerente extends Empregado {
    private String nomeGerencia;

    public Gerente(String nome, String sexo, int idade, String matricula, double salario, String nomeGerencia) {
        super(nome, sexo, idade, matricula, salario);
        this.nomeGerencia = nomeGerencia;
    }

    public String getNomeGerencia() {
        return nomeGerencia;
    }

    public void setNomeGerencia(String nomeGerencia) {
        this.nomeGerencia = nomeGerencia;
    }

    @Override
    public String toString() {
        return super.toString() + ", Nome da Gerência: " + nomeGerencia;
    }
}