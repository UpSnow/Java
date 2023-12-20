package teste.arthur;

public class Tambor implements EmissorDeSom {

    private String tamanho;
    private String marca;

    public Tambor(String tamanho, String marca) {
        this.tamanho = tamanho;
        this.marca = marca;
    }

    public Tambor() {
        this("", "");
    }

    public String getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String emitirSom() {
        return "tum tum";
    }
}
