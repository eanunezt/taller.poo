package edu.itli.talleres.poo.scanner;

import java.util.Scanner;

public class TestJava {

	public TestJava() {
		// TODO Auto-generated constructor stub
	}

	
	 public static void main(String[] args)
	    {
	        // Declarar el objeto e inicializar con
	        // el objeto de entrada estándar predefinido
	        Scanner sc = new Scanner(System.in);
	        // entrada de una cadena
	        System.out.println("Nombre: ");
	        String name = sc.nextLine();
	        System.out.println("Nombre2: ");
	        String name2 = sc.nextLine();
	        // entrada de un carácter
	        System.out.println("Género: ");
	        char gender = sc.next().charAt(0);
	        // Entrada de datos numéricos
	        // byte, short y float
	        System.out.println("Edad: ");
	        int age = sc.nextInt();
	        System.out.println("Teléfono: ");
	        long mobileNo = sc.nextLong();
	        System.out.println("Promedio: ");
	        double average = sc.nextDouble();
	        // Imprima los valores para verificar si la entrada
	        // fue obtenida correctamente.
	        System.out.println("Nombre: "+name);
	        System.out.println("Género: "+gender);
	        System.out.println("Edad: "+age);
	        System.out.println("Teléfono: "+mobileNo);
	        System.out.println("Promedio: "+average);
	    }
}
