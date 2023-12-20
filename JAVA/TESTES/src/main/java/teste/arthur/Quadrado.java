package teste.arthur;

public class Quadrado implements Figura {

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public Quadrado() {
        this(0.0);
    }

    public double calcularArea() {
        return this.lado * this.lado;
    }

    public double getLado() {
        return this.lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

}
