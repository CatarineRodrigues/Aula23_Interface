package exerc1

import kotlin.system.exitProcess

class Menu {

    private val quadrado: FormaGeometrica = Quadrado()
    private val retangulo: FormaGeometrica = Retangulo()
    private val losango: FormaGeometrica = Losango()

    fun menuPrincipal(){
        println("-----MENU PRINCIPAL-----")
        println("Digite o número da opção desejada")
        println("1 - Quadrado")
        println("2 - Retângulo")
        println("3 - Losango")
        println("4 - Sair")
    }

    fun redirecionamentoDoMenu() {
        while (true) {
            menuPrincipal()
            when (readln().toInt()){
                1 -> {
                    quadrado.pedirTamanhos()
                    quadrado.calcularArea()
                }
                2 -> {
                    retangulo.pedirTamanhos()
                    retangulo.calcularArea()
                }
                3 -> {
                    losango.pedirTamanhos()
                    losango.calcularArea()
                }
                4 -> {
                    println("Obrigado por usar nosso sistema!")
                    exitProcess(0)
                } else -> println("Opção inválida, tente novamente.")
            }
        }
    }
}