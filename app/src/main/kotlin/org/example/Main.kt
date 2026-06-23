package org.example
import org.example.Cuadratica
import org.example.CuadraticaMejor
import org.example.Cuatrinomio
import org.example.Polinomio
import org.example.Termino

fun main() {
    //println(Persona("pepe", "honguito", Fecha(5, 6, 2026)))
    /* 
    var lista = ArrayList<Polinomio>()
    lista.add(Cuadratica())
    lista.add(Polinomio())
    lista.add(CuadraticaMejor())
    lista.add(Cuatrinomio())
    for(polinomio in lista) {
        println(polinomio)
    }
    */
    var t1 = Termino(2, 2)
    var t2 = Termino(3, 1)
    var t3 = Termino(2, 0)
    var polinomio = Polinomio(arrayListOf(t1, t2, t3))
    var t4 = Termino(1, 3)
    var t5 = Termino(4, 2)
    var t6 = Termino(2, 1)
    var t7 = Termino(3, 0)
    var polinomio2 = Polinomio(arrayListOf(t4, t5, t6, t7))
    println(polinomio)
    println(polinomio2)
}