package exercicio_4;

import java.text.SimpleDateFormat;

public class Funcionario extends SetoresEmpresa {
      
	private String nome ;
	private SetoresEmpresa setor ;
	private String cargo;
	public Funcionario(String nome, SetoresEmpresa setor, String cargo) {
		super();
		this.nome = nome;
		this.setor = setor;
		this.cargo = cargo;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  this.nome + " Setor: " + this.setor + " Cargo " + this.cargo + "\n";
	}

	
}
