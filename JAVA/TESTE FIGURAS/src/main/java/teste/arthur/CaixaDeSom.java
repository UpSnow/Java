package teste.arthur;

import java.util.ArrayList;

public class CaixaDeSom {

    private ArrayList<EmissorDeSom> emissores = new ArrayList<>();

    public void adicionarEmissor(EmissorDeSom e) {
        this.emissores.add(e);
    }

    public ArrayList<EmissorDeSom> getEmissores() {
        return this.emissores;
    }

    public void tocarTodosOsEmissores() {
        for (EmissorDeSom e : emissores) {
            System.out.println(e.emitirSom());
        }
    }
}
