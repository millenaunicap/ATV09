package Q2;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Pedido> pedidos = new ArrayList<>();
       
        ArrayList<ItemPedido> itensPedido1 = new ArrayList<>();
        itensPedido1.add(new ItemPedido("Produto 1", 4500));
        itensPedido1.add(new ItemPedido("Produto 2", 200));
        pedidos.add(new Pedido(1, itensPedido1));

        ArrayList<ItemPedido> itensPedido2 = new ArrayList<>();
        itensPedido2.add(new ItemPedido("Produto 3", 300));
        itensPedido2.add(new ItemPedido("Produto 4", 7800));
        pedidos.add(new Pedido(2, itensPedido2));

        
        System.out.println("Números dos pedidos com valor total superior a R$500:");
        for (Pedido pedido : pedidos) {
            if (pedido.total > 500) {
                System.out.println(pedido.numero);
            }
        }
    }
}