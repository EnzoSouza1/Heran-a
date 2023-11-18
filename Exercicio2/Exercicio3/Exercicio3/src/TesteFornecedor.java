public class TesteFornecedor {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor("Fornecedor XYZ", "Rua ABC, 123", "123-456-789", 10000.0, 5000.0);


        System.out.println("Informações do Fornecedor:");
        System.out.println("Nome: " + fornecedor.getNome());
        System.out.println("Endereço: " + fornecedor.getEndereco());
        System.out.println("Telefone: " + fornecedor.getTelefone());
        System.out.println("Crédito: " + fornecedor.getValorCredito());
        System.out.println("Dívida: " + fornecedor.getValorDivida());


        double saldo = fornecedor.obterSaldo();
        System.out.println("Saldo: " + saldo);
    }
}