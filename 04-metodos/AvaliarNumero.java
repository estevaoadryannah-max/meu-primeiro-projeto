package adryannah_001;

import java.util.Scanner;

public class AvaliarNumero {
	static Scanner adry= new Scanner(System.in);
	public static void receber() {
		System.out.println("Insira um número");
		int numero=adry.nextInt();
		mostrar(numero);
	}
	public static void mostrar(int numero) {
		if(numero>=50) {
			System.out.println("O número insirido é maior que 50.");
		}
		if(numero<=50) {
			System.out.println("O número insirido é menor que 50.");
		}

	}
	public static void main(String args[]) {
		receber();
	}
}
