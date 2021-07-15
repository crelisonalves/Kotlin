/**
 * Introdução ao Kotlin
 * https://play.kotlinlang.org/
 * Autor: Crelison Alves
 * Data: 15/07/2021 
 *
 * Fazendo buscas em um Array
 * 
 * 
 */

fun main() {
    
    // Cria um array de números de ponto flutuante
    val notas = DoubleArray(3)
    notas[0] = 10.0   // Observe que as casas decimais usa-se ponto (.)
    notas[1] = 5.6
    notas[2] = 9.1
    
        
    // Contando elemnetos em um Array que satisfazem determinido critério
    println("Notas na faixa de [9.0:4.0]: ${notas.count{it in 9.0..4.0}}")
       
    // Retorna o valor procurando se encontrar, e retorna null se não achar
    println("Verfica se há pelo menos uma nota igual a 8.0:\n ${notas.find{it == 8.0}}")

    // Ferificar se pelo menos um elemento atende ao critério da expressão imposta
    println("Algum elemento do Array satisfaz a expressão: ${notas.any{it > 8.0}}")  // ertorna verdadeiro ou falso
    //println("\n-----------------------")
    
    
}
