package exercicio_2;

import java.util.ArrayList;

public class TesteAgenciaBancaria {
	

		public static void main(String[] args) {
			
			AgenciaBancaria novaAgencia = new AgenciaBancaria();
			
			ArrayList<Conta> contas; 
			
			Pessoa pessoa1 = new Pessoa("João", "123.456.78-9");
			Conta novaConta = new Conta(456798123, pessoa1 );
		    novaAgencia.adicionarConta(novaConta);
			
			novaAgencia.listarDadosPessoa("123.456.78-9");
			
			
			Pessoa pessoa2 = new Pessoa("Pedro", "458.456.64-9");
			Conta novaConta2 = new Conta(126598732, pessoa2);
			novaAgencia.adicionarConta(novaConta2);
		
			
			contas = novaAgencia.buscaTodasContas();
			System.out.println(contas.size());
			
			novaAgencia.apagarConta(126598732);
			
			contas = novaAgencia.buscaTodasContas();
			System.out.println(contas.size());
			
			
			
		}

	}

