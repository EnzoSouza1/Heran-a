public class Cliente extends Pessoa {
    private double valorDivida;
    private int anoNascimento;

    public Cliente(String nome, String sexo, int idade, double valorDivida, int anoNascimento) {
        super(nome, sexo, idade);
        this.valorDivida = valorDivida;
        this.anoNascimento = anoNascimento;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    @Override
    public String toString() {
        return super.toString() + ", Valor da Dívida: " + valorDivida + ", Ano de Nascimento: " + anoNascimento;
    }
}