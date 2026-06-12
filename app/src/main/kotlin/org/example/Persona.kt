package org.example
class Persona(
    val nombre: String,
    val apellido: String,
    val fecha: Fecha)
    {
    override fun toString (): String{
        return "Persona(${nombre}, ${apellido} ${fecha})"
    }
}