package Metodo;

import java.util.Scanner;

public class IDADE {
	public static void receber() {
		Scanner adry= new Scanner(System.in);
		System.out.println("Seu ano de nascimento");
		int ano=adry.nextInt();
		exibir(ano);
	}
	public static void exibir(int x) {
		int anoActual=2026;
		int idade= anoActual-x;
		System.out.print(idade);
	}

	public static void main(String[] args) {
		receber();
		
		
	}

}
