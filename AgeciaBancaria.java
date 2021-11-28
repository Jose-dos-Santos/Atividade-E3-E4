package exercicio_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class AgeciaBancaria {
public static void main(String[] args) {
	
	
	Pessoa pessoa1 = new Pessoa("José", "123456789");
	Pessoa pessoa2 = new Pessoa("José Raimundo", "987654321");
	Pessoa pessoa3 = new Pessoa("José Antonio", "741852963");
	Pessoa pessoa4 = new Pessoa("José Algusto", "369258147");
	Pessoa pessoa5 = new Pessoa("José João", "147258369");
	Pessoa pessoa6 = new Pessoa("José Pedro", "159357123");
	
	Conta conta1 = new Conta(5420,1234, 123456, "abc1234", pessoa1);
	Conta conta2 = new Conta(5420,4321, 654321, "cba4321", pessoa2);
	Conta conta3 = new Conta(5420,6789, 654987, "def1234", pessoa3);
	Conta conta4 = new Conta(5420,9876, 789456, "fed4321", pessoa4);
	
	Set<Pessoa> pessoas = new HashSet<>();// criando um Set de pessoas
	
	pessoas.add(pessoa1);// adicinando uma pessoa
	pessoas.add(pessoa2);
	pessoas.add(pessoa3);
	pessoas.add(pessoa4);
	pessoas.add(pessoa5);
	pessoas.add(pessoa6);
	
	ArrayList<Conta> contas = new ArrayList<>();
	
	contas.add(conta1);// adicionando conta
	contas.add(conta2);
	contas.add(conta3);
	contas.add(conta4);
	
	
	System.out.println("Lista de contas:");
	System.out.println(contas);
	
	contas.remove(1); // removendo conta1
	
	
	System.out.println();
	System.out.println("Lista de pessoas:");
	
	System.out.println(pessoas);
	System.out.println();
	
	System.out.println("Conta1 removida:");
	System.out.println(contas);

}
}