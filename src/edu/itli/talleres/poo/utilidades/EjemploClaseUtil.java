package edu.itli.talleres.poo.utilidades;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Ejemplo de clase de utilidades
 * @author enunezt
 *
 */
public class EjemploClaseUtil {

	public EjemploClaseUtil() {
		// TODO Auto-generated constructor stub
	}
	
	public static String convertirMaysucula(String texto) {
	
		/*if(texto==null) {
			return "";
		}*/
		
		
		return texto!=null?texto.toUpperCase():"";
	}


	public static Integer sumar(Integer num1, Integer num2) throws OperacionMatematicaEcxepcion {
		
		if(num1==null || num2==null) {
			throw new OperacionMatematicaEcxepcion("Valor num1 y num2 no puede ser nulo.");			
		}
		
		return num1+num2;		
	}
	
public static BigDecimal dividir(BigDecimal num1, BigDecimal num2) throws OperacionMatematicaEcxepcion {
		
		if(num1==null || num2==null) {
			throw new OperacionMatematicaEcxepcion("Valor num1 y num2 no puede ser nulo.");			
		}else 
		if(BigDecimal.ZERO.equals(num2)) { 
			throw new OperacionMatematicaEcxepcion("Valor num2 no puede ser Cero (0).");			
		}
		
		return num1.divide(num2);		
	}

public static BigDecimal ejecutarFormula1(BigDecimal num1, BigDecimal num2, int CONSTANTE) throws EjecutarFormulaExcepcion {
	//valor3 = valor1/(valor2-CONSTANTE)
	
	/*if(num2!=null && num2.equals(BigDecimal.ZERO)) { //forma 1
		throw new EjecutarFormulaExcepcion("Valor 2 no  puede ser cero");
		}*/
	
	if(BigDecimal.ZERO.equals(num2)) { //forma 1 mejorada
		throw new EjecutarFormulaExcepcion("Valor 2 no  puede ser cero");
		}
	
	/*if("ACTIVO".equals(String.valueOf(CONSTANTE))) { //forma 2 ejemplo
		//hacer algo
		}*/
	
	
	if(num1==null || num2==null) {
	throw new EjecutarFormulaExcepcion("Valor 1 y valor 2 no pueden se nulos");
	}
	
	BigDecimal resta=new BigDecimal(num2.subtract(BigDecimal.valueOf(CONSTANTE)).doubleValue());
	System.out.println(resta);
	
	
	return num1.divide(resta,4, RoundingMode.HALF_UP); 		
}


public static int sumar(int num1, int num2) throws OperacionMatematicaEcxepcion {

	return num1+num2;		
}

public static int dividir(int num1, int num2) throws OperacionMatematicaEcxepcion {
	

	if(num2==0) { 
		throw new OperacionMatematicaEcxepcion("Valor num2 no puede ser Cero (0).");			
	}
	
	return num1/num2;		
}
	


public static double ejecutarFormula1(double num1, double num2, int CONSTANTE)  {
	double retorno=num1/(num2-CONSTANTE);	
	return Math.round(retorno*10000.0)/10000.0; 		
}
}
