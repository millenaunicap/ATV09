package Q2;
import java.util.ArrayList;

public class Pedido {
	
	
	    int numero;
	    ArrayList<ItemPedido> itens;
	    double total;

	    Pedido(int numero, ArrayList<ItemPedido> itens) {
	        this.numero = numero;
	        this.itens = itens;
	        calcularTotal();
	    

	    }
	    
	    private void calcularTotal() {
	        double total = 0;
	        for (ItemPedido item : itens) {
	            total += item.preco;
	        }
	        this.total = total;
	    }
}
