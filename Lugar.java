package exercicio_3;

public class Lugar {
  
	private String  destino; 
	private Pessoa cliente;
	public Lugar(String destino, Pessoa cliente) {
		super();
		this.destino = destino;
		this.cliente = cliente;
	}
	
	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Pessoa getCliente() {
		return cliente;
	}

	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}

	
}
