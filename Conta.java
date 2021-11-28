package exercicio_2;

public class Conta {
  private int agencia;
  private int numero;
  private int cartao;
  private String senha;
  private Pessoa usuario;
public Conta(int agengia,int numero, int cartao, String senha, Pessoa usuario) {
	super();
	this.agencia = agengia;
	this.numero = numero;
	this.cartao = cartao;
	this.senha = senha;
	this.usuario = usuario;
}
public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}
public int getCartao() {
	return cartao;
}
public void setCartao(int cartao) {
	this.cartao = cartao;
}
public String getSenha() {
	return senha;
}
public void setSenha(String senha) {
	this.senha = senha;
}
   @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "["+" Conta " + " Numero: " + this.numero + " Agencia: " + this.agencia + " Cartão: " + this.cartao + " Usuario " + this.usuario + " Senha: " + this.senha + "]" +"\n" ;
	}

}
