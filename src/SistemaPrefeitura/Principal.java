package Atividade8Poo;

import java.util.ArrayList;
import java.util.Scanner;

import DesafioProduto.Aluno;

public class Principal {

	static ArrayList<Integer>filhos = new ArrayList<>();
	static ArrayList<Integer>habitantes = new ArrayList<>();
	static ArrayList<Double>salario = new ArrayList<>();
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		Habitantes hab = new Habitantes();


		int op;
		do {
			op = lerMenu();
			switch(op) {

			case 1 : cadastrarHabitantes(hab);break;

			case 2 : mediaSalario(hab);
			break;

			case 3 : mediaFilhos(hab);
			break;

			case 4 :maiorSalario(hab);
			break;

			case 5 : menos1250(hab);
			break;
			
			case 6 : System.out.println("Salarios ="+salario +"\n filhos ="+filhos);
			break;
			
			case 9: System.out.println(" Sair do Sistema !!");

			}

		}while(op != 7);

	}
	
	public static void mediaSalario(Habitantes hab) {
		double mediaSalario = 0;
		for (Double sal : salario) {
			
			mediaSalario += sal;
		}
		
		System.out.println(" media Salarial e ="+mediaSalario/hab.getHabitantes());
	}
	
	public static void mediaFilhos(Habitantes hab) {
		int mediaFil = 0;
		
		for (Integer fil : filhos) {
			
			mediaFil += fil;
		
		}
		
		System.out.println("a media dos filhos e ="+mediaFil/hab.getHabitantes());
		
	}
	
	public static void maiorSalario(Habitantes hab) {
		double maiorSal = 0;
		
		for (Double maiorS : salario) {
			if(maiorS > maiorSal) {
			
			maiorSal = maiorS;
			}
		}
		
		System.out.println(" maior salario e = "+maiorSal);
		
	}
	public static void menos1250(Habitantes hab) {
		double menosSal =0;
		
		for (Double menos : salario) {
			if(menos < 1250) {
				menosSal ++;
			}
			
			System.out.println("quantidade de pessoas que recebem menos que 1250 e ="+menosSal);
		}

	}
	private static int lerMenu() {
		Scanner in = new Scanner(System.in);
		int op;

		System.out.println(" MENU "
				+ "\n 1 - cadastrar Habitantes"
				+ "\n 2 - Media Salarial"
				+ "\n 3 - Media dos Filhos"
				+ "\n 4 - Maior Salario "
				+ "\n 5 - Pessoas que recebem abaixo de 1250 Reais"
				+ "\n 6 - mostrarDados"
				+ "\n 9 - Sair do Sistema");
		op = Integer.parseInt(in.nextLine());

		return op;
	}

	private static void cadastrarHabitantes(Habitantes hab) {

		System.out.println("digite a quantidade de Habitantes ");
		hab.setHabitantes(Integer.parseInt(in.nextLine()));
		habitantes.add(hab.getHabitantes());

		for (int x = 0; x <hab.getHabitantes(); x++) {
			
			System.out.println( x+1 +" digite Salario ");
			hab.setSalario(Double.parseDouble(in.nextLine()));
			salario.add(hab.getSalario());
		}
		for (int i = 0; i <hab.getHabitantes(); i++) {
			
			System.out.println( i +1 +" digite numero de Filhos ");
			hab.setFilhos(Integer.parseInt(in.nextLine()));
			filhos.add(hab.getFilhos());

		}	
	}


}

