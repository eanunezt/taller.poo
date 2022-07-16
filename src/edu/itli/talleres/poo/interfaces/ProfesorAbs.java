/**
 * 
 */
package edu.itli.talleres.poo.interfaces;

/**
 * @author enunezt
 *
 */
public abstract class ProfesorAbs implements IPersona, IProfesor {
	protected String nombre;

	/**
	 * 
	 */
	public ProfesorAbs() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract int anioEntrada();
	


	@Override
	public void asignarNombre(String nombre) {
		// TODO Auto-generated method stub
		this.nombre=nombre;
	}

	@Override
	public String obtenerNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}
	

}
