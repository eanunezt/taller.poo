package edu.itli.talleres.poo.profesores;

import edu.itli.talleres.poo.utilidades.EjemploClaseUtil;

public class Profesor extends Persona {  

    private String idProfesor;
    public static String NOMBRE_INSTITUO="ITLI";

    public Profesor () {     
    	super();

    	idProfesor = "Unknown";
        }

    public Profesor (String nombre, String apellidos, int edad) {

        super(nombre, apellidos, edad);

        idProfesor = "Unknown";   
        }

    public void setIdProfesor (String IdProfesor) { 
    	this.idProfesor = IdProfesor;   
    	}

    public String getIdProfesor () { 
    	return idProfesor;  
    	}

    public void mostrarDatos() {

        System.out.println ("Datos Profesor. Profesor de nombre: " 
        + EjemploClaseUtil.convertirMaysucula(getNombre())+ " " +  getApellidos() 
        +" con Id de profesor: " + getIdProfesor() );   
        } 
    
    /**
     *  Obtiene el estado del profesor
     * @param anio
     * @return ACTIVO O INACTIVO
     */
    public String obtenerEstado(Integer anio) {
    	
    	if(anio<= 2000)
    	 return "INACTIVO";
    	
    	return "ACTIVO";
    	
    }
    
    /**
     * Obtiene el estado del profesor
     * @param tipoProfesor
     * @return ACTIVO O INACTIVO
     */
   public String obtenerEstado(String tipoProfesor) {
    	
    	if(!"INTERINO".equals(tipoProfesor))
    	 return "INACTIVO";
    	
    	return "ACTIVO";
    	
    }
    
    
    
    

}