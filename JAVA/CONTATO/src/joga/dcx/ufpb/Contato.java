package joga.dcx.ufpb;

public class Contato {
    private String nome;
    private Endereco endereco;

    public Contato(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public Contato() {
        this("", new Endereco());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String toString() {
        return "Contato de nome "+this.nome+ " e "+this.endereco.toString();
    }
}
