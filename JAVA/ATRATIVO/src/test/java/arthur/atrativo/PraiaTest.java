package arthur.atrativo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PraiaTest {

    @Test
    public void testeGeralPraia() {
        Praia praia1 = new Praia();
        AtrativoTuristico at = praia1;
        Praia praia2 = new Praia("Praia de Tambaú", -7.11308, -34.82138, "No final da Epitácio Pessoa", "João Pessoa",
                "PB", true, false, Praia.TIPO_ONDAS_MEDIAS);
        assertFalse(praia2.temPerigotubarao());
        assertTrue(praia2.ehPropriaParaBanho());
    }

}
