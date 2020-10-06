package subastas;

import java.util.LinkedList;

public class Subasta {
	// ===========================================================
	// Fields
	// ===========================================================
	private final String nombre;
	private final Usuario propietario;
	private boolean abierta;
	private LinkedList<Puja> pujas;
	private Puja pujaMayor;
	// ===========================================================
	// Constructors
	// ===========================================================
	/**
	 * @param nombre del articulo a subastar
	 * @param propietario de la subasta
	 */
	public Subasta(String nombre, Usuario propietario) {
		this.nombre = nombre;
		this.propietario = propietario;
		this.abierta = true;
		this.pujas = new LinkedList<Puja>();
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
	 * @return the propietario
	 */
	public Usuario getPropietario() {
		return new Usuario(propietario.getNombre(), propietario.getCredito());
	}
	
	/**
	 * @return the abierta
	 */
	public boolean isAbierta() {
		return abierta;
	}
	
	/**
	 * @return the pujas
	 */
	@SuppressWarnings("unchecked")
	public LinkedList<Puja> getPujas() {
		return (LinkedList<Puja>) pujas.clone();
	}
	
	/**
	 * @return the pujaMayor
	 */
	public Puja getPujaMayor() {
		return new Puja(pujaMayor.getPujador(), pujaMayor.getCantidad(), this);
	}
	
	
	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	// ===========================================================
	// Methods
	// ===========================================================
	/**
	 * Crea una puja para una subasta
	 * @param user quien hace la puja
	 * @param cantidad	cantidad por la que puja
	 * @return booleano segun el resultado
	 */
	public boolean pujar(Usuario user, int cantidad) {
		if (this.propietario.equals(user) || user == null) throw new IllegalArgumentException("Error, usuario no correcto");
		else if(!this.abierta) throw new IllegalArgumentException("Error, la puja no admite más pujas");
		else if(user.getCredito() < cantidad) throw new IllegalArgumentException("Error, no tienes esa cantidad de dinero");
		if (!pujas.isEmpty()) {
			if(pujaMayor.getCantidad() > cantidad || cantidad < 0) {
				throw new IllegalArgumentException("Error, cantidad insuficiente");
			}
		}
		Puja p = new Puja(user, cantidad, this);
		pujas.addLast(p);
		pujaMayor = p;
		return true;
	}
	/**
	 * Metodo sobrecargado de pujar
	 * @param user usuario que puja
	 * @return booleano según el resultado
	 */
	public boolean pujar(Usuario user) {
		if (this.pujas.isEmpty()) return this.pujar(user, 1);
		return this.pujar(user, this.pujaMayor.getCantidad()+1);

	}
	/**
	 * Ejecuta la subasta si se puede
	 * @return boolean 
	 */
	public boolean ejecutar() {
		if (!abierta) throw new IllegalArgumentException("Error, la puja ya fue ejecutada");
		if (pujas.isEmpty()) throw new IllegalArgumentException("Error, no hay pujas");
		this.abierta = false;
		pujaMayor.getPujador().decrementar(pujaMayor.getCantidad());
		this.propietario.incrementar(pujaMayor.getCantidad());
		return true;
	}
	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}
