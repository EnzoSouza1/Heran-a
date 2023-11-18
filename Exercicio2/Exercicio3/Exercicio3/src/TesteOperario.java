public class TesteOperario {
    public static void main(String[] args) {
        Operario operario = new Operario("Pedro", "Rua 123, ABC", "456-789-123", 103, 3500.0, 12.0, 5000.0, 5.0);


        System.out.println("Informações do Operário:");
        System.out.println("Nome: " + operario.getNome());
        System.out.println("Endereço: " + operario.getEndereco());
        System.out.println("Telefone: " + operario.getTelefone());
        System.out.println("Código do Setor: " + operario.getCodigoSetor());
        System.out.println("Salário Base: " + operario.getSalarioBase());
        System.out.println("Imposto: " + operario.getImposto());
        System.out.println("Valor de Produção: " + operario.getValorProducao());
        System.out.println("Comissão: " + operario.getComissao());


        double salarioLiquido = operario.calcularSalario();
        System.out.println("Salário Líquido: " + salarioLiquido);
    }
}
