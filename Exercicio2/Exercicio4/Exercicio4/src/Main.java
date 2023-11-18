public class Main {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("Enzo", 19, 12345, "Ciência da Computação");
        Professor professor = new Professor("João", 40, 9876, "POO");

        System.out.println("Estudante:");
        System.out.println("Nome: " + estudante.getNome());
        System.out.println("Idade: " + estudante.getIdade());
        System.out.println("Matrícula: " + estudante.getMatricula());
        System.out.println("Curso: " + estudante.getCurso());

        System.out.println("\nProfessor:");
        System.out.println("Nome: " + professor.getNome());
        System.out.println("Idade: " + professor.getIdade());
        System.out.println("Registro: " + professor.getRegistro());
        System.out.println("Disciplina: " + professor.getDisciplina());
    }
}
