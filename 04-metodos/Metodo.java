package Metodo;

import java.util.Scanner;

public class Metodo {
	public static String Nome(){
		Scanner ler= new Scanner (System.in);
		System.out.println("Introduza o nome");
		String nome=ler.nextLine();
		return nome;
	}
	public static void seuNome(){
		System.out.println("seu nome");
		
	}


}
