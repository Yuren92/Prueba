package geometria;

/**
 * @author Pedro Ballesta
 * @version 1.0
 */
public class Punto {
	private int y;
	private int x;
	
	/**
	 * Constructor vacío, se le dará el valor (0,0)
	 */
	public Punto() {
		this.x = 0;
		this.y = 0;
	}
	
	/**
	 * Constructor de clase dados 2 enteros
	 * @param x parametro del eje x
	 * @param y parametro del eje y
	 */
	public Punto(int x, int y) {
		this.desplazar(x, y);
	}
	
	
	/**
	 * Constructor copìa
	 * @param p Punto que se quiera copiar
	 */
	public Punto(Punto p) {
		this.desplazar(p.x, p.y);
	}
	
	/**
	 * Simula el desplazamiento de un punto sumando el parametro a y b a los valores del punto
	 * @param a parametro del eje x
	 * @param b parametro del eje y
	 */
	public void desplazar(int a, int b) {
		this.x = getX() + a;
		this.y = getY() + b;
	}
	
	/**
	 * Metodo sobrecargado de desplazar, desplaza 1 unidad según la dirección
	 * @param d dirección
	 */
	@SuppressWarnings("unused")
	private void desplazar(Direccion d) {
		switch (d) {
		case ARRIBA: 
				this.desplazar(0,1);
			break;
		case ABAJO: 
			this.desplazar(0,-1);
		break;
		case DERECHA: 
			this.desplazar(1,0);
		break;
		case IZQUIERDA: 
			this.desplazar(-1,0);
		break;
		
		}
	}
	
	/**
	 * Calcula la distancia entre 2 puntos
	 * @param p1	punto 1
	 * @param p2 	punto 2
	 * @return		distancia entre 2 puntos siendo un DOUBLE
	 */
	public double distancia(Punto p1, Punto p2) {
		return Math.sqrt(Math.pow(p1.getX()-p2.getX(), 2) + Math.pow(p1.getY()-p2.getY(),2));
	}
	/**
	 * Metodo static que devuelve el punto más alejado del origen
	 * @param puntos array de puntos 
	 * @return Punto mas alejado
	 */
	 public static Punto mayorDistancia(Punto... puntos ) {
		if (puntos.length == 0) return null;
		 Punto origen = new Punto(0,0);
		 Punto resultado = origen;
		 for (Punto punto : puntos) {
			if (punto.distancia(punto, origen)> (punto.distancia(punto, resultado)))
				resultado = punto;	
		}
		return resultado;
	}
	
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return "Punto [y=" + y + ", x=" + x + "]";
	}
	
}
