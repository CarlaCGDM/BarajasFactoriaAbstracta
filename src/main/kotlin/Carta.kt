class Carta(
    val numero:Int,
    val palo:Palo
) {
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
        2 to "2",
        3 to "3",
        4 to "4",
        5 to "5",
        6 to "6",
        7 to "7",
        8 to "8",
        9 to "9",
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
        2 to "2",
        3 to "3",
        4 to "4",
        5 to "5",
        6 to "6",
        7 to "7",
        8 to "8",
        9 to "9",
        10 to "10",
        11 to "Jota",
        12 to "Reina",
        13 to "Rey"
    )
}

enum class Color {
    ROJO,
    NEGRO
}