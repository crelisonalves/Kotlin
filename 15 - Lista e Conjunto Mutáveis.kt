/**
 * Introdução ao Kotlin
 * https://play.kotlinlang.org/
 * Autor: Crelison Alves
 * Data: 25/07/2021 
 * Construindo Coleções Mutáveis, ou seja, a lista pode ser alterada mesmo depois de inicializada
 * 
 * 
 */



fun main() {
    
    // Podemos construir uma tupla de valores usando coleções
    val Crelison = Funcionario("Crelison", 10000.00, "CLT")
    val Tobias = Funcionario("Tobias", 5000.50, "Estatutário")
    val Robo = Funcionario("Robô Zaza", 1000.30, "Terceirizado")
    
	val funcionarios = mutableListOf(Crelison, Robo)     //Podemos alterar a lista mesmo depois de inicializada
    funcionarios.forEach {println(it)}
    println("\n")    

    
    // Agora suponha que o fucionário Robo foi demitido
    funcionarios.remove(Robo)
    funcionarios.forEach {println(it)}
    println("\n")    
       

    // Agora suponha que o Tobias foi é contratado
    funcionarios.add(Tobias)
    funcionarios.forEach {println(it)}
    println("\n")    

    // Agora vamos manipular conjuntos
    println("-------__CONJUNTOS__-------")
    val funcionariosConjunto = mutableSetOf(Tobias)
    funcionariosConjunto.forEach {println(it)}
    println("\n") 

    // Agora vamos adicionar elementos no conjuntos    
    funcionariosConjunto.add(Robo)
    funcionariosConjunto.add(Crelison)
    funcionariosConjunto.add(Crelison)					// Observe que conjuntos não aceita elementos repetidos
    funcionariosConjunto.forEach {println(it)}
    println("\n") 

    // Agora vamos remover elementos no conjuntos    
    funcionariosConjunto.remove(Robo)    
    funcionariosConjunto.forEach {println(it)}
    println("\n") 
    
    
    println("\n")    
    println("\n")
    
 

}

//Definindo as classes dos objetos que serão usados
data class Funcionario(    
    val nome: String,			//parâmetros de entrada
    val salario: Double,		//parâmetros de entrada
    val regime: String			//parâmetros de entrada
 	) {
    	override fun toString(): String = 		           // override sobrepões as funções já declaradas
    		"""									
    			Nome:......$nome
    			Salário:...$salario
    			Regime:....$regime
    		""".trimIndent()+"\n-----------------------"   // aspa tripla é usado para string com mais de uma linha
    }
