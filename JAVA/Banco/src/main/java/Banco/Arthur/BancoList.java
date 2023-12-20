package Banco.Arthur;

import java.util.ArrayList;

public class BancoList {
    private String nome;
    private String cnpj;
    private ArrayList<Conta> contas;

    public BancoList(String nome, String cnpj, ArrayList<Conta> contas) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.contas = contas;
    }

    public String toString() {
        return "Banco " + this.nome + " de CNPJ " + this.cnpj + " e que tem " + this.contas.size() + " contas";
    }

    public void transferir(String numContaO, String numAgO, String numContaD, String numAgenciaD, double valor) {
        Conta ContaOrigem0 = null;
        Conta DestinatarioD = null;
        for (Conta c: contas){
            if(c.getNumeroConta().equals(numContaO) && c.getNumeroAgencia().equals(numAgO)){
                ContaOrigem0 = c;
            }if (c.getNumeroConta().equals(numContaD) && c.getNumeroAgencia().equals(numAgenciaD)){
                DestinatarioD = c;
            }if (ContaOrigem0!=null && DestinatarioD!=null){
                ContaOrigem0.debitar(valor);
                DestinatarioD.creditar(valor);
            }
        }
    }

    public void abrirConta(String cpfTitular, String numConta, String numAgencia, double saldoInicial) {
        Conta C = new Conta(cpfTitular,numConta,numAgencia,saldoInicial);
        this.contas.add(C);

    }

    public ArrayList<Conta> pesquisarContasComSaldoNegativo() {
        ArrayList<Conta> contaNegativa = new ArrayList<>();
        for(Conta c:this.contas){
            if(c.getSaldo()<0){
                contaNegativa.add(c);
            }
        }return contaNegativa;
    }

    public double consultarSaldoDeConta(String numConta, String numAgencia) {
        double saldo = 0;
        for (Conta c : this.contas) {
            if (c.getNumeroConta().equals(numConta) && c.getNumeroAgencia().equals(numAgencia)) {
                saldo = c.getSaldo();
            }
        }
        return saldo;
    }

    public double sacarDeConta(String numConta, String numAgencia, double valor) {
        for (Conta c:this.contas){
            if (c.getNumeroConta().equals(numConta) && c.getNumeroAgencia().equals(numAgencia)){
                return c.debitar(valor);
            }
        }
        return 0.0;
    }

    public double depositarEmConta(String numConta, String numAgencia, double valor) {
        for (Conta c: this.contas){
            if (c.getNumeroConta().equals(numConta) && c.getNumeroAgencia().equals(numAgencia)){
                return c.creditar(valor);
            }
        }
        return 0.0;
    }

    public ArrayList<Conta> pesquisarContasDoCliente(String cpf) {
        ArrayList<Conta> Pesquisar = new ArrayList<>();
        for (Conta c : this.contas){
            if (c.getCpfTitular().equals(cpf)){
                Pesquisar.add(c);
            }
        }
        return Pesquisar;
    }
}
