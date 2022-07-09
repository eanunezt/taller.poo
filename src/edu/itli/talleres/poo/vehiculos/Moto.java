/**
 * 
 */
package edu.itli.talleres.poo.vehiculos;

/**
 * @author enunezt
 *
 */
public class Moto extends Vehiculo {
	private int cilindraje;
	
	public Moto(String marca, String placa, String tipo) {
		super(marca, placa, tipo);
		// TODO Auto-generated constructor stub
		
	}
	
	public Moto(String marca) {
		super(marca, null, null);
		// TODO Auto-generated constructor stub
		
	}
	
	
	
	
	/**
	 * @param marca
	 * @param placa
	 * @param tipo
	 * @param cilindraje
	 */
	public Moto(String marca, String placa, String tipo, int cilindraje) {
		super(marca, placa, tipo);
		this.cilindraje = cilindraje;
	}



	/**
	 * 
	 */
	public Moto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public void imprimirDatos() {
		System.out.println("****MOTO******");
		super.imprimirDatos();
		System.out.println("cilindraje:"+cilindraje);
		System.out.println("---------------");
		
		
	}
	
	public String imprimirDatos2() {
		System.out.println("****imprimirDatos2******");
		return "OK";
		
		
	}
	
	



	/**
	 * @return the cilindraje
	 */
	public int getCilindraje() {
		return cilindraje;
	}

	/**
	 * @param cilindraje the cilindraje to set
	 */
	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}

	
	public void test() {
		
		
	}
	

}
