/**
 * 
 */
package edu.itli.talleres.poo.interfaces;

/**
 * @author enunezt
 *
 */
public class ProfesorTemporal extends ProfesorAbs {
	
	private int anio=2015;

	/**
	 * 
	 */
	public ProfesorTemporal() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String obtenerCodigo() {
		// TODO Auto-generated method stub
		return "ProfesorTemporal";
	}

	@Override
	public int anioEntrada() {
		// TODO Auto-generated method stub
		return anio;
	}

}
