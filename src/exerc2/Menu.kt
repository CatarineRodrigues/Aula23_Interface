package exerc2

import kotlin.system.exitProcess

class Menu {

    private val poupanca: Tributo = ContaPoupanca()
    private val corrente: Tributo = ContaCorrente()
    private val seguroVida: Tributo = SeguroDeVida()
    private lateinit var opcaoMenuPrincipal: String
    private lateinit var opcaoSubMenu: String

    private fun menuPrincipal() {
        println("--------------------------")
        println("----- MENU PRINCIPAL -----")
        println("Qual conta deseja acessar?")
        println("---- 1 Conta Poupança ----")
        println("---- 2 Conta Corrente ----")
        println("---- 3 Seguro de Vida ----")
        println("---- 4 Sair --------------")
        println("--------------------------")
        opcaoMenuPrincipal = readln()
    }

    private fun subMenu() {
        println("---------------------------------------------------")
        println("------------ 1 Verificar Saldo --------------------")
        println("------------ 2 Verificar Valor Tributo ------------")
        println("Digite qualquer tecla para voltar ao Menu Principal")
        println("---------------------------------------------------")
        opcaoSubMenu = readln()
        when {
            (opcaoMenuPrincipal == "1") -> {
                when (opcaoSubMenu) {
                    "1" -> poupanca.saldoConta()
                    "2" -> poupanca.calculoTributo()
                }
            }
            (opcaoMenuPrincipal == "2") -> {
                when (opcaoSubMenu) {
                    "1" -> corrente.saldoConta()
                    "2" -> corrente.calculoTributo()
                }
            }
            (opcaoMenuPrincipal == "3") -> {
                when (opcaoSubMenu) {
                    "1" -> seguroVida.saldoConta()
                    "2" -> seguroVida.calculoTributo()
                }
            }
        }
    }

    fun redirecionamentoDoMenu() {
        while (true) {
            menuPrincipal()
            when {
                (opcaoMenuPrincipal == "1") -> subMenu()
                (opcaoMenuPrincipal == "2") -> subMenu()
                (opcaoMenuPrincipal == "3") -> subMenu()
                (opcaoMenuPrincipal == "4") -> {
                    println("Obrigado por usar nosso sistema!")
                    exitProcess(0)
                }
                else -> println("Opção inválida")
            }
            println("Retornando ao Menu Principal")
        }
    }
}