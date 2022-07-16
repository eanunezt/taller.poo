package edu.itli.talleres.poo.profesores;

import java.util.Calendar;

public class TestHerencia4 {

    public static void main (String [ ] Args) {

        Profesor profesor1 = new Profesor ("Juan", "Hernández García", 33);

        profesor1.setIdProfesor("Prof 22-387-11");

        Calendar fecha1 = Calendar.getInstance();

        fecha1.set(2022,6,21); //Los meses van de 0 a 11, luego 10 representa noviembre

        ProfesorInterino interino1 = new ProfesorInterino("José Luis", "Morales Pérez", 54, fecha1);

        ListinProfesores listin1 = new ListinProfesores ();

        listin1.addProfesor(profesor1);

        listin1.addProfesor(interino1);
        
        ProfesorInterino interino2 = new ProfesorInterino("José Luis2", "Morales Pérez2", 59, fecha1);
        listin1.addProfesor(interino2);

        listin1.listar(); 
        } //Cierre del main

}