package edu.itli.talleres.poo.utilidades;

import java.math.BigDecimal;
import java.math.BigInteger;
import edu.itli.talleres.poo.utilidades.EjemploClaseUtil;

public class UtilTest {
	

	public UtilTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception {
		
		//ejemplo de métodos de utilidades
		//ejemplo1();
		//tipos de datos
		/*int n_int=1;
		Integer n_Integer=Integer.valueOf("12121");
		BigInteger n_BigInteger=BigInteger.valueOf(n_Integer);
		
		System.out.println("n_int="+n_int);
		System.out.println("n_Integer="+n_Integer);
		System.out.println("n_BigInteger="+n_BigInteger);
		
		System.out.println("2/5="+EjemploClaseUtil.dividir(2, 5));
		System.out.println("5/2="+EjemploClaseUtil.dividir(5, 1));*/
		
		
		ejemplo1();
		
		

	}
	private static int CONSTANTE=3;
	private static void ejemplo1() throws Exception {
		
		// TODO Auto-generated method stub
				String nombre="minusculaAAAA uuu";
				
				String valorMayuscula=EjemploClaseUtil.convertirMaysucula(nombre);
				//System.out.println("valorMayuscula="+valorMayuscula);
				
				Integer a=1;
				Integer b=Integer.valueOf("15");
				Integer c=null;
				
				//c=a+b		
				c=EjemploClaseUtil.sumar(a, b);
				System.out.println("c="+c);
				
				//ejercicio 2
				//valor3 = valor1/(valor2-CONSTANTE)
				
				BigDecimal valor1=BigDecimal.valueOf(1212);
				BigDecimal valor2=BigDecimal.ZERO;
				BigDecimal valor3=null;
				
				try {
				valor3=EjemploClaseUtil.ejecutarFormula1(valor1, valor2,CONSTANTE);
				} catch (EjecutarFormulaExcepcion e) {
					System.out.println("Error ejecuntao fourmal: "+e.getMessage());
				}
				
				System.out.println("EjemploClaseUtil.ejecutarFormula1 valor3="+valor3);
				
				double valor_int_1=1212;
				double valor_int_2=10;
				double valor_int_3;
				valor_int_3=EjemploClaseUtil.ejecutarFormula1(valor_int_1, valor_int_2,CONSTANTE);
				System.out.println("EjemploClaseUtil.ejecutarFormula1 valor_int_3="+valor_int_3);
				
			
				
		
	}

}
