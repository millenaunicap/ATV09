package Q3;
import java.util.ArrayList;

	
	class Aluno {
	    String nome;
	    int matricula;
	    ArrayList<Double> notas;

	    Aluno(String nome, int matricula, ArrayList<Double> notas) {
	        this.nome = nome;
	        this.matricula = matricula;
	        this.notas = notas;
	    }

	    double calcularMedia() {
	        double soma = 0;
	        for (double nota : notas) {
	            soma += nota;
	        }
	        return soma / notas.size();
	    }
	}


