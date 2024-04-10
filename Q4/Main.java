package Q4;

	
	public class Main {
	    public static void main(String[] args) {
	       
	        Livro livro1 = new Livro("aaaaa", true);
	        Livro livro2 = new Livro("xxx", false);
	        Livro livro3 = new Livro("fthug",true);

	       
	        System.out.println(livro1.verificarDisponibilidade());
	        System.out.println(livro2.verificarDisponibilidade());
	        System.out.println(livro3.verificarDisponibilidade());
	    }
	}


