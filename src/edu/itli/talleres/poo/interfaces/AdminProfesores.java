package edu.itli.talleres.poo.interfaces;

public class AdminProfesores {

	public AdminProfesores() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IProfesor profesor1=new ProfesorCatedra();
		
		IProfesor profesor2=new ProfesorTemporal();
		
		IPersona persona1=new ProfesorTemporal();
		persona1.asignarNombre("Juan");
		
		
		
		System.out.println("profesor1:"+profesor1.obtenerCodigo());
		System.out.println("profesor2:"+profesor2.obtenerCodigo());		
		System.out.println("persona1:"+persona1.obtenerNombre());
		
		ProfesorAbs profesorAbs=new ProfesorTemporal();
		
		profesorAbs.asignarNombre("Juan2");
		System.out.println("profesorAbs obtenerCodigo:"+profesorAbs.obtenerCodigo());		
		System.out.println("profesorAbs obtenerNombre:"+profesorAbs.obtenerNombre());
		System.out.println("profesorAbs anioEntrada:"+profesorAbs.anioEntrada());
		
		
		
		

	}

}
