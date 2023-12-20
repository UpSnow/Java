package Banco.Arthur;


import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.ArrayList;

public class BancoListTest {
    @Test
    public void testaConsultarSaldoDeConta(){
        BancoList meuBanco = new BancoList("Ayla's Bank", "123/321", new ArrayList<Conta>());
        meuBanco.abrirConta("111.111.111-11", "222-2", "333-3", 100);
        assertEquals(100, meuBanco.consultarSaldoDeConta("222-2", "333-3"));
    }

    @Test
    public void testaTransferir(){
        BancoList meuBanco = new BancoList("Ayla's Bank", "123/321", new ArrayList<Conta>());
        meuBanco.abrirConta("111.111.111-11", "222-2", "333-3", 100);
        meuBanco.abrirConta("333.333.333-33", "111-1", "555-5", 100);
        assertEquals(100, meuBanco.consultarSaldoDeConta("222-2", "333-3"));
        assertEquals(100, meuBanco.consultarSaldoDeConta("111-1", "555-5"));
        meuBanco.transferir("222-2","333-3","111-1","555-5",30);
        assertEquals(70, meuBanco.consultarSaldoDeConta("222-2", "333-3"));
        assertEquals(130, meuBanco.consultarSaldoDeConta("111-1", "555-5"));
    }

    @Test
    public void testaToString(){
        BancoList meuBanco = new BancoList("Ayla's Bank", "123/321", new ArrayList<Conta>());
        assertEquals(true, meuBanco.toString().startsWith("Banco Ayla's Bank"));
    }

    @Test
    public void testarDepositarEmConta(){
        BancoList meuBanco = new BancoList("Ayla's Bank", "123/321", new ArrayList<Conta>());
        meuBanco.abrirConta("111.111.111-11", "222-2", "333-3", 100);
        assertEquals(100, meuBanco.consultarSaldoDeConta("222-2", "333-3"));
        meuBanco.depositarEmConta("222-2","333-3", 300);
        assertEquals(400, meuBanco.consultarSaldoDeConta("222-2", "333-3"));
    }
    @Test
    public void testaContasComSaldoNegativo(){
        BancoList meuBanco = new BancoList("Ayla's Bank", "123/321", new ArrayList<Conta>());
        meuBanco.abrirConta("111.111.111-11", "222-2", "333-3", 100);
        meuBanco.abrirConta("111.111.111-11", "555-5", "333-3", 1000);
        meuBanco.abrirConta("888.888.888-88", "444-4", "333-3", 10);
        assertEquals(100, meuBanco.consultarSaldoDeConta("222-2", "333-3"));
        meuBanco.sacarDeConta("444-4", "333-3", 100.0);
        meuBanco.sacarDeConta("222-2", "333-3", 102.0);
        ArrayList<Conta> contasNeg = meuBanco.pesquisarContasComSaldoNegativo();
        assertEquals(2, contasNeg.size());
        assertEquals(-2, meuBanco.consultarSaldoDeConta("222-2", "333-3"));
        assertEquals(-90, meuBanco.consultarSaldoDeConta("444-4", "333-3"));

    }
}
