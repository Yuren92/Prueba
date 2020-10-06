package subastas;

public class Puja {
	// ===========================================================
	// Fields
	// ===========================================================
	private final Usuario pujador;
	private final int cantidad;
	private final Subasta subasta;	
	
	// ===========================================================
	// Constructors
	// ===========================================================
	public Puja(Usuario pujador, int cantidad, Subasta subasta) {
		this.pujador = pujador;
		this.cantidad = cantidad;
		this.subasta = subasta;
	}

	// ===========================================================
	// Getter & Setter
	// ===========================================================
	/**
	 * @return the pujador copia
	 */
	public Usuario getPujador() {
		return pujador;
	}

	/**
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}

	/**
	 * @return the subasta
	 */
	public Subasta getSubasta() {
		return subasta;
	}
	
	

	
	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	// ===========================================================
	// Methods
	// ===========================================================

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}
