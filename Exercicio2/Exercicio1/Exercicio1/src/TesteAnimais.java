public class TesteAnimais {
    public static void main(String[] args) {
        Animal animal = new Animal("Rex", 10.5);
        Peixe peixe = new Peixe("Nemo", 0.5, "água doce");
        Cachorro cachorro = new Cachorro("Mel", 7.0, "Golden Retriever");

        System.out.println("Informações do Animal:");
        System.out.println(animal);

        System.out.println("\nInformações do Peixe:");
        System.out.println(peixe);

        System.out.println("\nInformações do Cachorro:");
        System.out.println(cachorro);
    }
}
