package teste.arthur;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuadradoTest {

    @Test
    public void testaConstrutor1() {
        Figura quad1 = new Quadrado();
        assertTrue(quad1.calcularArea() == 0);
    }

    @Test
    public void testaConstrutor2GetSetLado() {
        Quadrado quad2 = new Quadrado(5);
        assertTrue(quad2.calcularArea() == 25);
        assertEquals(5.0, quad2.getLado());
        quad2.setLado(3);
        assertEquals(9, quad2.calcularArea());
        assertEquals(3, quad2.getLado());

    }

}
