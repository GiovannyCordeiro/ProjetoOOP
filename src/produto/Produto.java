package produto;

public class Produto implements Cloneable{
  String nome;
  String categoria;
  String fornecedor;
  float preco;
  int quantidade;
  String descricao;
  int quantidadeVenda;

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

  public int getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

  public void setQuantidadeVenda(int quantidadeVenda) {
    this.quantidadeVenda = quantidadeVenda;
  }

  public float getPreco() {
    return preco;
  }

  @Override
    public Produto clone() {
        try {
            return (Produto) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
