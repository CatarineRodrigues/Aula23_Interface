package exerc2

class ContaCorrente: Tributo {

    private val saldo = 1000.00
    override val tributo: Double
        get() = saldo*0.01

    override fun saldoConta() {
        println("O saldo atual da Conta Corrente é de $saldo")
    }

    override fun calculoTributo() {
        super.calculoTributo()
    }
}