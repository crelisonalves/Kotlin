/**
 * Introdução ao Kotlin
 * https://play.kotlinlang.org/
 * Autor: Crelison Alves
 * Data: 20/07/2021 
 * Construindo mapa de valores
 * 
 * 
 */

fun main() {
    
    // Podemos construir uma tupla de valores usando a função Pair()
    val tupla: Pair<String, Double> = Pair("Crelison", 10.0)
    
    // Montando o nosso mapa de valores
    val mapa = mapOf(tupla)
    mapa.forEach{(nome, nota) -> println("Nome: $nome  Nota: $nota")}
       
    
    println("\n")    
    println("\n")
    
    // Outra forma de povoar a tupla de valores no mapa
    val mapa2 = mapOf(
    						"Tobias" to 10.0,
        					"Talita" to 09.9
    )
    
    // Exibindo o nosso mapa de valores
    mapa2.forEach{(nome, nota) -> println("Nome: $nome  Nota: $nota")}

}

