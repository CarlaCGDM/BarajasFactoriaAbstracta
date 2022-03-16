abstract class Baraja {
    var cartas:MutableList<Carta>
    var descartadas = mutableListOf<Carta>()

    init {
        cartas = generarBaraja()
    }

    protected abstract fun generarBaraja():MutableList<Carta>

    fun barajar() {
        cartas.shuffle()
    }
    fun siguienteCarta():Carta? {
        return if (cartas.isNotEmpty()) {cartas.first()} else {println("No quedan más cartas."); null}
    }
    fun cartasDisponibles():Int {
        return cartas.size
    }
    fun darCartas(num:Int):List<Carta>? {
        if (cartas.size >= num) {
            repeat(num) {
                descartadas.add(0,cartas.removeFirst())
            }
            return descartadas.take(num)
        }
        println("No quedan suficientes cartas.")
        return null
    }
    fun cartasMonton():List<Carta> {
        return descartadas
    }
    fun mostrarBaraja():List<Carta>{
        return cartas
    }
    override fun toString(): String {
        return "Baraja(\ncartas=$cartas\ndescartadas=$descartadas\n)"
    }
}