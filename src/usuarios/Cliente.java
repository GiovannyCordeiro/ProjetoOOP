package usuarios;

public class Cliente extends Usuario{
  String categoriaFavorita;
  public Cliente(String nome, int idade, int numeroContato, String categoriaFavorita){
    super(nome, idade, numeroContato);
    this.categoriaFavorita = categoriaFavorita;
  }
}
