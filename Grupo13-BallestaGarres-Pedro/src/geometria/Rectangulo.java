package geometria;
/**
 * Clase Rectángulo
 * @author pedro Ballesta
 *@version 1.0
 */
public class Rectangulo {	
	// ===========================================================
	// Fields
	// ===========================================================
	private final Punto verticeII;
	private int ladoX;
	private int ladoY;
	// ===========================================================
	// Constructors
	// ===========================================================
	/**
	 * Constructor principal a partir de un punto y 2 enteros
	 * @param II punto inferior izquierda
	 * @param x largo del rectángulo
	 * @param y alto del rectángulo
	 */
	public Rectangulo(Punto II, int x, int y) {
		this.verticeII = new Punto(II);
		this.ladoX = x;
		this.ladoX = y;
	}
	/**
	 * Constructor a partir de 2 puntos
	 * @param II punto inferior izquierda
	 * @param AD punto superior derecha
	 */
	public Rectangulo(Punto II, Punto AD) {
		this(new Punto(II),AD.getX() - II.getX(),AD.getY() - II.getY());
//		this.verticeII = new Punto(II);
//		this.ladoX =AD.getX() - II.getX();
//		this.ladoY =AD.getY() - II.getY();
	}
	/**
	 * Contructor copia
	 * @param r Rectángulo del que se quiere hacer la copia
	 */
	public Rectangulo(Rectangulo r) {
		this(new Punto(r.verticeII), r.ladoX, r.ladoY);
	}

	
	// ===========================================================
	// Getter & Setter
	// ===========================================================
	
	/**
	 * Método get del vertice inferior izquierda
	 * @return Copia del punto II
	 */
	public Punto getVerticeII() {
		return new Punto(verticeII);
	}
	
	/**
	 * Método get del vertice inferior derecha
	 * @return copia del punto ID
	 */
	public Punto getVerticeID() {
		return new Punto(this.verticeII.getX() + this.ladoX, this.verticeII.getY());
	}
	
	/**
	 * Método get del vertice superior izquierda
	 * @return Copia del punto SI
	 */
	public Punto getVerticeSI() {
		return new Punto(this.verticeII.getX(), this.ladoY + this.verticeII.getY());
	}
	
	/**
	 * Método get del vertice superior derecha
	 * @return Copia del punto SD
	 */
	public Punto getVerticeSD() {
		return new Punto(this.verticeII.getX() + this.ladoX, this.ladoY + this.verticeII.getY());
	}
	
	/**
	 * Método get del ancho
	 * @return int LadoX
	 */
	public int getLadoX() {
		return ladoX;
	}
	
	/**
	 * Método get del alto
	 * @return
	 */
	public int getLadoY() {
		return ladoY;
	}
	
	public int getPerimetro() {
		return (2 * this.ladoX) + (2 * this.ladoY);
	}
	
	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================
	@Override
	public String toString() {
		return "Rectangulo [verticeII=" + verticeII.toString() + ", ladoX=" + ladoX + ", ladoY=" + ladoY  + "]";
	}
	
	
	// ===========================================================
	// Methods
	// ===========================================================
	/**
	 * Desplaza el Punto II por lo tanto la loc de todo el cuadrado en los 2 ejes
	 * @param x desplazamiento del eje X
	 * @param y desplazamiento del eje Y
	 */
	public void desplazar(int x, int y) {
		this.verticeII.desplazar(x, y);
	}
	
	/**
	 * Escala el rectangulo una proporcion
	 * @param porcentaje porcentaje a escalar
	 */
	public void escalar(int porcentaje) {
		this.ladoX = this.ladoX * porcentaje /100;
		this.ladoY = this.ladoY * porcentaje /100;
	}
	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================

}
