package exercicio_3;

public class Pessoa {
  
   private String nome;
   private String cpf;
public Pessoa(String nome, String cpf) {
	super();
	this.nome = nome;
	this.cpf = cpf;
}
  @Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nome + " Cpf: " + this.cpf + "\n";
	}
	
}


   
   

