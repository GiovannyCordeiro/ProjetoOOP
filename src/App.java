import java.util.ArrayList;
import java.util.Scanner;
import adicionarUsuarios.*;
import logicaProdutos.*;
import ofertaDesconto.LogicaOfertaDesconto;
import produto.Produto;
import registraVendas.*;
import relatorioVendas.RelatorioVendas;

public class App {
    public static void main(String[] args) throws Exception {
      // Tratando erro de cancelamento repentino no sistema
      Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
        @Override
        public void uncaughtException(Thread t, Throwable e) {
            System.out.println("Mensagem do sistema:");
            System.out.println("Cancelamento forçado do sistema, obrigado por utilizar!");
            System.out.println("Qualquer dúvida entre em contato com o suporte");
        }
      });

        // Variaveis globais de armazenamento
        ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
        ArrayList ListaUsuarios = new ArrayList<>();
        ArrayList listaVendas = new ArrayList<>();
        ArrayList ofertasDesconto = new ArrayList<>();

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
              LogicaProdutos logicaProd = new LogicaProdutos(listaProdutos);
              logicaProd.opcoesProdutos();
              break;
            case "3":
                RegistraVendas registrarVendas = new RegistraVendas(listaVendas, listaProdutos);
                registrarVendas.adicionarVenda();
              break;
            case "4":
              LogicaOfertaDesconto logicaDesconto = new LogicaOfertaDesconto(ofertasDesconto, listaProdutos);
              logicaDesconto.menuOfertasDesconto();
              break;
            case "5":
              RelatorioVendas relatorioVendas = new RelatorioVendas(listaVendas, ofertasDesconto, listaProdutos);
              relatorioVendas.gerarRelatorio();
              break;
            case "6":
              System.out.println("Te vejo em breve!");
              break;
            default:
              System.out.println("Escolha uma das opções sugeridas");
              break;
          }
        }

        // System.out.println(ListaUsuarios.size());
        scanner.close();
    }

    
}
