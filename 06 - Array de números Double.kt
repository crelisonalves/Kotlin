/**
 * Introdução ao Kotlin
 * https://play.kotlinlang.org/
 * Autor: Crelison Alves
 * Data: 14/07/2021 
 *
 * Criação de objeto Array de números de ponto flutuante
 * 
 * 
 */

fun main() {
    
    // Cria um array de números de ponto flutuante
    val notas = DoubleArray(3)
    notas[0] = 10.0   // Observe que as casas decimais usa-se ponto (.)
    notas[1] = 5.6
    notas[2] = 9.1
    
    //Exibe o Array
    for ( nota in notas){
        println(nota)
    }
    println("\n-----------------------")
    
    // Outra forma de exibir o Array
    notas.forEach{ nota ->
        println(nota)
    }
	println("\n-----------------------")
    
    // Outra forma de exibir o Array
    for (index in notas.indices){
        println(notas[index])
    }
    println("\n-----------------------")

    // Ordenando o Array
    notas.sort()
    for (index in notas.indices){
        println(notas[index])
    }
    println("\n-----------------------")
    
    //Redução de nota dos alunos por mau comportamento
    notas.forEachIndexed{ index, nota -> 
        notas[index] = nota*0.9
    }
    for (index in notas.indices){
        println(notas[index])
    }
    println("\n-----------------------")    
}
