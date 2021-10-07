package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ServicioMascota {

    //Creacion de Scanner para el ingreso de datos

    private Scanner sc;

    //Creacion de la ArrayList

    private ArrayList<String> razas;

    /**
     * Metodos
     */

    //Creamos el ArrayList de mascotas

    public ServicioMascota() {

        this.sc = new Scanner(System.in).useDelimiter("\n");
        this.razas = new ArrayList<>();

    }

    //Ingreso de razas

    public void ingresarRaza() {

        System.out.println("\n¿Cuantas perros desea ingresar?");
        int cantidad = sc.nextByte();

        for (int i = 0; i < cantidad; i++) {

            System.out.println("\nIngrese la raza del Animal");

            String raza = sc.next();

            razas.add(raza);

        }

    }

    public void mostrarRazas() {

        System.out.println("\nLas razas ingresadas son: \n");

        for (String aux : razas) {

            System.out.println(aux);

        }

        System.out.println("\nCantidad de perros: " + razas.size() + "\n");

    }

    public void salir() {

        System.out.println("¿Desea salir del programa?");
        System.out.println("S / N");

        String opc = sc.next();

        while (opc.equals("S") || opc.equals("s")) {

            System.exit(0);

        }

        if (opc.equals("n") || opc.equals("N")) {

            ingresarRaza();
            mostrarRazas();
            eliminarRazas();
            salir();

        }

    }

    //Una Bandera es una variable booleana que nos indica si ha ocurrido un suceso.
    //Por ejemplo, podemos utilizar una bandera para saber si, tras recorrer una lista de datos,
    //hemos encontrado algún número mayor que 17.
    //Para usar una bandera hay que: declararla, inicializarla, cambiarla (cuando corresponda) y consultarla

    public void eliminarRazas() {

        System.out.println("¿Que raza desea eliminar?");
        String delete = sc.next();

        //Declaramos variable Flag e inicializamos

        boolean perroEliminado = false;

        Iterator<String> it = razas.iterator();

        while (it.hasNext()) {

            String raza = it.next();

            if (raza.equals(delete)) {

                //Cambiar la variable mientras corresponda

                perroEliminado = true;
                it.remove();

                System.out.println("La raza "+ raza +" ha sido eliminada");

            }

        }

        if (!perroEliminado){

            System.out.println("No se encontro la raza en la lista.");

        }

    }

}
