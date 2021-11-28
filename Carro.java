package exercicios_1;

public class Carro  {
  
	private String cor;
	private String placa;
	private String modelo;
	private double preco;
	private int numero;
	
	
	
	
	public Carro(String modelo,int numero) {
		super();
		
		
		this.modelo = modelo;
		this.numero = numero;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
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
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[ Carro"+"-"+this.numero +  " modelo: " + this.modelo + "Plca: " + this.placa + "]"; 
	}
	
}
