/**
 * Introdução ao Kotlin
 * https://play.kotlinlang.org/
 * Autor: Crelison Alves
 * Data: 20/07/2021 
 * Construindo uma coleção de objetos
 * Listas é um recurso poderoso para fazer uma coleção de obejtos
 * Podemos construir objetos usando classes, classes poder ser compostos por atributos, estados e métodos
 * Podemos ordenar a lista usando o método sortedBy
 * 
 */

fun main() {
    
    // Segundo passo desenvolver o corpo da função main
    
    // criando objetos do tipo Funcionario
    val Crelison = Funcionario("Crelison Nelson", 20000.89)
    val Robo = Funcionario("Robô Jaja", 3500.12)
    val Tobias = Funcionario("Tobias Baby", 5000.03)
    
    // Cria uma lista de objetos
    val funcionarios = listOf(Crelison, Robo, Tobias)
    
    // Exibe a lista
    funcionarios.forEach{println(it)}  // O termo it se refere a cada elemento do lista
    								   // então será ixibido cada elemento que é apontado na lista
    
    // Ordenando a lista por salário
    funcionarios.sortedBy {it.salario}.forEach{println(it)}
    								   
    
    
}


//Primeiro passa para escrover o programa é desenvolver os objetos que serão usados
data class Funcionario(    
    val nome: String,			//parâmetros de entrada
    val salario: Double			//parâmetros de entrada
 	) {
    	override fun toString(): String = 		           // override sobrepões as funções já declaradas
    		"""									
    			Nome: $nome
    			Salário: $salario
    		""".trimIndent()+"\n-----------------------"   // aspa tripla é usado para string com mais de uma linha
    }
