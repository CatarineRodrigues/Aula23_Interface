package exerc2

class ContaPoupanca: Tributo {

    private val saldo = 1000.00
    override val tributo: Double
        get() = 0.00

    override fun saldoConta() {
        println("O saldo atual da Conta Poupança é de $saldo")
    }

    override fun calculoTributo() {
        super.calculoTributo()
    }
}