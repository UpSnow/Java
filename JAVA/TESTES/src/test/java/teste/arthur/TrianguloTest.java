package teste.arthur;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrianguloTest {

    @Test
    public void testaConstrutor1() {
        Figura tri1 = new Triangulo();
        assertTrue(tri1.calcularArea() == 0);
    }

    @Test
    public void testaConstrutor2GetSetLado() {
        Triangulo tri2 = new Triangulo(2, 3);
        assertTrue(tri2.calcularArea() == 3);
        assertEquals(2, tri2.getBase());
        assertEquals(3, tri2.getAltura());
        tri2.setBase(6);
        assertEquals(9, tri2.calcularArea());
        assertEquals(6, tri2.getBase());

    }

}
