package teste.arthur;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class CaixaDeSomTest {

    @Test
    public void testaConstrutorAdicionarETocarEmissores() {
        CaixaDeSom caixa = new CaixaDeSom();
        assertTrue(caixa.getEmissores().size() == 0);
        caixa.tocarTodosOsEmissores();
        caixa.adicionarEmissor(new Tambor("M", "Giannini"));
        EmissorDeSom emissor = caixa.getEmissores().get(0);
        assertTrue(emissor instanceof Tambor);
    }

}
