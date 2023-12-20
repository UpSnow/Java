package arthur.atrativo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class TiturecoListTest {

    @Test
    public void testeGeralTitureco() {
        TiturecoInterface titurecoSis = new TiturecoList();
        assertTrue(titurecoSis.getAtrativo().size() == 0);
        AtrativoTuristico atrativo1 = new AtrativoTuristico("Busto de Tamandaré", -7.11904, -34.82366,
                "Epitácio Pessoa até o fim",
                "João Pessoa", "PB");
        boolean cadastrou = titurecoSis.cadastrarAtrativo(atrativo1);
        assertTrue(cadastrou);
        List<AtrativoTuristico> lista1 = titurecoSis.pesquisaAtrativoDaCidade("João Pessoa", "PB");
        assertTrue(lista1.size() == 1);
        List<AtrativoTuristico> lista2 = titurecoSis.pesquisaAtrativoDaCidade("Rio Tinto", "PB");
        assertTrue(lista2.size() == 0);
        Praia praiaDeCampina = new Praia("Praia de Campina", -6.80147, -34.91337, "Siga PB-033", "Rio Tinto",
                "PB", true, false, Praia.TIPO_ONDAS_MEDIAS);
        titurecoSis.cadastrarAtrativo(praiaDeCampina);
        lista2 = titurecoSis.pesquisaAtrativoDaCidade("Rio Tinto", "PB");
        assertEquals(1, lista2.size());
        assertEquals(2, titurecoSis.getAtrativo().size());

    }
}
