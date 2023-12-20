package Banco.Arthur;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContaTest {
    @Test
    public void testaGetSetCpfTitular() {
        Conta c = new Conta("111.111.111-11", "222-2", "333-3", 100);
        assertEquals("111.111.111-11", c.getCpfTitular());
        c.setCpfTitular("777.777.777-77");
        assertEquals("777.777.777-77", c.getCpfTitular());
    }

    @Test
    public void testaGetSetNumeroConta() {
        Conta c = new Conta("111.111.111-11", "222-2", "333-3", 100);
        assertEquals("222-2", c.getNumeroConta());
        c.setNumeroConta("999-9");
        assertEquals("999-9", c.getNumeroConta());
    }

    @Test
    public void testaToString(){
        Conta c = new Conta("111.111.111-11", "222-2", "333-3", 100);
        String mensagemEsperada = "Conta número 222-2 do cliente de CPF 111.111.111-11";
        assertEquals(mensagemEsperada, c.toString());
    }

    @Test
    public void testaCreditarEGetSaldo(){
        Conta c2 = new Conta("111.111.111-11", "222-2", "333-3", 1000);
        assertEquals(1000, c2.getSaldo());
        double novoSaldo = c2.creditar(100);
        assertEquals(1100, novoSaldo);
        assertEquals(1100, c2.getSaldo());
    }

    @Test
    public void testaDebitarEGetSaldo(){
        Conta c3 = new Conta("111.111.111-11", "222-2", "333-3", 10);
        assertEquals(10, c3.getSaldo());
        double novoSaldo = c3.debitar(6);
        assertEquals(4, novoSaldo);
        assertEquals(4, c3.getSaldo());
    }

}
