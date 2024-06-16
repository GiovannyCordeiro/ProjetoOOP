package adicionarUsuarios;

import java.util.ArrayList;
import java.util.Scanner;
import usuarios.*;

public class AdicionarUsuarios {
  ArrayList listaUsuarios;

  String nome;
  int idadeInt;
  int numeroContatoInt;
  Scanner scanner = new Scanner(System.in);

  public AdicionarUsuarios(ArrayList listaUsuarios){
    this.listaUsuarios = listaUsuarios;
  }
  
  public void novoUsuario(){
    
    System.out.println("Qual tipo de usuario se enquadra?");
    System.out.println("1 - Caixa?");
    System.out.println("2 - Cliente?");
    System.out.println("3 - Fornecedor?");
    System.out.println("4 - Gerente?");
    System.out.println("5 - Vendedor?");

    String opcao = scanner.nextLine();

    // Inputs comuns a todos os usuarios
    System.out.println("Digite o nome:");
    this.nome = scanner.nextLine();

    System.out.println("Digite a idade");
    String idade = scanner.nextLine();
    this.idadeInt = Integer.parseInt(idade);

    System.out.println("Digite numero de contato");
    String numeroContato = scanner.nextLine();
    this.numeroContatoInt = Integer.parseInt(numeroContato);

    // inputs especificos
    switch (opcao) {
      case "1":
        this.inserirCaixa();
        break;
      case "2":
        this.inserirCliente();
        break;
      case "3":
        this.inserirFornecedor();
        break;
      case "4":
        this.inserirGerente();
        break;
      case "5":
        this.inserirVendedor();
        break;
      default:
        break;
    }

  }

  private void inserirCaixa(){
    System.out.println("Digite o setor");
      String setor = scanner.nextLine();

      System.out.println("Digite numero balcao");
      String numeroBalcao = scanner.nextLine();
      int numeroBalcaoInt = Integer.parseInt(numeroBalcao);

      Caixa novoCaixa = new Caixa(nome, idadeInt, numeroContatoInt, setor, numeroBalcaoInt);
      listaUsuarios.add(novoCaixa);
      System.out.println("Novo usuario 'caixa' inserido com sucesso!");
  }

  private void inserirCliente(){
    System.out.println("Digite a categoria favorita do cliente");
    String categoriaFavorita = scanner.nextLine();

    Cliente novoCliente = new Cliente(nome, idadeInt, numeroContatoInt, categoriaFavorita);
    listaUsuarios.add(novoCliente);
    System.out.println("Novo usuario 'cliente' inserido com sucesso!");
  }

  private void inserirFornecedor(){
    System.out.println("Digite a categoria do fornecedor");
    String categoria = scanner.nextLine();

    Fornecedor novoFornecedor = new Fornecedor(nome, idadeInt, numeroContatoInt, categoria);
    listaUsuarios.add(novoFornecedor);
    System.out.println("Usuario 'fornecedor' inserido com sucesso!");
  }

  private void inserirGerente(){
    System.out.println("Digite a setor do gerente");
    String setorGerente = scanner.nextLine();

    Gerente novoGerente = new Gerente(nome, idadeInt, numeroContatoInt, setorGerente);
    listaUsuarios.add(novoGerente);
    System.out.println("Usuario 'gerente' inserido com sucesso!");
  }

  private void inserirVendedor(){
    System.out.println("Digite a cargo do gerente");
    String cargoVendedor = scanner.nextLine();
    Vendedor novoVendedor = new Vendedor(nome, idadeInt, numeroContatoInt, cargoVendedor);
    listaUsuarios.add(novoVendedor);
    System.out.println("Usuario 'vendedor' inserido com sucesso!");
  }

}
