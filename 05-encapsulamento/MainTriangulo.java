package adryannah_Aula5;

import java.util.Scanner;

public class MainTriangulo {

	public static void main(String[] args) {
		Scanner adry=new Scanner(System.in);
		System.out.println("Insira o tamanho da base");
		byte base=adry.nextByte();
		System.out.println("Insira o tamanho da altura");
		byte altura=adry.nextByte();
		Triangulo triangulo=new Triangulo(base, altura);
		System.out.println(triangulo.toString());
		triangulo.calcular();
	}

}
