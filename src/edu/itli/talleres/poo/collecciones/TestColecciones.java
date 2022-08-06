/**
 * 
 */
package edu.itli.talleres.poo.collecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author enunezt
 *
 */
public class TestColecciones {
	private static List<String> lista1=new ArrayList<String>();

	/**
	 * 
	 */
	public TestColecciones() {
		// TODO Auto-generated constructor stub
	}
	
	private static void pruebaList() {
		
		lista1.add("UNO");
		lista1.add("DOS");
		lista1.add("TRES");
		
		Iterator<String> it=lista1.iterator();
		
		/**
		 //forma 1
		 while (it.hasNext()) {
			String string = (String) it.next();
			System.out.println(string);
			
		}*/
		
		//forma 2 
		
		/*for (String string : lista1) {
			System.out.println(string); 
		}*/
		
		for (Iterator iterator = lista1.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string); 			
			
		}
		 //ejemplo para verficar si exite un valor en la lista y borrarlo. 
		/*if(lista1.contains("TRES")) {				
			lista1.remove("TRES");
			System.out.println("barrado TRES"); 
		}*/
		
		//Obtener la posición
		
		int posDOS=lista1.indexOf("DOS");
		
		System.out.println("posDOS:"+posDOS);
		System.out.println("posDOS:VALUE="+lista1.get(posDOS)); 
		
		System.out.println("************************************");
		
		lista1.stream().map(v->v+"-ADD-OBJECT").forEach(System.out::println);
		
		lista1.stream()
		.map(v->v+"-ADD-OBJECT")
		.forEach(valor->System.out.println(valor));	
		
		
		/*for (String string : lista1) {
			System.out.println(string); 
		}*/
		
		
		// Creating a list of Integers
        List<Integer> list = Arrays.asList(3, 6, 9, 12, 15);
        System.out.println("************************************");
        list.stream().forEach(System.out::println); 
        
        
        //Lsita de objetos
        System.out.println("************************************");
		List<Persona> listPersonas = Arrays.asList(
				new Persona("Juan"), 
				new Persona("Edgar"),
				new Persona("Jimmy"),
				new Persona("Neider"));	
		
		listPersonas.stream().forEach(persona->System.out.println(persona.getNombre()));
		
		/*for (Persona persona2 : listPersonas) {
			System.out.println(persona2.getNombre());
			
		}*/
		
		Collections.sort(listPersonas);
		Collections.reverse(listPersonas);
		System.out.println("************************************");
		listPersonas.stream().forEach(persona->System.out.println(persona.getNombre()));
		
		// concatenar
		System.out.println("************************************");
		System.out.println("************************************");
		System.out.println("************************************");
		
		 List<Integer> list1 = Arrays.asList(3, 6, 9, 12, 15);
		 List<Integer> list2 = Arrays.asList(2, 4, 8, 1, 11,3,3,3);
		 List<Integer> resultList2 = new ArrayList<Integer>(list1);
		 
		 resultList2.addAll(list2);
		 resultList2.stream().forEach(System.out::print); 	
		
	}
	
	
	
	private static void pruebaSet() {
		
		Set<String> set1 = new HashSet<String>();
		set1.add("UNO");
		set1.add("DOS");
		set1.add("TRES");
		set1.add("TRES");
		
		for (String string : set1) {
			System.out.println(string); 	
		}
		
		//Lsita de objetos
        System.out.println("************************************");
        Set<Persona> listPersonas =new HashSet<Persona>();
        listPersonas.add(new Persona("JUAN"));
        listPersonas.add(new Persona("Juan"));
        listPersonas.add(new Persona("Edgar"));
        listPersonas.add(new Persona("Edgar"));
        listPersonas.add(new Persona("Jimmy"));
        listPersonas.add(new Persona("Neider"));	
		
		listPersonas.stream().forEach(persona->System.out.println(persona.getNombre()));
		  System.out.println("************************************");
		  System.out.println("************************************");
		Persona p1=new Persona("Juan");
		
		System.out.println("Persona.tosString:"+p1.toString());
		System.out.println("Persona.hashCode:"+p1.hashCode());
		
		  System.out.println("************************************");
		Persona p2=new Persona("JUAN");
		
		System.out.println("Persona.tosString:"+p2.toString());
		System.out.println("Persona.hashCode:"+p2.hashCode());
		
		System.out.println("P2.equals(P1):"+p2.equals(p1));
		
		List<Persona> resultList2 = new ArrayList<Persona>(listPersonas);
		
		Collections.sort(resultList2);
		//Collections.reverse(resultList2);
		System.out.println("************************************");
		resultList2.stream().forEach(persona->System.out.println(persona.getNombre()));
		
		
	}

	
	 private static void  pruebaMaps() {
		 Map<String,String> map1=new HashMap<String,String>();
		 map1.put("CODIGO1", "Juan");
		 map1.put("CODIGO2", "Jimmy");
		 map1.put("CODIGO3", "Neider");
		 System.out.println("************************************");
		 System.out.println("CODIGO2:"+map1.get("CODIGO2"));
		 System.out.println("************************************");
		/* for (Map.Entry<String, String> entry : map1.entrySet()) {
			String key = entry.getKey();
			String val = entry.getValue(); 
			System.out.println("key:"+key);
			System.out.println("val:"+val);
		}*/
		 map1.put("CODIGO2", "Edgar");
		  System.out.println("CODIGO2:"+map1.get("CODIGO2"));
		  
		String[] codigosArrray= new String[] {"CODIGO1","CODIGO2","CODIGO3"};  
		 System.out.println("************************************");
		for (int i = 0; i < codigosArrray.length; i++) {
			System.out.println("codigosArrray["+i+"]="+codigosArrray[i]);
			
			String nombre=map1.get(codigosArrray[i]);
			System.out.println("nombre="+nombre);
		}
		 
		 
	 }


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//pruebaList();

		//pruebaSet();
		 pruebaMaps();
	}

}

