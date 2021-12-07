package exercicio_2;

public class Conta {
  private int agencia;
  private int numeroCartao;
  private int cartao;
  private String senha;
  private Pessoa usuario;
public Conta(int numeroCartao,  Pessoa usuario) {
	
	this.numeroCartao = numeroCartao;
	this.usuario = usuario;
}
public int getNumero() {
	return numeroCartao;
}
public void setNumero(int numero) {
	this.numeroCartao = numero;
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
		return "["+" Conta " + " Numero: " + this.numeroCartao + " Agencia: " + this.agencia + " Cartão: " + this.cartao + " Usuario " + this.usuario + " Senha: " + this.senha + "]" +"\n" ;
	}
public Pessoa getUsuario() {
	return usuario;
}
public void setUsuario(Pessoa usuario) {
	this.usuario = usuario;
}

}
