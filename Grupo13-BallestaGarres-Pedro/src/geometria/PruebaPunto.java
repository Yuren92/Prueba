package geometria;

public class PruebaPunto {

	public static void main(String[] args) {
		Punto punto1 = new Punto(1, 3);
		Punto punto2 = new Punto();
		Punto punto3 = new Punto(punto1);
		Punto punto4 = punto2;
		System.out.println(punto2.toString());
		System.out.println(punto4.toString());
		punto2.desplazar(1, 1);
		System.out.println(punto2.toString());
		System.out.println(punto4.toString());
		punto3.desplazar(0, 0);

	}

}
