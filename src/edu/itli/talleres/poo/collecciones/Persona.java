package edu.itli.talleres.poo.collecciones;

public class Persona implements Comparable<Persona>{
	private String nombre;
	
	public Persona(String nombre) {
		this.nombre=nombre;
	}
	


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}



	@Override
	public int compareTo(Persona o) {
		int last = this.nombre.compareTo(o.nombre);
	    //Sorting by first name if last name is same d
	    return last == 0 ? this.nombre.compareTo(o.nombre) : last;
	}
	
	@Override
	public int hashCode() {
	
		return (int) 7 * this.nombre.toUpperCase().hashCode();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nombre.toUpperCase();
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Persona o=(Persona) obj;
		return this.nombre.toUpperCase().equals(o.getNombre().toUpperCase()); 
	}


}
