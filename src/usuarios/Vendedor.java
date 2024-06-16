package usuarios;

public class Vendedor extends Usuario {
  String cargo;
  public Vendedor(String nome, int idade, int numeroContato, String cargo){
    super(nome, idade, numeroContato);
    this.cargo = cargo;
  }
}
