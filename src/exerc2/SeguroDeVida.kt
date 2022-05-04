package exerc2

class SeguroDeVida: Tributo {

    private val saldo = 1000.00
    override val tributo: Double
        get() = 42.00

    override fun saldoConta() {
        println("O saldo atual do Seguro de Vida é de $saldo")
    }

    override fun calculoTributo() {
        super.calculoTributo()
    }
}