package exercicio_3;

public class Lugar {
  
	private String  destino; 
	private Pessoa cliente;
	public Lugar(String destino, Pessoa cliente) {
		super();
		this.destino = destino;
		this.cliente = cliente;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + "Destino: " + this.destino + " Cliente: " + this.cliente;
	}
}
