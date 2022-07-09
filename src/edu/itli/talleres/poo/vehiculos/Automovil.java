package edu.itli.talleres.poo.vehiculos;

public class Automovil extends Vehiculo {
	
	private int numPuertas;
	
	public Automovil(String marca, String placa, String tipo, int numPuertas) {
		super(marca, placa, tipo);
		// TODO Auto-generated constructor stub
		
		this.numPuertas=numPuertas;
		
		
	}
	

	/**
	 * 
	 */
	public Automovil() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param marca
	 * @param placa
	 * @param tipo
	 */
	public Automovil(String marca, String placa, String tipo) {
		super(marca, placa, tipo);
		// TODO Auto-generated constructor stub
	}

	
	

	@Override
	public void imprimirDatos() {
		System.out.println("****AUTOMOVIL******");
		super.imprimirDatos();
		System.out.println("numPuertas:"+numPuertas);
		System.out.println("---------------");
	}


	/**
	 * @return the numPuertas
	 */
	public int getNumPuertas() {
		return numPuertas;
	}

	/**
	 * @param numPuertas the numPuertas to set
	 */
	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
		//TODO X COSA
	}

	

}
