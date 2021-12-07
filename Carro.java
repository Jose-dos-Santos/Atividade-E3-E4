package exercicios_1;

public class Carro {

	private String cor;
	private String placa;
	private String modelo;
	private double preco;
	
	
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	
	public Carro(String modelo, String placa) {
		
		this.modelo = modelo;
		this.placa = placa;
	}

	public String getCor() {
		return cor;

	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[ Carro " + "- " + this.placa + " modelo: " + this.modelo + "]";
	}
	
	
}