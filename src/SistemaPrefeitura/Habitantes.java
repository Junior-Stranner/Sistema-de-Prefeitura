package Atividade8Poo;

public class Habitantes{
	private int habitantes;
	private double salario;
	private int filhos;



	public String cadastrarHabitante(){
		return " habitante ="+this.habitantes
				+"\n salario ="+this.salario
				+"\n numero de Filhos"	+this.filhos;

	}
	
	
	
	public Habitantes() {
		super();
		// TODO Auto-generated constructor stub
	}



	


	public Habitantes(int habitantes, double salario, int filhos) {
		super();
		this.habitantes = habitantes;
		this.salario = salario;
		this.filhos = filhos;
	}




	public int getHabitantes() {
		return habitantes;
	}


	public void setHabitantes(int habitantes) {
		this.habitantes = habitantes;
	}


	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}



	public int getFilhos() {
		return filhos;
	}



	public void setFilhos(int filhos) {
		this.filhos = filhos;
	}
	
}