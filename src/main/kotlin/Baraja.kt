abstract class Baraja {
   var cartas:MutableList<Carta>
   var descartadas:MutableList<Carta>

    init {
        cartas = generarBaraja()
        descartadas = mutableListOf()
    }

    protected abstract fun generarBaraja():MutableList<Carta>

    fun barajar() {
        cartas.shuffle()
    }

    //cambiar para que develva
    fun siguienteCarta():Carta? {
        return if (cartas.isNotEmpty()) {
            descartadas.add(cartas.removeFirst())
            descartadas.last()
        } else {
            null
        }
    }

    fun cartasDisponibles():Int {
        return cartas.size
    }
    fun darCartas(num:Int):List<Carta>? {
        if (cartas.size >= num) {
            repeat(num) {
                descartadas.add(cartas.removeFirst())
            }
            return descartadas.takeLast(num)
        }
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