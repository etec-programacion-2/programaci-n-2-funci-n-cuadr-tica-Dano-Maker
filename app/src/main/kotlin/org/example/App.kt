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

//etapa 2

fun main() {
    // Coeficientes de la función cuadrática f(x) = ax² + bx + c
    val a = 2.0
    val b = -3.0
    val c = 1.0
    
    // Mostramos la ecuación
    println("Función cuadrática: f(x) = ${a}x² + ${b}x + ${c}")
    println()
    
    // Generamos y mostramos la tabla de valores para x de -5 a 5
    generarTablaDeValoresFormateada(a, b, c, -5, 5)
}

// Esta función calcula el valor de f(x) = ax² + bx + c
fun calcularFuncionCuadratica(a: Double, b: Double, c: Double, x: Double): Double {
    return a * x * x + b * x + c
}

// Esta función genera una tabla de valores formateada
fun generarTablaDeValoresFormateada(a: Double, b: Double, c: Double, inicio: Int, fin: Int, paso: Int = 1) {
    // Encabezado de la tabla
    println("┌───────┬───────────┐")
    println("│   x   │   f(x)    │")
    println("├───────┼───────────┤")
    
    for (i in inicio..fin step paso) {
        val x = i.toDouble()
        val fx = calcularFuncionCuadratica(a, b, c, x)
        
        // Formateando los números a 2 decimales
        val xFormateado = String.format("%5.2f", x)
        val fxFormateado = String.format("%9.2f", fx)
        
        println("│ $xFormateado │ $fxFormateado │")
    }
    
    println("└───────┴───────────┘")
}