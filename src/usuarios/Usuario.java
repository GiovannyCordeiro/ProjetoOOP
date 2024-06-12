package usuarios;

abstract class Usuario {
  String nome;
  int idade;
  int numeroContato;

  public Usuario(String nome, int idade, int numeroContato){
    this.nome = nome;
    this.idade = idade;
    this.numeroContato = numeroContato;
  }
}
