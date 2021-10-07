//Un cine necesita implementar un sistema en el que se puedan cargar peliculas.
//Para esto, tendremos una clase Pelicula con el titulo, director y duración de la
//película (en horas). Implemente las clases y métodos necesarios para esta
//situación, teniendo en cuenta lo que se pide a continuación:
//En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
//usuario todos sus datos y guardándolos en el objeto Pelicula.
//Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario
//si quiere crear otra Pelicula o no.
//Después de ese bucle realizaremos las siguientes acciones:
//Mostrar en pantalla todas las películas.
//Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
//Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
//en pantalla.
//Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
//en pantalla.
//Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
//Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
//Nota: recordar el uso del Comparator para ordenar colecciones con objetos.

package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Creamos el Scanner para el ingreso de datos

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        //Creamos la lista

        ArrayList<Pelicula> Peliculas = new ArrayList<>();

        //En el main deberemos tener un bucle que crea un objeto Pelicula
        //pidiéndole al usuario todos sus datos y guardándolos en el objeto Pelicula.

        //Variable FLAG

        boolean ingresarPeliculas = true;

        while (ingresarPeliculas) {

            System.out.println("\n[ P E L I C U L A S ]\n");

            System.out.println("Ingrese el titulo de la pelicula");
            String titulo = sc.next();

            System.out.println("Ingrese el director");
            String director = sc.next();

            System.out.println("Ingrese la duracion (En horas)");
            double duracion = sc.nextByte();

            Peliculas.add(new Pelicula(titulo, director, duracion));

            System.out.println("\n¿Desea ingresar otra pelicula?");
            System.out.println("S / N");

            String opc = sc.next();

            if (opc.equals("n") || opc.equals("N")) {

                ingresarPeliculas = false;

            }

        }

        //Mostamos todos los metodos.

        //Mostrar en pantalla todas las peliculas

        System.out.println("\n[ LISTADO DE PELICULAS ]\n");

        for (Pelicula pelicula : Peliculas) {

            System.out.println("· " + pelicula.getTitulo());
        }

        //Mostrar en pantalla todas las películas con una duración mayor a 1 hora.

        System.out.println("\n[ PELICULAS MAYOR A 1 HORA ]\n");

        for (Pelicula pelicula : Peliculas) {

            if (pelicula.getDuracion() > 1) {

                System.out.println("· La pelicula " + pelicula.getTitulo() + " tiene una duracion de " + pelicula.getDuracion());
            }
        }

        //Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.

        System.out.println("\n[ PELICULAS DE MAYOR A MENOR EN SU DURACION ·\n");

        Peliculas.sort(Comparator.comparing(Pelicula::getDuracion).reversed());

        for (Pelicula pelicula : Peliculas) {

            System.out.println("· La pelicula " + pelicula.getTitulo() + " tiene una duracion de " + pelicula.getDuracion());

        }

        //Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.

        System.out.println("\n[ PELICULAS DE MENOR A MAYOR EN SU DURACION ]\n");

        Peliculas.sort(Comparator.comparing(Pelicula::getDuracion));

        for (Pelicula pelicula : Peliculas) {

            System.out.println("· La pelicula " + pelicula.getTitulo() + " tiene una duracion de " + pelicula.getDuracion());

        }

        //Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.

        System.out.println("\n[ PELICULAS POR TITULO ALFABETICAMENTE ]\n");

        Peliculas.sort(Comparator.comparing(Pelicula::getTitulo));

        for (Pelicula pelicula : Peliculas) {

            System.out.println("· " + pelicula.getTitulo());

        }

        //Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.

        System.out.println("\n[ PELICULAS POR DIRECTOR ALFABETICAMENTE ]\n");

        Peliculas.sort(Comparator.comparing(Pelicula::getDirector));

        for (Pelicula pelicula : Peliculas) {

            System.out.println("· " + pelicula.getTitulo() + " (" + pelicula.getDirector() + ")" );

        }

    }
}
