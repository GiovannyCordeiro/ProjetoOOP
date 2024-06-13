import java.util.ArrayList;
import java.util.Scanner;
import usuarios.*;
import adicionarUsuarios.*;
import logicaProdutos.*;
import produto.Produto;
import registraVendas.*;

public class App {
    public static void main(String[] args) throws Exception {
        // Variaveis globais de armazenamento
        ArrayList<Produto> ListaProdutos = new ArrayList<Produto>();
        ArrayList ListaUsuarios = new ArrayList<>();
        ArrayList listaVendas = new ArrayList<>();

        // começo do programa
        Scanner scanner = new Scanner(System.in);
        String opcaoEscolhida = "";

        // Loop para verificação de outras opções incorretas
        while (!opcaoEscolhida.equalsIgnoreCase("6")) {
          
          System.out.println("------------------------------");
          System.out.println("Bem vindo ao sistema!");
          System.out.println("Escolha uma das opções abaixo!");
          
          System.out.println("1 - Adicionar usuario");
          System.out.println("2 - Opções para produtos");
          System.out.println("3 - Registrar vendas");
          System.out.println("4 - Adicionar oferta de desconto");
          System.out.println("5 - Gerar relatorios de vendas");
          System.out.println("6 - Sair da aplicação");
          System.out.println("------------------------------");

          opcaoEscolhida = scanner.nextLine();
          switch (opcaoEscolhida) {
            case "1":
              AdicionarUsuarios logicaUsr = new AdicionarUsuarios(ListaUsuarios);
              logicaUsr.novoUsuario();
              break;
            case "2":
              LogicaProdutos logicaProd = new LogicaProdutos(ListaProdutos);
              logicaProd.opcoesProdutos();
              break;
            case "3":
                RegistraVendas registrarVendas = new RegistraVendas(listaVendas, ListaProdutos);
                registrarVendas.adicionarVenda();
                // System.err.println("tamano da lista de vendas: " + listaVendas.size());
              break;
            case "4":
              System.out.println("ENTRANDO NA LOGICA 4");
              break;
            case "5":
              System.out.println("ENTRANDO NA LOGICA 5");
              break;
            case "6":
              System.out.println("Te vejo em breve!");
              break;
            default:
              System.out.println("Escolha uma das opções sugeridas");
              break;
          }
        }

        System.out.println(ListaUsuarios.size());
        scanner.close();
    }
}
