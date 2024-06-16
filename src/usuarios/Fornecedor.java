package usuarios;

public class Fornecedor extends Usuario {
  String categoriaFornecedor;
  public Fornecedor(String nome, int idade, int numeroContato, String categoriaFornecedor){
    super(nome, idade, numeroContato);
    this.categoriaFornecedor = categoriaFornecedor;
  }
}
