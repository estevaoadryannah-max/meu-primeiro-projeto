package adryannah_Aula5;

public class Triangulo {
	private float base;
	private float altura;
	
	public Triangulo(float base, float altura) {
		this.base=base;
		this.altura=altura;
	}
	float getBase() {
		return base;
	}
	float getAltura() {
		return altura;
	}
	void setBase(float base) {
		this.base=base;
	}
	void setAltura(float altura) {
		this.altura=altura;
	}
	
	double calcular() {
		double area = ((this.base*this.altura)/2.0);
		return area;
	}
	public String toString() {
		return "\nBase :" +base+ " "+ "\nAltura :" +altura+ " "+"\nArea:" +calcular();
	}
}

