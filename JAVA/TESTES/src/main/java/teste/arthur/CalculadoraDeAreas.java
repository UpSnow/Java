package teste.arthur;

import java.util.ArrayList;

public class CalculadoraDeAreas {

    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(new Quadrado(2.0));
        figuras.add(new Triangulo(1000.0, 100.0));
        figuras.add(new Quadrado(4.0));
        figuras.add(new Triangulo(40.0, 70.0));

        double areaTotal = 0.0;
        for (Figura f : figuras) {
            System.out.println(f.calcularArea());
            areaTotal += f.calcularArea();
        }
        System.out.printf("Área total: %.1f\n", areaTotal);
    }
}
