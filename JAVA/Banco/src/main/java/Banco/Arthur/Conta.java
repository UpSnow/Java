package Banco.Arthur;

public class Conta {
    private String cpfTitular;
    private String numeroConta;
    private String numeroAgencia;
    private double saldo;

    public Conta() {
        this("", "", "", 0.0);
    }

    public Conta(String cpf, String numC, String numAg, double saldo) {
        this.cpfTitular = cpf;
        this.numeroConta = numC;
        this.numeroAgencia = numAg;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return this.numeroConta;
    }

    public String getNumeroAgencia() {
        return this.numeroAgencia;
    }

    public String toString() {
        return "Conta número " +this.numeroConta + " do cliente de CPF "+ this.cpfTitular;
    }

    public String getCpfTitular() {
        return this.cpfTitular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setCpfTitular(String cpf) {
        this.cpfTitular = cpf;
    }

    public void setNumeroConta(String novoNumero) {
        this.numeroConta = novoNumero;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public double creditar(double valor) {
        this.saldo += valor;

        return this.saldo;
    }

    public double debitar(double valor) {
        this.saldo -= valor;
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
