package ofertaDesconto;

import java.util.ArrayList;
import java.util.Scanner;

import logicaProdutos.LogicaProdutos;
import produto.Produto;

public class LogicaOfertaDesconto {

  ArrayList listaOfertasDesconto;
  ArrayList listaDeProdutos;
  Scanner newScanner = new Scanner(System.in);

  public LogicaOfertaDesconto(ArrayList listaOfertasDesconto, ArrayList listaDeProdutos){
    this.listaOfertasDesconto = listaOfertasDesconto;
    this.listaDeProdutos = listaDeProdutos;
  }

  public void menuOfertasDesconto(){
    System.out.println("Lista opções ofertas deconto");
    System.out.println("1. Listar Ofertas de desconto");
    System.out.println("2. Cadastrar nova oferta de desconto");
    System.out.println("3. Remover oferta de desconto");
    System.out.println("4. Voltar");
    String opcaoOfertaDesconto = newScanner.nextLine();

    switch (opcaoOfertaDesconto) {
      case "1":
        this.mostrarOfertasDesconto();
        break;
      case "2":
        this.cadastrarOfertaDesconto();
        break;
      case "3":
        this.removerOfertaDesconto();
        break;
      default:
        break;
    }
  }

  private void cadastrarOfertaDesconto(){
    // listar produtos
    LogicaProdutos produtos = new LogicaProdutos(this.listaDeProdutos);
    produtos.consultarProdutos();

    // receber o indice do produto
    System.out.println("Escolha o numero de um produto dentro dessa lista de produtos");
    String opcaoProduto = newScanner.nextLine();
    int opcaoProdutoInt = Integer.parseInt(opcaoProduto);

    // Pegando produto na lista de produtos, se o usuario passar um indice que nao tem
    // tem que dar pau
    Produto produtoEscolhido = (Produto) this.listaDeProdutos.get(opcaoProdutoInt - 1);
    float precoAnterior = produtoEscolhido.getPreco();
    
    // Input do valor que vai ser abatido
    System.out.println("Escolha o valor abatido de desconto");
    String valorAbatidoNoDesconto = newScanner.nextLine();
    float valorAbatidoNoDescontoFloat = Float.parseFloat(valorAbatidoNoDesconto);

    // adicionando desconto
    Desconto novoDesconto = new Desconto(produtoEscolhido, precoAnterior, valorAbatidoNoDescontoFloat);
    this.listaOfertasDesconto.add(novoDesconto);

    // atualizando precoProduto apos o desconto
    produtoEscolhido.setPreco(novoDesconto.getPrecoPosDesconto());

    System.out.println("Oferta de desconto criada com sucesso!");
  }

  private void mostrarOfertasDesconto(){
    if(this.listaOfertasDesconto.size() == 0){
      System.out.println("Não existem ofertas de desconto cadastradas!");
      return;
    }
    for (int i = 0; i < this.listaOfertasDesconto.size(); i++) {
      System.out.println(i + 1 + ": " + this.listaOfertasDesconto.get(i).toString());
    }
  }

  private void removerOfertaDesconto(){
    this.mostrarOfertasDesconto();

    System.out.println("Escolha dos numeros de oferta de desconto");
    String ofertaDeDesconto = newScanner.nextLine();
    int ofertaDeDescontoInt = Integer.parseInt(ofertaDeDesconto);

    Desconto descontoEscolhido = (Desconto) this.listaOfertasDesconto.get(ofertaDeDescontoInt - 1);
    float precoAnterior = descontoEscolhido.precoAnterior;
    descontoEscolhido.produtoEscolhido.setPreco(precoAnterior);

    this.listaOfertasDesconto.remove(ofertaDeDescontoInt);
    System.out.println("Desconto removido com sucesso!");
  }
}
