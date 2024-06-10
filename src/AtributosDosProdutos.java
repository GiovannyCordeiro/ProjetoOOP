import java.util.ArrayList; // classe para criar listas
import java.util.List;  // interface
import java.util.Scanner;   // classe para receber informações do usuário (como o input em Python)

// Atributos essenciais de um produto que devem ser add: nome, categoria, fornecedor, preço, quantidade.

public class AtributosDosProdutos { // declara a classe AtributosDosProdutos
    private String nome;
    private String categoria;
    private String fornecedor;
    private Double preco;
    private int quantidade;

// Construtor da class 
    public AtributosDosProdutos(String nome, String categoria, String fornecedor, Double preco, int quantidade) {

        // inicia os atributos com os valores passados para o construtor
        this.nome = nome; 
        this.categoria = categoria;
        this.fornecedor = fornecedor;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Método get para obter valores dos atributos (nome, categoria, preço, etc)
    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public Double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Produto { " +
                "nome = '" + nome + '\'' +
                ", categoria = '" + categoria + '\'' +
                ", fornecedor = '" + fornecedor + '\'' +
                ", preco = " + preco +
                ", quantidade = " + quantidade +
                '}';
    }

    public static void main(String[] args) { // método main para entrada de informações digitadas pelo usuários do sistema
        Scanner scanner = new Scanner(System.in);

        List<AtributosDosProdutos> produtos = new ArrayList<>();
        System.out.println("Qual o nome do produto?");
        String nome = scanner.nextLine(); // avançar para a próxima linha

        System.out.println("Informe a categoria:");
        String categoria = scanner.nextLine();

        System.out.println("Informe o fornecedor:");
        String fornecedor = scanner.nextLine();

        System.out.println("Qual o preço do produto?");
        Double preco = scanner.nextDouble();

        System.out.println("Informe a quantidade adquirida do produto: ");
        int quantidade = scanner.nextInt();

        AtributosDosProdutos produto = new AtributosDosProdutos(nome, categoria, fornecedor, preco, quantidade);
        produtos.add(produto); // Adiciona o produto na lista

        System.out.println("Informações gerais do produto:\n " + produto); // saída para as informações registradas

    }
}