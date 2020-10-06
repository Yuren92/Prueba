package subastas;
/**
 * 
 * @author pedro
 * @version 1.0
 */
public class Usuario {
	// ===========================================================
	// Fields
	// ===========================================================
	private final String nombre;
	private int credito;

	
	// ===========================================================
	// Constructors
	// ===========================================================
	/**
	 * Constructor
	 * @param nombre
	 * @param credito
	 */
	public Usuario(String nombre, int credito) {
		this.nombre = nombre;
		this.credito = credito;
	}
	/**
	 * Constructor con solo nombre, pone a 50 el crédito
	 * @param nombre
	 */
	public Usuario(String nombre) {
		this(nombre, 50);
	}

	
	// ===========================================================
	// Getter & Setter
	// ===========================================================

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the credito
	 */
	public int getCredito() {
		return credito;
	}
	
	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	// ===========================================================
	// Methods
	// ===========================================================
	/**
	 * Incrementa el credito en una cantidad
	 * @param inc cantidad incrementada
	 */
	public void incrementar(int inc) {
		this.credito += inc;
	}
	
	/**
	 * Decrementa el crédito en una cantidad
	 * @param dc cantidad a decrementar
	 */
	public void decrementar(int dc) {
		this.credito -= dc;
	}
	
	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}
