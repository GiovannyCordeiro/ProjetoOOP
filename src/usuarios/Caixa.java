package usuarios;

public class Caixa extends Usuario{
  int numeroDoBalcao;
  public Caixa(String nome, int idade, int numeroContato, String setor, int numeroDoBalcao){
    super(nome, idade, numeroContato);
    this.numeroDoBalcao = numeroDoBalcao;
  }
}
