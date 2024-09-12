fun main() {


    fun Atividade1(){
        class Pessoa(val nome: String, val idade: Int, val altura: Double, val estudante: Boolean)

        val pessoa1 = Pessoa("Alan", 19, 1.70, true)
        val pessoa2 = Pessoa("Carlos", 19, 1.70, true)

        fun somaidade(): Int {
            return pessoa2.idade + pessoa1.idade
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

        var descontoDoINSSfazoL: Double = 2000.00

        fun SalBruit(): Double {
            return pessoa1.Salmensal*pessoa1.JobsMounth
        }

        fun Descontinho(): Double {
            return SalBruit()-descontoDoINSSfazoL
        }

        var AchadinhoDaShoppe: Double = 239.45

        fun Shoppe(): Double{
            return AchadinhoDaShoppe * pessoa1.buys
        }

        println("Nome da Pessoa: ${pessoa1.nome}")
        println("Idade da pesoa: ${pessoa1.idade}")
        println("Salário Mensal: ${pessoa1.Salmensal}")
        println("Meses trabalhados: ${pessoa1.JobsMounth}")
        println("Quantidade de produtos comprados: ${pessoa1.buys}")
        println("Salário Bruto Anual:${SalBruit()}")
        println("Salário Limpo Anual: ${Descontinho()}")
        println("Gastos em produtos da shoppe: ${Shoppe()}")
    }
    Atividade2()
    println("")

    fun Atividade3 (){

        val nome: String = "Opitimus Prime"
        val produtoval: Float = 2000.0F
        val quantproduto: Int = 10
        var imposto: Float = 0.15F
        var lucro: Float = 0.30F

        fun ValorLimpo(): Float{
            return produtoval * quantproduto
        }

        fun ValorcImposto(): Double{
            return (ValorLimpo() + (ValorLimpo()*imposto)).toDouble()
        }

        fun CalculodeMargem(): Double{
            return (ValorcImposto() + (ValorcImposto()*lucro))
        }

        println("Nome dao Produto: ${nome}")
        println("Acrescimo de imposto de 0,15%: ${"%.2f".format(ValorcImposto())}R$")
        println("Preço sugerido para margem de 30% de lucro: ${"%.2f".format(CalculodeMargem())}R$")

    }
    Atividade3()
}


