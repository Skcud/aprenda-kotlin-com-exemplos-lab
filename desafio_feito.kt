// [Template no Kotlin Playground](https://pl.kotl.in/uVYRMvF-J)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario (var nome :String)

data class ConteudoEducacional(var nome: String, val duracao: Int)

data class Formacao(val nome: String, var nivel: Nivel, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {

    val conteudo1 = ConteudoEducacional("Kotlin", 67)
    val usuario1 = Usuario("Gabriel")
    val formacao1= Formacao("Android Developer", Nivel.INTERMEDIARIO, listOf(conteudo1))
    
    val conteudo2 = ConteudoEducacional("JavaScript", 41)
    val usuario2 = Usuario("Raoni")
    val formacao2= Formacao("Lógica de Programação", Nivel.BASICO, listOf(conteudo2))

    
    println("Usuário: ${usuario1.nome}") 
    println("Formação Matriculada: ${formacao1.nome}, Nível: ${formacao1.nivel} ")
    println("Conteudos: ${conteudo1.nome}, Duração: ${conteudo1.duracao} horas\n")

    println("Usuário: ${usuario2.nome}")
    println("Formação Matriculada: ${formacao2.nome}, Nível: ${formacao2.nivel} ")
    println("Conteudos: ${conteudo2.nome}, Duração: ${conteudo2.duracao} horas\n")
    
}
