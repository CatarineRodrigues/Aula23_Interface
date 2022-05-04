package exerc1

class Quadrado : FormaGeometrica {

    private var lado: Int = 0
    override fun pedirTamanhos() {
        println("Insira o tamanho do lado do quadrado")
        lado = readln().toInt()
    }

    override val areaforma: Double
        get() = 2.0*lado

    override fun calcularArea() {
        println("A área do quadrado vai ser $areaforma")
    }
}