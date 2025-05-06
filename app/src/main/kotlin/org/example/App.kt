package org.example

//etapa 1 

fun main() {
    val a = 6
    val b = 3
    val c = 2
    
    if (a != 0) {
        println("La función cuadrática es: ${a}x² + ${b}x + ${c}")
        println("La forma estándar es: f(x) = ${a}x² + ${b}x + ${c}")
    } else {
        println("No es una función cuadrática porque a = 0")
        println("Es una función lineal: f(x) = ${b}x + ${c}")
    }
}