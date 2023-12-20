package Banco.Arthur;

import java.util.ArrayList;

public class TestaBanco {
    public static void main(String[] args){
        BancoList meuBanco = new BancoList("Arthur Inter", "256/983", new ArrayList<>());
        meuBanco.abrirConta("111.111.111-11", "222-2", "333-3", 100);
        System.out.println(meuBanco.consultarSaldoDeConta("222-2","333-3"));
        meuBanco.abrirConta("333.333.333-33", "111-1", "333-3", 200);
        meuBanco.transferir("222-2","333-3","111-1","333-3",100);
        System.out.println(meuBanco.consultarSaldoDeConta("111-1","333-3"));
        ArrayList<Conta> contasSaldoNegativo = meuBanco.pesquisarContasComSaldoNegativo();
        for (Conta c: contasSaldoNegativo){
            System.out.println(c);
        }

    }

}