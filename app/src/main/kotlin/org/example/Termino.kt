package org.example

open class Termino(val escalar: Int, val grado: Int) {

        override fun toString(): String {
            if (grado == 0) {
                return "$escalar"
            }
            else if (grado == 1) {
                return "${escalar}X"
            }
            else if (escalar > 1) {
                return "${escalar}X^${grado}"
            }
            else {
                return "No puede haber grados negativos"
            }
        }

}