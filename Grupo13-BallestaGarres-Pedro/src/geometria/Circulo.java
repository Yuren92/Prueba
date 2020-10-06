package geometria;

/**
 * @author Pedro Ballesta
 * @version 1.0
 */
public class Circulo {
	
	static final Punto ORIGEN_COORDENADAS = new Punto(0,0);
	static final int  RADIO_POR_DEFECTO = 5;
	
	private final Punto centro;
	private double radio;
		
	
	/**
	 * Constructor de la clase dado un punto y un radio
	 * @param p Punto situado en el centro del circulo
	 * @param radio distancia que une el centro a cualquier punto del circulo
	 */
	public Circulo(Punto p, double radio) {
		this.centro = new Punto(p);
		this.radio = radio;
	}
	
	/**
	 * Constructor vacio
	 */
	public Circulo() {
		this(ORIGEN_COORDENADAS,RADIO_POR_DEFECTO);
	}
	
	/**
	 * Constructor copia
	 * @param c circulo que copiar
	 */
	public Circulo(Circulo c) {
		this(new Punto(c.centro),c.radio);
		
	}

	
	/**
	 * Metodo de consulta del punto
	 * @return el punto centro
	 */
	public Punto getCentro() {
		return centro;
	}
	
	/**
	 * Metodo de constulta del radio
	 * @return El entero radio
	 */
	public double getRadio() {
		return radio;
	}
	/**
	 * Metodo de consulta del perimetro
	 * @return devuelve un double con el resultado 2πR
	 */
	public double getPerimetro() {
		return 2 * Math.PI * this.radio;
	}
	
	/**
	 * Desplaza el circulo cambiando el punto de posicion
	 * @param x Desplazamiento en eje X
	 * @param y Desplazamiento en eje Y
	 */
	public void desplazar(int x, int y) {
		this.centro.desplazar(x, y);
	}
	
	/**
	 * Escala el circulo en el porcentaje dado
	 * @param porcentaje
	 */
	public void escalar(int porcentaje) {
		this.radio = this.radio * porcentaje /100;
	}
	
}
