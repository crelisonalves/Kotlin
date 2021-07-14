/**
 * Introdução ao Kotlin
 * https://play.kotlinlang.org/
 * Autor: Crelison Alves
 * Data: 13/07/2021 
 *
 * Criação de objeto Array e inicializa com o intArrayOf.
 * Desta forma não precisamos limitar o tamanho do Array
 * precisamos apenas povoar.
 */

fun main() {
    
    // Cria a Matriz o array e inicializa com o intArrayOf
    val matriz = intArrayOf(1, 2, 4, 5, -1)
    
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
