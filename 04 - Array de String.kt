/**
 * Introdução ao Kotlin
 * https://play.kotlinlang.org/
 * Autor: Crelison Alves
 * Data: 14/07/2021 
 *
 * Criação de objeto Array de String.
 * 
 * 
 */

fun main() {
    
    // Cria um array de string
    val nomes = Array<String>(3){""}  //inicializa um array vazio
    
    // Tripula o Array
    nomes[0] = "Crelison"
    nomes[1] = "Kotlin"
    nomes[2] = "Java"
    
    //Exibe o Array
    for ( nome in nomes){
        println(nome)
    }
    println("\n-----------------------")
    
    // Outra forma de exibir o Array
    nomes.forEach{ nome ->
        println(nome)
    }
	println("\n-----------------------")
    
    // Outra forma de exibir o Array
    for (index in nomes.indices){
        println(nomes[index])
    }
    println("\n-----------------------")

    // Ordenando o Array
    nomes.sort()
    for (index in nomes.indices){
        println(nomes[index])
    }
}
