package registraVendas;

import java.util.ArrayList;

import vendas.*;
import logicaProdutos.*;
import produto.Produto;
import java.util.Scanner;

import javax.sound.sampled.FloatControl;

public class RegistraVendas {
  ArrayList listaVendas;
  ArrayList listaProdutos;
  Scanner newScanner = new Scanner(System.in);

  public RegistraVendas(ArrayList listaVendas, ArrayList listaProdutos){
    this.listaVendas = listaVendas;
    this.listaProdutos = listaProdutos;
  }

  public void adicionarVenda(){

    ArrayList listaProdutosVentidos = new ArrayList<>();

    System.out.println("Digite o nome cliente:");
    String nomeCliente = newScanner.nextLine();

    System.out.println("Digite a data da venda:");
    String dataVenda = newScanner.nextLine();

    System.out.println("Digite nome do vendedor:");
    String nomeVendedor = newScanner.nextLine();

    float valorTotal = 0;

    LogicaProdutos logicaProdutos = new LogicaProdutos(listaProdutos);
    String adicionarNovoElemento = "s";

    while (!adicionarNovoElemento.equalsIgnoreCase("n")) {
      // Mostrando todos os produtos disponiveis
      logicaProdutos.consultarProdutos();

      // escolhendo produtos
      System.out.println("Escolha o numero do produto");
      String opcaoProduto = newScanner.nextLine();
      int indiceProduto = Integer.parseInt(opcaoProduto) - 1;

      Produto produtoEscolhido;
      try {
        produtoEscolhido = (Produto) listaProdutos.get(indiceProduto);
      } catch (IndexOutOfBoundsException e) {
        System.out.println("Item não cadastrado no sistema, tente novamente");
        return;
      }

      /* OBS!
        Foi necessário clonar a instancia do objeto, o objetivo dessa implementação
        foi presar a referencia da primeira lista na memoria, evidando que sobreescreve-la
      */
      Produto cloneProdutoEscolhido = produtoEscolhido.clone();

      // definindo quantidade do produto
      System.out.println("Escolha quantidade");
      String quantidadeProduto = newScanner.nextLine();
      int quantidadeProdutoInt = Integer.parseInt(quantidadeProduto);

      // colocando produto escolhido na venda
      cloneProdutoEscolhido.setQuantidadeVenda(quantidadeProdutoInt);
      listaProdutosVentidos.add(cloneProdutoEscolhido);

      // atualização estoque
      int quantidadeAtual = produtoEscolhido.getQuantidade();
      produtoEscolhido.setQuantidade(quantidadeAtual - quantidadeProdutoInt);

      // Atualização valor total dessa venda especificamente
      float precoProdutoEscolhido = produtoEscolhido.getPreco();
      float quantidadeProdutoEscolhido = Float.parseFloat(quantidadeProduto);
      float precoFinal = precoProdutoEscolhido * quantidadeProdutoEscolhido;
      valorTotal += precoFinal;

      // Adicionar mais produto ou cancelar!
      System.out.println("Item adicionado, adicionar mais?");
      System.out.println("s - sim");
      System.out.println("n - não");
      adicionarNovoElemento = newScanner.nextLine();
    }

    Venda novaVenda = new Venda(listaProdutosVentidos, valorTotal, dataVenda, nomeVendedor, nomeCliente);
    listaVendas.add(novaVenda);
    System.out.println("Venda adicionada com sucesso!");
  }
}
