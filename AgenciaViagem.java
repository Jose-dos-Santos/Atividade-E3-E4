package exercicio_3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class AgenciaViagem {
    public static void main(String[] args) {
		
	
	
	 Pessoa pessoa1 = new Pessoa("Raquel", "123456789");
	 Pessoa pessoa2 = new Pessoa("Eliana", "987654321");
	 Pessoa pessoa3 = new Pessoa("Joana", "111333444");
	 Pessoa pessoa4 = new Pessoa("Tião", "777888999");
	 Pessoa pessoa5 = new Pessoa("Osvaldo", "555222888");

	 Lugar lugar1 = new Lugar("Maceió", pessoa1);
	 Lugar lugar2 = new Lugar("Bonito", pessoa2);
	 Lugar lugar3 = new Lugar("Porto Seguro", pessoa3);
	 Lugar lugar4 = new Lugar("Salvador", pessoa4);
	 Lugar lugar5 = new Lugar("Florianopolis", pessoa5);
	 
	 
	 ArrayList <Lugar> viagens = new ArrayList<>();
	 
	 viagens.add(lugar1);
	 viagens.add(lugar2);
	 viagens.add(lugar3);
	 viagens.add(lugar5);
	 
	 System.out.println(viagens);
    	 
	 Set<Pessoa> informacoes = new HashSet<>();
	 
	 informacoes.add(pessoa1);
	 informacoes.add(pessoa2);
	 informacoes.add(pessoa3);
	 informacoes.add(pessoa4);
	 informacoes.add(pessoa5);
	 

 System.out.println(informacoes);


    }	
	 
}
