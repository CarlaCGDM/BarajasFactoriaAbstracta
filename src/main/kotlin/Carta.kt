class Carta(
    val numero:Int,
    val palo:Palo
) {

    init {
        require(numero > 0)
    }

    override fun toString(): String {
        return "${palo.nombres[numero]} de ${palo}"
    }
}

interface Palo {
    val nombres:Map<Int,String>
}

enum class PaloEspanyol:Palo {
    BASTOS,
    OROS,
    ESPADAS,
    COPAS;
    override val nombres = mapOf<Int,String>(
        1 to "As",
        2 to "Dos",
        3 to "Tres",
        4 to "Cuatro",
        5 to "Cinco",
        6 to "Seis",
        7 to "Siete",
        8 to "Ocho",
        9 to "Nueve",
        10 to "Sota",
        11 to "Caballo",
        12 to "Rey",
    )
}
enum class PaloFrances(val color:Color):Palo {
    DIAMANTES(Color.ROJO),
    PICAS(Color.NEGRO),
    TREBOLES(Color.NEGRO),
    CORAZONES(Color.ROJO);
    override val nombres = mapOf<Int,String>(
        1 to "As",
        2 to "Dos",
        3 to "Tres",
        4 to "Cuatro",
        5 to "Cinco",
        6 to "Seis",
        7 to "Siete",
        8 to "Ocho",
        9 to "Nueve",
        10 to "Diez",
        11 to "Jota",
        12 to "Reina",
        13 to "Rey"
    )
}

enum class Color {
    ROJO,
    NEGRO
}