//Crear una clase llamada Alumno que mantenga información sobre las notas de
//distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista
//de tipo Integer con sus 3 notas.

package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Alumno {

    private String nombre;
    private ArrayList<Float> notas;
    
    //Constructor sobrecargado

    public Alumno(String nombre, ArrayList<Float> notas) {

        this.nombre = nombre;
        this.notas = notas;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Float> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Float> notas) {
        this.notas = notas;
    }

    /**
     * Metodos
     */

    //Metodo notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular
    //su nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al
    //método. Dentro del método se usará la lista notas para calcular el promedio final
    //de alumno. Siendo este promedio final, devuelto por el método y mostrado en el
    //main.

    public float notaFinal(){

        Iterator<Float> it = notas.iterator();

        float acumulador = 0;

        while (it.hasNext()){

            acumulador += it.next();

        }

        return acumulador / notas.size();

    }

}
