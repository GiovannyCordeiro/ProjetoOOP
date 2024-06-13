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
        // logica consulta
        break;
      case "2":
        // logica insercao
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

}
