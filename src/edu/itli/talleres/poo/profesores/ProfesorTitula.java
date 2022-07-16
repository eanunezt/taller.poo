/**
 * 
 */
package edu.itli.talleres.poo.profesores;

/**
 * @author enunezt
 *
 */
public class ProfesorTitula extends Profesor {
	
	private String area;

	/**
	 * 
	 */
	public ProfesorTitula() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nombre
	 * @param apellidos
	 * @param edad
	 */
	public ProfesorTitula(String nombre, String apellidos, int edad) {
		super(nombre, apellidos, edad);
		// TODO Auto-generated constructor stub
	}
	
	
	

	/**
	 * @param area
	 */
	public ProfesorTitula(String nombre, String apellidos, int edad,String area) {
		super(nombre, apellidos, edad);
		this.area = area;
	}

	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(String area) {
		this.area = area;
	}
	
	 public void mostrarDatos() {

	        System.out.println ("Datos ProfesorTitular. Profesor de nombre: " 
	        + getNombre() + " " +  getApellidos() 
	        +" con Id de profesor: " + getIdProfesor() );   
	        } 


}
