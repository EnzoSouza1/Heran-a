public class TesteAdministrador {
    public static void main(String[] args) {
        Administrador administrador = new Administrador("Alice", "Rua XYZ, 456", "987-654-321",
                102, 4000.0, 15.0, 500.0);


        System.out.println("Informações do Administrador:");
        System.out.println("Nome: " + administrador.getNome());
        System.out.println("Endereço: " + administrador.getEndereco());
        System.out.println("Telefone: " + administrador.getTelefone());
        System.out.println("Código do Setor: " + administrador.getCodigoSetor());
        System.out.println("Salário Base: " + administrador.getSalarioBase());
        System.out.println("Imposto: " + administrador.getImposto());
        System.out.println("Ajuda de Custo: " + administrador.getAjudaDeCusto());


        double salarioLiquido = administrador.calcularSalario();
        System.out.println("Salário Líquido: " + salarioLiquido);
    }
}
