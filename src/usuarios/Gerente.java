package usuarios;

public class Gerente extends Usuario {
  String setor;

  public Gerente(String nome, int idade, int numeroContato, String setor){
    super(nome, idade, numeroContato);
    this.setor = setor;
  }
}
