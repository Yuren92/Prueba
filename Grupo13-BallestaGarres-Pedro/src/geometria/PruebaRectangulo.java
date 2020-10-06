package geometria;

public class PruebaRectangulo {

	
	public static void main(String[] args) {
	
		Rectangulo c1 =new Rectangulo(new Punto(3,1), 2, 5);
		System.out.println(c1.toString());
		System.out.println("Desplazamos el rectangulo");
		c1.desplazar(0, -7);
		System.out.println(c1.toString());
		System.out.println("Escalamos el rectangulo ");
		c1.escalar(50);
		System.out.println(c1.toString());
		
}
}
