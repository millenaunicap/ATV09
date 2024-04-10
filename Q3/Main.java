package Q3;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      
        Aluno aluno1 = new Aluno("Joao", 12345, new ArrayList<>(List.of(7.5, 8.0, 6.5)));
        Aluno aluno2 = new Aluno("Maria", 67890, new ArrayList<>(List.of(6.0, 7.0, 7.5)));
        Aluno aluno3 = new Aluno("Pedro", 13579, new ArrayList<>(List.of(9.0, 8.5, 9.5)));

        
        System.out.println("Alunos aprovados:");
        for (Aluno aluno : List.of(aluno1, aluno2, aluno3)) {
            if (aluno.calcularMedia() >= 7.0) {
                System.out.println(aluno.nome + " - Matrícula: " + aluno.matricula + ", Média: " + aluno.calcularMedia());
            }
        }

        System.out.println("\nAlunos reprovados:");
        for (Aluno aluno : List.of(aluno1, aluno2, aluno3)) {
            if (aluno.calcularMedia() < 7.0) {
                System.out.println(aluno.nome + " - Matrícula: " + aluno.matricula + ", Média: " + aluno.calcularMedia());
            }
        }
    }
}
