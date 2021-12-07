package exercicio_3;

import java.util.ArrayList;

public class TestaAgencia {
	

		public static void main(String[] args) {
			
			AgenciaViagem viagens = new AgenciaViagem();
			
			ArrayList<Lugar> destinos; 
			
			Pessoa pessoa1 = new Pessoa("Jos�", "123.456.78-9");
			Lugar lugar1 = new Lugar("Cataratas do Igua�u", pessoa1 );
			
			
			Pessoa pessoa2 = new Pessoa("Jos� Pedro", "987.654.32-1");
			Lugar lugar2 = new Lugar("Parque Nacional dos Len��is Maranhenses", pessoa2);
			
			Pessoa pessoa3 = new Pessoa("Jos� Antonio", "147.258.36-9");
			Lugar lugar3 = new Lugar("Amaz�nia", pessoa3 );
			
			
			viagens.adicionarViagem(lugar1);
			viagens.adicionarViagem(lugar2);
			viagens.adicionarViagem(lugar3);
			
			viagens.listarDadosPessoa("987.654.32-1");
			viagens.listarDadosPessoa("123.456.78-9");
			viagens.listarDadosPessoa("147.258.36-9");
			
			viagens.listarDadosDestino();
			
		}

	}


