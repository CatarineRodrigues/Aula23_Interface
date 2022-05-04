package exerc1

class Losango: FormaGeometrica {

    private var diagonal1: Int = 0
    private var diagonal2: Int = 0
    override fun pedirTamanhos() {
        println("Insira o tamanho de uma diagonal do losango")
        diagonal1 = readln().toInt()
        println("Insira o tamanho da outra diagonal do losango")
        diagonal2 = readln().toInt()
    }

    override val areaforma: Double
        get() = diagonal1*diagonal2/2.0

    override fun calcularArea() {
        println("A área do losango vai ser $areaforma")
    }
}