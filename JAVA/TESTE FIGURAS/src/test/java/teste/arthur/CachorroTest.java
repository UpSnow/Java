package teste.arthur;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CachorroTest {

    @Test
    public void testaConstrutor() {
        Cachorro c1 = new Cachorro("Bob");
        assertTrue(c1.emitirSom() != null && !c1.emitirSom().equals(("")));
    }

    @Test
    public void testaGetSet() {
        Cachorro c2 = new Cachorro("Bidu");
        assertTrue(c2.getNome().equals("Bidu"));
        c2.setNome("Pingo");
        assertEquals("Pingo", c2.getNome());
    }

}
