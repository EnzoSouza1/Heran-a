public class TesteVendedor {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Maria", "Rua 456, XYZ", "789-123-456", 104, 3000.0, 10.0, 20000.0, 5.0);


        System.out.println("Informações do Vendedor:");
        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Endereço: " + vendedor.getEndereco());
        System.out.println("Telefone: " + vendedor.getTelefone());
        System.out.println("Código do Setor: " + vendedor.getCodigoSetor());
        System.out.println("Salário Base: " + vendedor.getSalarioBase());
        System.out.println("Imposto: " + vendedor.getImposto());
        System.out.println("Valor de Vendas: " + vendedor.getValorVendas());
        System.out.println("Comissão: " + vendedor.getComissao());


        double salarioLiquido = vendedor.calcularSalario();
        System.out.println("Salário Líquido: " + salarioLiquido);
    }
}
