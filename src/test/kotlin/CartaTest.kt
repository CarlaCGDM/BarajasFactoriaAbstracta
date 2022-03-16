import org.junit.Test
import kotlin.test.assertEquals

internal class CartaTest {
    @Test
    fun testToString() {
        val c1 = Carta(1,PaloEspanyol.ESPADAS)
        val c2 = Carta(12,PaloEspanyol.ESPADAS)
        val c3 = Carta(13,PaloFrances.PICAS)
        val c4 = Carta(6,PaloFrances.CORAZONES)
        assertEquals(c1.toString(), "As de ESPADAS")
        assertEquals(c2.toString(), "Rey de ESPADAS")
        assertEquals(c3.toString(), "Rey de PICAS")
        assertEquals(c4.toString(),"Seis de CORAZONES")
    }

    @Test (expected = IllegalArgumentException::class)
    fun testNumeroNegativo() {
        val c1 = Carta(-5,PaloEspanyol.OROS)
    }
}