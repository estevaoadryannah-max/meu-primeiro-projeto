package adryannah_Aula5;

import java.util.Scanner;

public class Salarios {
	
	public static void main(String[] args) {
		Scanner adry=new Scanner(System.in);
		System.out.println("Insira a quantidade de funcionarios");
		byte qt=adry.nextByte();
		double funcionarios[]=new double[qt];
		double salario;
		byte acimaDe10000=0;
		byte abaixoDe15000=0;
		for(int i=0; i<qt; i++) {
				System.out.println("Salario do Funcionario" +(1+i));
				salario=adry.nextDouble();
			while (salario<8000 || salario>23000) {
				System.out.println("Entrada invalida, tente novamente");
				salario=adry.nextDouble();
			}
			funcionarios[i]=salario;
		}
		for(int i =0; i<qt; i++) {
			if(funcionarios[i]<15000) {
				abaixoDe15000++;
				
			}
			if(funcionarios[i]>10000) {
				acimaDe10000++;
			}
		}
		System.out.println("A quantidade de salarios acima de 10000: "+acimaDe10000);
		System.out.println("Quantidade de salarios abaixo de 15000 " +abaixoDe15000);
	}
}
