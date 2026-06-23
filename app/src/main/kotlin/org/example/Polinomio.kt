package org.example
import org.example.Termino

open class Polinomio(private var terminos: ArrayList<Termino> = arrayListOf<Termino>()) {
    override fun toString(): String {
        return terminos.joinToString(" + ")
    }
    fun sumarTermino(termino: Termino) {
        terminos.add(termino)
    }
}