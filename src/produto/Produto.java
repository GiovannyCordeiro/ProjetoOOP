package produto;

public class Produto {
  String nome;
  String categoria;
  String fornecedor;
  float preco;
  int quantidade;
  String descricao;

  public Produto(String nome, 
    String categoria, 
    String fornecedor, 
    float preco, 
    int quantidade, 
    String descricao
  ){
    this.nome = nome;
    this.categoria = categoria;
    this.fornecedor = fornecedor;
    this.preco = preco;
    this.quantidade = quantidade;
    this.descricao = descricao;
  }

  @Override
    public String toString() {
        return "Produto { " +
                "nome = '" + this.nome + '\'' +
                ", categoria = '" + this.categoria + '\'' +
                ", fornecedor = '" + this.fornecedor + '\'' +
                ", preco = " + this.preco +
                ", quantidade = " + this.quantidade +
                '}';
  }
  

}
