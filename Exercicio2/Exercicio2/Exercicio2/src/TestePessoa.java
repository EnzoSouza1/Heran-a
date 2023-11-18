public class TestePessoa {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Maria", "Feminino", 30, 1000.0, 1990);
        System.out.println("Informações do Cliente:");
        System.out.println(cliente);

        Gerente gerente = new Gerente("João", "Masculino", 40, "G001", 5000.0, "Vendas");
        System.out.println("\nInformações do Gerente:");
        System.out.println(gerente);

        Vendedor vendedor = new Vendedor("Ana", "Feminino", 25, "V001", 2000.0, 10000.0, 50);
        System.out.println("\nInformações do Vendedor:");
        System.out.println(vendedor);
    }
}
