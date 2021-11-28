package exercicios_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Concessionaria  {
	
	public static void main(String[] args) {
		
		Carro carro1 = new Carro("SUV-TUCSON",  1);
		Carro carro2 = new Carro("SEDAN-FORD_KA",  2);
		Carro carro3 = new Carro("PICAPE-SAVEIRO",  3);
		Carro carro4 = new Carro("HATCH-CORSA", 4);
		Carro carro5 = new Carro("ESPORTIVO-PORSCHE",  5);
		carro1.setPlaca("abc1234");
		carro2.setPlaca("cba4321");
		carro3.setPlaca("cba4321");
		carro4.setPlaca("cba4321");
		carro5.setPlaca("cba4321");
		carro1.setPreco(120000.00);
		carro2.setPreco(50000.00);
		carro3.setPreco(55000.00);
		carro4.setPreco(45000.00);
		carro5.setPreco(300000.00);
		ArrayList <Carro> car = new ArrayList<>();// criando uma lista de carros
		
		car.add(carro1); //adicionando o primeiro carro na lista
		car.add(carro2);
		car.add(carro3);
		car.add(carro4);
		car.add(carro5);
		
		Map<Double, Carro> map = new HashMap<>();// criando um map para consultar preço do carro
		Map<Double, Carro> map2= new HashMap<>();
		map.put(carro5.getPreco(),carro5);// consultando preço carro5
		map2.put(carro4.getPreco(),carro4);
		
		System.out.println(car);// imprimindo minha lista de carros
		
		
		System.out.println(map);
		System.out.println(map2);

		
		
		
	}

}
