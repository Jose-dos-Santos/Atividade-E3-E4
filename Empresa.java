package exercicio_4;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Empresa {

	public static void main(String[] args) throws ParseException {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
		LocalDate data = LocalDate.parse("25/11/2015", formato); 
		System.out.println(data);
		
        
		SetoresEmpresa setor1 = new SetoresEmpresa();
		SetoresEmpresa setor2 = new SetoresEmpresa();
		SetoresEmpresa setor3 = new SetoresEmpresa();
		SetoresEmpresa setor4 = new SetoresEmpresa();
		
		setor1.setDepartamento("Manuteção");
		setor2.setDepartamento("Finaceiro");
		setor3.setDepartamento("RH");
		setor4.setDepartamento("TI");
		
		Funcionario funcionario1 = new Funcionario("João", setor1, "Tecnico");
		
		Funcionario funcionario2 = new Funcionario("José", setor1, "Tecnico");
		Funcionario funcionario3 = new Funcionario("Paula", setor2, "Gestora finaceira");
		Funcionario funcionario4 = new Funcionario("Elena", setor3, "Gestora RH");
		Funcionario funcionario5 = new Funcionario("João", setor4, "Tecnico");
		Funcionario funcionario6 = new Funcionario("João", setor4, "Tecnico");
		
		ArrayList<Funcionario> funcionarios = new ArrayList<>();
		
		funcionarios.add(funcionario1);
		funcionarios.add(funcionario2);
		funcionarios.add(funcionario3);
		funcionarios.add(funcionario4);
		funcionarios.add(funcionario5);
		funcionarios.add(funcionario6);
		System.out.println(funcionarios);
		
		
	}
}
