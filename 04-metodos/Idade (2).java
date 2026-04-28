package adryannah_001;

import java.util.Scanner;

public class Idade {
	static Scanner adry = new Scanner(System.in);
	public static int receber() {
		int idade;
		do {
			System.out.println("Introduza a idade: ");
			idade = adry.nextInt();
			if(idade<0)
				System.out.println("Idade inválida, tente novamente");
		}while(idade<0);
		return idade;
	}
	public static int Analisar( int idade, int ano) {
		if(idade<18) {
			System.out.println("Criança ");
			System.out.println("Dos 0 aos 18 anos! ");
			ano = 2026-idade;
			System.out.println("Ano de Nascimento: "+ano);
		}else if(idade >=18 && idade <35){
			System.out.println("Jovem ");
			System.out.println("Dos 18 aos 35 anos");
			ano = 2026-idade;
			System.out.println("Ano de Nascimento: "+ano);
		}else if(idade>35 && idade<60){
			System.out.println("Adulto ");
			System.out.println("Dos 35 aos 60 anos");
			ano = 2026-idade;
			System.out.println("Ano de Nascimento: "+ano);
		}else{
			System.out.println("Idoso");
			System.out.println("A partir dos 60 ");
			ano = 2026-idade;
			System.out.println("Ano de Nascimento: "+ano);
		}
		return idade;
	}
	public static void main(String args[]) {
		int idade=receber();
		Analisar(idade, idade);
	}

}
