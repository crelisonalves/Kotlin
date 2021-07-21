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
    val Crelison = Funcionario("Crelison Nelson", 20000.89, "CLT")
    val Robo = Funcionario("Robô Jaja", 3500.12, "Estaturário")
    val Tobias = Funcionario("Tobias Baby", 5000.03, "CLT")
    
    // Cria duas listas
    val funcionarios1 = setOf(Crelison, Tobias)
    val funcionarios2 = setOf(Robo)
    
    // Une as listas
    val uniaoDeListas = funcionarios1.union(funcionarios2)
    uniaoDeListas.forEach{println(it)}
    
    println("\n")
    
    // Retira os elemnetos de uma lista
    val retiraDeListas = uniaoDeListas.subtract(funcionarios1)
    retiraDeListas.forEach{println(it)}    
    								   
    println("\n")
    
    // Mantém os elemnetos comuns de duas listas
    val intercecaoDeListas = uniaoDeListas.intersect(funcionarios1)
    intercecaoDeListas.forEach{println(it)}    
    
    println("\n")    
    println("\n")    
}


//Primeiro passa para escrover o programa é desenvolver os objetos que serão usados
data class Funcionario(    
    val nome: String,			//parâmetros de entrada
    val salario: Double,			//parâmetros de entrada
    val tipoContratacao: String			//parâmetros de entrada
 	) {
    	override fun toString(): String = 		           // override sobrepões as funções já declaradas
    		"""									
    			Nome: $nome
    			Salário: $salario
    		""".trimIndent()+"\n-----------------------"   // aspa tripla é usado para string com mais de uma linha
    }
