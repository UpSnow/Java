package teste.arthur;

public class Cachorro implements EmissorDeSom {
    private String nome;

    public Cachorro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String emitirSom() {
        return "au au";
    }
}
