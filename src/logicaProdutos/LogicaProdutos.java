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
        this.atualizarProduto();
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

  void atualizarProduto(){
    System.out.println("Digite o numero do item que se quer atualizar:");
    String opcaoAttProduto = this.newScanner.nextLine();

    int indexAttProduto = Integer.parseInt(opcaoAttProduto) - 1;
    try {
      System.out.println("Digite novo nome do produto");
      String novoNome = this.newScanner.nextLine();

      System.out.println("Digite nova categoria do produto");
      String novaCategoria = this.newScanner.nextLine();

      System.out.println("Digite novo fornecedor do produto");
      String novoFornecedor = this.newScanner.nextLine();

      System.out.println("Digite novo preço do produto");
      String novoPreco = this.newScanner.nextLine();
      float novoPrecoFloat = Float.parseFloat(novoPreco);

      System.out.println("Digite nova quantidade do produto");
      String novaQuantidade = this.newScanner.nextLine();
      int novaQuantInt = Integer.parseInt(novaQuantidade);

      System.out.println("Digite nova descricao do produto");
      String novaDescricao = this.newScanner.nextLine();

      Produto produtoAtualizado = new Produto(
        novoNome, 
        novaCategoria, 
        novoFornecedor, 
        novoPrecoFloat, 
        novaQuantInt, 
        novaDescricao
      );

      listaProdutos.set(indexAttProduto, produtoAtualizado);
      System.out.println("Produto atualizado com sucesso!");

    } catch (IndexOutOfBoundsException e) {
      System.out.println("Índice do item não encontrado: " + indexAttProduto);
    }
  }


}
