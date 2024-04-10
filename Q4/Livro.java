package Q4;

public class Livro {
	
	  String titulo;
	    
	    boolean disponivel;

	    Livro(String titulo, boolean disponivel) {
	        this.titulo = titulo;
	        
	        this.disponivel = disponivel;
	    }

	    String verificarDisponibilidade() {
	        if (disponivel) {
	            return "O livro " + titulo +" está disponível para empréstimo.";
	        } else {
	            return "O livro " + titulo + " não está disponível para empréstimo.";
	        }
	    }

}
