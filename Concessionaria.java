package exercicios_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Concessionaria {
	public ArrayList<Carro> carros;

	Map<String, Double> tabela_placaCar_preco;

	public Concessionaria() {
		carros = new ArrayList<Carro>();
		tabela_placaCar_preco = new HashMap<String, Double>();
	}

	public void addCarro(Carro novoCarro) {

		carros.add(novoCarro);

		tabela_placaCar_preco.put(novoCarro.getPlaca(), novoCarro.getPreco());

	}

	public void listarCarros() {

		for (int indice = 0; indice < carros.size(); indice++) {

			Carro carroAtual = carros.get(indice);

			System.out.println("O modelo do carro � : " + carroAtual.getModelo());
		}

	}

	public void tabelaPreco() {

		for (String key : tabela_placaCar_preco.keySet()) {
			System.out.println("Placa e valor do carro: " +  key + " � R$: " + tabela_placaCar_preco.get(key));

		}

	}

	public void listarDadosCarros(String placa) {

		for (int indice = 0; indice < carros.size(); indice++) {
			

			Carro carroAtual = carros.get(indice);

			if (carroAtual.getPlaca() == placa) {

				System.out.println("Modelo do Carro : " + carroAtual.getModelo()  + "|"+" Placa : "
						+ carroAtual.getPlaca() + " Pre�o R$: " + carroAtual.getPreco());
				return;
			}
			
			
		}
		System.out.println("Placa n�o encontrada!");

	}

}