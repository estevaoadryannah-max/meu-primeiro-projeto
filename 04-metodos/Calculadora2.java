package adryannah_001;

import java.util.Scanner;

public class Calculadora2 {
	static Scanner adry=new Scanner(System.in);
	public static void somar() {
		System.out.println("Soma: Insira os numeros");
		int a = adry.nextInt();
		int b = adry.nextInt();
		int soma = a+b;
		System.out.println(soma);
	}
	public static void subtrair() {
		System.out.println("Subtração: Insira os numeros");
		int a = adry.nextInt();
		int b = adry.nextInt();
		int subtração = a-b;
		System.out.println(subtração);
	}
	public static void dividir() {
		System.out.println(" Divisão: Insira os numeros");
		double a = adry.nextDouble();
		double b = adry.nextDouble();
		double divisão = a/b;
		System.out.println(divisão);
	}
	public static void multiplicar() {
		System.out.println("Multiplicação: Insira os numeros");
		int a = adry.nextInt();
		int b = adry.nextInt();
		int multipicação = a*b;
		System.out.println(multipicação);
	}
	public static void main(String args[]) {
		somar();
		subtrair();
		dividir();
		multiplicar();
	}
}
