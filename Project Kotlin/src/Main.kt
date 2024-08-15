


fun main() {


    fun Atividade1(){
        class Pessoa(val nome: String, val idade: Int, val altura: Double, val estudante: Boolean)

        val pessoa1 = Pessoa("Alan", 19, 1.70, true)
        val pessoa2 = Pessoa("Carlos", 19, 1.70, true)

        fun somaidade(): Int {
            return pessoa1.idade + pessoa2.idade
        }

        fun fatorarAltura(): String {
            return ("${pessoa1.altura*2}m")
        }

        fun saudacao(): String {
            return ("Olá ${pessoa1.nome} e ${pessoa2.nome}")
        }
        fun impressoes() {
            println(saudacao())
            println("Nomes: ${pessoa1.nome} e ${pessoa2.nome}")
            println("Alturas: ${pessoa1.altura} e ${pessoa2.altura}")
            println("Idades: ${pessoa1.idade} e ${pessoa2.idade}")
            println("São estudantes: ${pessoa1.estudante} e ${pessoa2.estudante}")
            println("Soma das Idades: ${somaidade()}")
            println("Altura Dobrada: ${fatorarAltura()}")
        }
        impressoes()
    }

    Atividade1()

    println("")

    fun Atividade2(){

        class Pessoa(val nome: String, val idade: Int, val Salmensal: Double, val JobsMounth: Int, val buys: Int)

        val pessoa1 = Pessoa("Carlos", 19, 1900.00, 12, 5 )

       fun SalBruit(): Double {
        return pessoa1.Salmensal*pessoa1.JobsMounth
        }

        var descontoDoINSSfazoL: Double = 2000.00

        fun Descontinho(): Double {
            return pessoa1.Salmensal-SalBruit()
        }

        var AchadinhoDaShoppe: Double = 239.45

        fun Shoppe(): Double {
            return (AchadinhoDaShoppe*pessoa1.JobsMounth)/pessoa1.JobsMounth
        }
    }

Atividade2()

}
