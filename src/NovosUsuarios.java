
import java.util.ArrayList; // implementação da interface
import java.util.List;      // lista redimensionável dos elementos
import java.util.Scanner;   // importa a classe

public class NovosUsuarios { // declara a classe NovosUsuarios

    public static void main(String[] args) { 

        // O sistema deve adicionar novos usuários (gerente, vendedor, caixa, cliente, fornecedor)

        List<String> usuarios = new ArrayList<>(); // Cria uma lista para armazenar os nomes dos novos usuários
        
        try (Scanner inputScanner = new Scanner(System.in)) { 
            while (true)      // Inicia o loop
            {
                
                System.out.println("Informe o nome do novo usuário que deseja cadastrar (digite 'Concluir' para encerrar o sistema.): ");
                String nomeUsuario = inputScanner.nextLine(); 
                
                usuarios.add(nomeUsuario);     // Adiciona o novo usuário à lista
                
                System.out.println(nomeUsuario + " foi adicionado a lista!"); // Confirmação de adição a lista
                
                if (nomeUsuario.equalsIgnoreCase("Concluir")) {
                    break;     // Verifica se o usuário deseja sair do loop
                }
                
            }
        }
        System.out.println("Concluído com sucesso. Segue lista de novos usuários cadastrados: ");
        for (String usuario : usuarios) {
            System.out.println(usuario);      // Exibe a lista de todos os usuários adicionados
        }
    }
}