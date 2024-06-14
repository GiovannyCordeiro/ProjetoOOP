package ofertaDesconto;

import produto.Produto;

public class Desconto implements RegraDesconto{
  Produto produtoEscolhido;
  float precoAnterior;
  float precoPosDesconto;

  public Desconto(
    Produto produtoEscolhido, 
    float precoAnterior,
    float valorDesconto
  ){
    this.produtoEscolhido = produtoEscolhido;
    this.precoAnterior = precoAnterior;
    this.precoPosDesconto = this.aplicacaoDesconto(valorDesconto);
  }

  @Override
  public float aplicacaoDesconto(float valorDesconto){
    return this.precoAnterior - valorDesconto;
  }

  public float getPrecoPosDesconto() {
    return precoPosDesconto;
  }

  public float getPrecoAnterior() {
    return precoAnterior;
  }

  public Produto getProdutoEscolhido() {
    return produtoEscolhido;
  }

  @Override
    public String toString() {
      return "Desconto: " +
              "Produto escolhido: " + produtoEscolhido.getNome() + "; " + 
              "Preco anterior: " + this.precoAnterior + "; " + 
              "Preco pos desconto: " + this.precoPosDesconto
              ;
    }

}
