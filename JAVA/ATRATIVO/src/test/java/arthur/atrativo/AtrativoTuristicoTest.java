package arthur.atrativo;

import org.junit.Test;


import static org.junit.Assert.assertTrue;


public class AtrativoTuristicoTest {
    @Test
    public void testeGeralAtrativo() {
        AtrativoTuristico at1 = new AtrativoTuristico();
        assertTrue(at1.getNome().equals(""));

        AtrativoTuristico at2 = new AtrativoTuristico("Busto de Tamandaré", -7.11904, -34.82366,
                "Epitácio Pessoa até o fim",
                "João Pessoa", "PB");
        assertTrue(at2.getNome().equals("Busto de Tamandaré"));
    }
}