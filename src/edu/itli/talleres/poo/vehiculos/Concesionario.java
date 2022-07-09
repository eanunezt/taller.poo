/**
 * 
 */
package edu.itli.talleres.poo.vehiculos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author enunezt
 *
 */
public class Concesionario {
	
	private static List<Vehiculo> listaDeVehiculos;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		listaDeVehiculos= new ArrayList<Vehiculo>();
		Moto moto1= new Moto("YAMAHA", "CRK425", "DEPORTIVA", 1000);
		Automovil auto1= new Automovil("FORD", "YOP001", "SEDAN", 2);
		
		listaDeVehiculos.add(auto1);
		listaDeVehiculos.add(moto1);
		
		Moto moto2= new Moto("SUSUKI", "CRK232", "DEPORTIVA", 1000);
		listaDeVehiculos.add(moto2);
		
		Moto moto3= new Moto("SUSUKI2", "CRK2322", "DEPORTIVA2");
		moto3.setCilindraje(5555);
		listaDeVehiculos.add(moto3);
		
		Moto moto4= new Moto();
		moto4.setMarca("yamaha");
		listaDeVehiculos.add(moto4);
		
		Moto moto5= new Moto("SUSUKI2");
		
		listaDeVehiculos.add(moto5);
		

		
		listarVehiculos();
		
		
	}
	
	
	private static boolean listarVehiculos() {
		
		for (Iterator iterator = listaDeVehiculos.iterator(); iterator.hasNext();) {
			Vehiculo vehiculo = (Vehiculo) iterator.next();
		    vehiculo.imprimirDatos();
		    
		    
		    if (vehiculo instanceof Moto) {
				Moto moto = (Moto) vehiculo;
				moto.imprimirDatos2();
				
			}
			
		}		
		return true;		
	}

}
