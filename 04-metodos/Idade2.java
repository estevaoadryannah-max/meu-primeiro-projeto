package Metodo;

import java.util.Scanner;

public class Idade2 {
	public static int receberAno() {
		Scanner k = new Scanner(System.in);
		System.out.println("Insira a tua data de nascimento");
		int age= k.nextInt();
		return age;
	}
	public static int calcularIdade(int age) {
		int idade= 2026-age;
		return idade;
	}
	public static void main(String args[]) {
		
		int ano=receberAno();
		System.out.println(ano);
		System.out.println(calcularIdade(ano));
	}

}
