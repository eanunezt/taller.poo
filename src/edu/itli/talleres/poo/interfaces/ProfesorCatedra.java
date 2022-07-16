/**
 * 
 */
package edu.itli.talleres.poo.interfaces;

/**
 * @author enunezt
 *
 */
public class ProfesorCatedra implements IProfesor, IPersona {
	
	private String nombre;

	/**
	 * 
	 */
	public ProfesorCatedra() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String obtenerCodigo() {
		// TODO Auto-generated method stub
		return "ProfesorCatedra";
	}

	@Override
	public void asignarNombre(String nombre) {
		// TODO Auto-generated method stub
		this.nombre=nombre;
	}

	@Override
	public String obtenerNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

}
