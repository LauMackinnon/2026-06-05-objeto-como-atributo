package org.example
import org.example.Persona
import org.example.Polinomio
import org.example.Cuadratica
import org.example.CuadraticaMejor
import org.example.Cuatrinomio

fun main() {
    //println(Persona("pepe", "honguito", Fecha(5, 6, 2026)))

    
    var lista = ArrayList<Polinomio>()
    lista.add(Cuadratica())
    lista.add(Polinomio())
    lista.add(CuadraticaMejor())
    lista.add(Cuatrinomio())
    for(polinomio in lista) {
        println(polinomio)
    }

}