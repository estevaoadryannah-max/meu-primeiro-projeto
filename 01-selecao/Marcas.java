package adryannah_Aula5;

import java.util.Scanner;

public class Marcas {
	public static void main(String args[]) {
		Scanner adry=new Scanner(System.in);
		System.out.println("Qual marca deseka comprar? ");
		String marca = adry.nextLine();
		System.out.println("Quantos telemoveis deseja comprar? ");
		byte quantidade = adry.nextByte();
		String Samsung;
		String Nokia;
		double valorAPagar;
		if(marca.equalsIgnoreCase("Nokia") && quantidade>6) {
			valorAPagar=(quantidade*2800)-3000;
			System.out.println(valorAPagar);
		}else if(marca.equalsIgnoreCase("Nokia")){
			valorAPagar=2800*quantidade;
			System.out.println(valorAPagar);
		}else{
			valorAPagar=4500*quantidade;
			System.out.println(valorAPagar);
		}
	}

}
