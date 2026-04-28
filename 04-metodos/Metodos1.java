package Metodo;

public class Metodos1 {
	 public static void main(String[] args) {
		 resultado(5);
		 resultado(10);
	}
		
	public static void resultado(int n) {
	int i;
		
		 	System.out.printf("+--Resultado--+\n");
		 	for (i=1; i<=10; i++) {
		 		System.out.printf("| %2d * %d = %2d |\n", i, n, (i*n));
		 	}
		 		System.out.printf("+-------------+\n\n");
	}
}
