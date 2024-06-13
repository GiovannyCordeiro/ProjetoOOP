package logicaProdutos;
import java.util.ArrayList;

import java.util.Scanner;

import produto.Produto;

public class LogicaProdutos {
  ArrayList listaProdutos;
  Scanner newScanner = new Scanner(System.in);
  public LogicaProdutos(ArrayList listaProdutos){
    this.listaProdutos = listaProdutos;
  }

  public void opcoesProdutos(){
    System.out.println("Que operação você deseja fazer?");
    System.out.println("1 - consultar produtos");
    System.out.println("2 - Inserir produto");
    System.out.println("3 - atualizar produto");
    System.out.println("4 - deletar produtos");
    String opcaoOperacaoProdutos = this.newScanner.nextLine();

    switch (opcaoOperacaoProdutos) {
      case "1":
        this.consultarProdutos();
        break;
      case "2":
        this.inserirProduto();
        break;
      case "3":
        // logica atualizacao
        break;
      case "4":
        // logica delecao
        break;
      default:
        break;
    }
  }

  void consultarProdutos(){
    if (listaProdutos.size() == 0){
      System.out.println("A lista de produtos esta vazia!");
    }
    for (int i = 0; i < listaProdutos.size(); i++) {
      int posicao = i + 1;
      String texto = posicao + ": " + listaProdutos.get(i);
      System.out.println(texto);
    }
  }

  void inserirProduto(){
    System.out.println("Digite o nome do novo produto");
    String nomeProduto = this.newScanner.nextLine();

    System.out.println("Digite a categoria do novo produto");
    String categoriaProduto = this.newScanner.nextLine();

    System.out.println("Digite o fornecedor do novo produto");
    String fornecedorProduto = this.newScanner.nextLine();

    System.out.println("Digite o preço do novo produto"); //float
    String precoProduto = this.newScanner.nextLine();
    Float floatPrecoProduto = Float.parseFloat(precoProduto);

    System.out.println("Digite a quantidade do novo produto"); //int
    String quantProduto = this.newScanner.nextLine();
    int intQuantProduto = Integer.parseInt(quantProduto);

    System.out.println("Digiite a descrição do produto");
    String descricaoProduto = this.newScanner.nextLine();

    Produto novoProduto = new Produto(nomeProduto, categoriaProduto, fornecedorProduto, floatPrecoProduto, intQuantProduto, descricaoProduto);

    this.listaProdutos.add(novoProduto);
    System.out.println("Produto inserido com sucesso!");
  }

}
