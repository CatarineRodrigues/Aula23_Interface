package exerc1

class Retangulo: FormaGeometrica {

    private var lado: Int = 0
    private var altura: Int = 0
    override fun pedirTamanhos() {
        println("Insira o tamanho do lado do retângulo")
        lado = readln().toInt()
        println("Insira o tamanho da altura do retângulo")
        altura = readln().toInt()
    }

    override val areaforma: Double
        get() = 1.0*altura*lado

    override fun calcularArea() {
        println("A área do retângulo vai ser $areaforma")
    }
}