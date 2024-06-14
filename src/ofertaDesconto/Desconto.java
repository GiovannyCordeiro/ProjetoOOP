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

}
