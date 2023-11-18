public class Vendedor extends Empregado {
    private double valorVendas;
    private int qntVendas;

    public Vendedor(String nome, String sexo, int idade, String matricula, double salario, double valorVendas, int qntVendas) {
        super(nome, sexo, idade, matricula, salario);
        this.valorVendas = valorVendas;
        this.qntVendas = qntVendas;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public int getQntVendas() {
        return qntVendas;
    }

    public void setQntVendas(int qntVendas) {
        this.qntVendas = qntVendas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Valor das Vendas: " + valorVendas + ", Quantidade de Vendas: " + qntVendas;
    }
}