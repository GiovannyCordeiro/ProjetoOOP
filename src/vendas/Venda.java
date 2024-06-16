package vendas;

import java.util.ArrayList;

public class Venda {
  ArrayList listaDeProdutos = new ArrayList<>();
  float valorTotal = 0;
  String data;
  String vendedor;
  String Cliente;

  public Venda(
    ArrayList listaDeProdutos,
    float valorTotal,
    String data,
    String vendedor,
    String cliente
  ){
    this.listaDeProdutos = listaDeProdutos;
    this.valorTotal = valorTotal;
    this.data = data;
    this.vendedor = vendedor;
    this.Cliente = cliente;
  }

  public float getValorTotal() {
    return valorTotal;
  }

  public void setValorTotal(float valorTotal) {
    this.valorTotal = valorTotal;
  }
}
