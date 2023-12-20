package teste.arthur;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FiguraTest {

    @Test
    public void testaFiguras() {
        Figura fig1 = new Quadrado();
        Figura fig2 = new Triangulo();
        assertEquals(0.0, fig1.calcularArea());
        assertEquals(0.0, fig2.calcularArea());
    }
}
