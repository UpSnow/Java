package teste.arthur;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmissorDeSomTest {

    @Test
    public void testaEmissores() {
        EmissorDeSom e1 = new Tambor("M", "Giannini");
        EmissorDeSom e2 = new Cachorro("Bob");
        assertTrue(e1.emitirSom() != null && !e1.emitirSom().equals(""));
        assertTrue(e2.emitirSom() != null && !e2.emitirSom().equals(""));
    }
}
