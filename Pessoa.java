package exercicio_3;

public class Pessoa {
  
   private String nome;
   public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getCpf() {
	return cpf;
}
public void setCpf(String cpf) {
	this.cpf = cpf;
}
private String cpf;
public Pessoa(String nome, String cpf) {
	super();
	this.nome = nome;
	this.cpf = cpf;
}
  
	
}


   
   
