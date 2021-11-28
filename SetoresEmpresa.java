package exercicio_4;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



public class SetoresEmpresa {
    
	private String departamento;
	
	private Funcionario funcionario;
	
	
	
	

	 
	
	
	
	
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return   this.departamento;
	}
}
