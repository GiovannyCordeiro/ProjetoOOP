package relatorioVendas;

import java.util.ArrayList;

import vendas.Venda;

public class RelatorioVendas {
  ArrayList listaDeVendas;
  ArrayList ofertasDesconto;
  ArrayList listaProdutos;

  public RelatorioVendas(
    ArrayList listaDeVendas, 
    ArrayList ofertasDesconto, 
    ArrayList listaProdutos
  ){
    this.listaDeVendas = listaDeVendas;
    this.ofertasDesconto = ofertasDesconto;
    this.listaProdutos = listaProdutos;
  }

  public void gerarRelatorio(){
    System.out.println("|-- Relatorios de vendas --|");

    System.out.println("Quantidadade de descontos oferecidos atualmente: " + this.ofertasDesconto.size());
    System.out.println("Quantidadade de produtos oferecidos atualmente: " + this.listaProdutos.size());
    System.out.println("Quantidadade de vendas realizadas atualmente: " + this.listaDeVendas.size());

    float quantidadeTotalVenda = 0;
    for (int i = 0; i < listaDeVendas.size(); i++) {
      Venda vendaAtual = (Venda) listaDeVendas.get(i);
      quantidadeTotalVenda += vendaAtual.getValorTotal();
    }

    System.out.println("Quantidadade de faturalmento atual: " + quantidadeTotalVenda);

    System.out.println("|-- Fim --|");


  }
}
