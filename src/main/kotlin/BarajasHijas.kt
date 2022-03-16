class BarajaEspanyola(
    var completa:Boolean = false
): Baraja() {

    override fun generarBaraja():MutableList<Carta> {
        var numeros:List<Int>
        when (completa) {
            true -> numeros = (1..12).toList()
            false -> numeros = (1..12).minus(listOf(8,9))
        }
        var cartas = mutableListOf<Carta>()
        for (palo in PaloEspanyol.values()) {
            for (numero in numeros) {
                cartas += Carta(numero,palo)
            }
        }
        return cartas
    }
}

class BarajaFrancesa():Baraja() {
    override fun generarBaraja(): MutableList<Carta> {
        var cartas = mutableListOf<Carta>()
        for (palo in PaloFrances.values()) {
            for (numero in 1..13) {
                cartas += Carta(numero,palo)
            }
        }
        return cartas
    }
    fun cartaRoja(carta:Carta): Boolean {
        return if (carta.palo in PaloFrances.values().filter { it.color == Color.ROJO }) true else false
    }
    fun cartaNegra(carta:Carta): Boolean {
        return if (carta.palo in PaloFrances.values().filter { it.color == Color.NEGRO }) true else false
    }
}