/**
 * Introdução ao Kotlin
 * https://play.kotlinlang.org/
 * Autor: Crelison Alves
 * Data: 13/07/2021 
 *
 * Criação de objeto Array.
 *
 */

fun main() {
    
    // Cria a Matriz o array
    val matriz = IntArray(5)
    
    //Povoa o Array
    matriz[0] = 1
    matriz[1] = 2
    matriz[2] = -2
    matriz[3] = 11
    matriz[4] = 5
    
    //Exibe o Array
    for ( elemento in matriz){
        println(elemento)
    }
    println("\n-----------------------")
    
    // Outra forma de exibir o Array
    matriz.forEach{ elemento ->
        println(elemento)
    }
	println("\n-----------------------")
    
    // Outra forma de exibir o Array
    for (index in matriz.indices){
        println(matriz[index])
    }
    println("\n-----------------------")

    // Ordenando o Array
    matriz.sort()
    for (index in matriz.indices){
        println(matriz[index])
    }
}
