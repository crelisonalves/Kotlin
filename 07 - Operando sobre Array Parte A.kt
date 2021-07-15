/**
 * Introdução ao Kotlin
 * https://play.kotlinlang.org/
 * Autor: Crelison Alves
 * Data: 15/07/2021 
 *
 * Colentando informações de um Array
 * 
 * 
 */

fun main() {
    
    // Cria um array de números de ponto flutuante
    val notas = DoubleArray(3)
    notas[0] = 10.0   // Observe que as casas decimais usa-se ponto (.)
    notas[1] = 5.6
    notas[2] = 9.1
    
        
    // Extraindo a maior nota em um Array
    println("Maior nota:${notas.maxOrNull()}")
       
    // Obtendo a menor nota em um Array
    println("Menor nota: ${notas.minOrNull()}")

    // Calculando a Média de um Array
    println("Média: ${notas.average()}")
    println("Média: %.2f".format(notas.average())) 
    //println("\n-----------------------")
    
    // Selecionado elementos de um Array
    val selecao = notas.filter{it<7.0}     // o método filter retorna um Array, uma coleção de elementos que atendem o critério
    selecao.forEach{println(it)}
    //println("\n-----------------------")    
}
