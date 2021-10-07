//Crear una clase llamada Alumno que mantenga información sobre las notas de
//distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista
//de tipo Integer con sus 3 notas.
//En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
//información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
//pregunta al usuario si quiere crear otro Alumno o no.
//Despues de ese bluce tendremos el siguiente método en la clase Alumno:
//Metodo notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular
//su nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al
//método. Dentro del método se usará la lista notas para calcular el promedio final
//de alumno. Siendo este promedio final, devuelto por el método y mostrado en el
//main.
//Ejemplo de una colección como atributo: ColeccionAtributo

package com.company;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
        //información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
        //pregunta al usuario si quiere crear otro Alumno o no.

        ArrayList<Alumno> Alumnos = new ArrayList<>();

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        //Creacion Flag

        boolean crearMasAlumnos = true;

        while (crearMasAlumnos) {

            System.out.println("[Crear Alumno]\n");

            System.out.println("Ingrese Nombre");
            String nombre = sc.next();

            //Ingreso float de 3 notas

            ArrayList<Float> notas = new ArrayList<>();

            //Recorremos el Array

            for (int i = 0; i < 3; i++) {

                System.out.println("\nIngrese la nota " + (i + 1));

                float nota = sc.nextFloat();

                notas.add(nota);

            }

            Alumnos.add(new Alumno(nombre, notas));

            System.out.println("\n¿Desea ingresar otro Alumno?\n");
            System.out.println("S / N\n");

            String opc = sc.next();

            if (opc.equals("n") || opc.equals("N")) {

                crearMasAlumnos = false;

            }

        }

        //Variable booleana FLAG

        boolean profinal = false;

        System.out.println("\nIngrese el nombre del alumno para buscar el promedio final\n");
        String alumnoBuscar = sc.next();

        Iterator<Alumno> it = Alumnos.iterator();

        while (it.hasNext()) {

            if (it.next().getNombre().equals(alumnoBuscar)) {

                System.out.println("\nEl promedio de notas de: " + it.next().getNombre() + " es de " + it.next().notaFinal());

                profinal = true;

            }
        }

        if (!profinal) {
            System.out.println("No se encontro la persona, Intente nuevamente.");
        }

    }
}
