import java.util.*;
public class RegistrarVendas extends Produtos {
    String produto;
    double valor;
    String data;
    List<String> produtos;
    String vendedor;
    String cliente;
    double valorTotal;
    
    public RegistrarVendas (String data, String produto, String vendedor, String cliente, double valor){
        this.data = data;
        this.produtos = new ArrayList<>();
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.valorTotal = 0;
        this.valor = valor;
        this.produto = produto;

    }
    
    public void adicionarProduto(String produto, double valor) {
        produtos.add(produto);
        valorTotal += valor;
    }

    
    public void RegsitrodeVenda(){
        System.out.println("Regsitro de venda: ");
        System.out.println("\n Data: "+data+ "\n Produtos: "+produtos+ "\nVendedor: "+vendedor+ "\nCliente: "+cliente+ "\nValor Total: "+valorTotal );
    }

}
