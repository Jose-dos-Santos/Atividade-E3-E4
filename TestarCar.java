package exercicios_1;

public class TestarCar {
	public static void main(String[] args) {
     
		Carro carro1 = new Carro(" Gol ", "csa1234");
		carro1.setPreco(40000.00);
		
		Carro carro2 = new Carro("Uno", "csa4321");
		carro2.setPreco(30000.00);
		
        Carro carro3 = new Carro("Gol ", "csa7894");
		carro3.setPreco(30000.00);

		Carro carro4 = new Carro("Uno", "csa6789");
		carro4.setPreco(40000.0);

		Concessionaria loja1 = new Concessionaria();

		loja1.addCarro(carro1);
		loja1.addCarro(carro2);
		loja1.addCarro(carro3);

		loja1.listarCarros();
		loja1.tabelaPreco();
		
		System.out.println();
		System.out.println("Pesquisa do carro com placa csa7894 na Loja1:");
		loja1.listarDadosCarros("csa7894");
		System.out.println();
		System.out.println("Pesquisa do carro com placa csa6789 na Loja1:");
		loja1.listarDadosCarros("csa6789");
	}
}
