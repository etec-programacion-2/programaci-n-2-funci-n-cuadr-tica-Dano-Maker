package org.example

//etapa 1 

fun pcoeficientes() {
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

fun Tabla() {
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

//etapa 3

fun valores_de_raiz(): Triple<Double, Double, Double> {
    // Valores para la ecuación ax² + bx + c
    val a = 1.0
    val b = -5.0
    val c = 6.0
    
    println("Calculando raíces para: ${a}x² + ${b}x + ${c}")
    
    // Devolver los valores para que puedan ser usados en otras funciones
    return Triple(a, b, c)
}

// Función para calcular el discriminante (b² - 4ac)
fun calcularDiscriminante(a: Double, b: Double, c: Double): Double {
    return b * b - 4 * a * c
}

// Función para calcular y mostrar las raíces según el valor del discriminante
fun calcularYMostrarRaices(a: Double, b: Double, discriminante: Double) {
    when {
        discriminante > 0 -> {
            // Dos raíces diferentes
            val x1 = (-b + Math.sqrt(discriminante)) / (2 * a)
            val x2 = (-b - Math.sqrt(discriminante)) / (2 * a)
            println("Dos raíces reales:")
            println("x1 = %.2f".format(x1))
            println("x2 = %.2f".format(x2))
        }
        discriminante == 0.0 -> {
            // Una raíz doble
            val x = -b / (2 * a)
            println("Una raíz doble:")
            println("x = %.2f".format(x))
        }
        else -> {
            // Raíces complejas
            val parteReal = -b / (2 * a)
            val parteImaginaria = Math.sqrt(-discriminante) / (2 * a)
            println("Raíces complejas:")
            println("x1 = %.2f + %.2fi".format(parteReal, parteImaginaria))
            println("x2 = %.2f - %.2fi".format(parteReal, parteImaginaria))
        }
    }
}

fun main() {
    val (a, b, c) = valores_de_raiz()
    val discriminante = calcularDiscriminante(a, b, c)
    println("Discriminante: %.2f".format(discriminante))
    calcularYMostrarRaices(a, b, discriminante)
    Tabla()
    pcoeficientes()
}