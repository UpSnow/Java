package arthur.atrativo;

import java.util.ArrayList;
import java.util.List;


public class TiturecoList implements TiturecoInterface {

    private List<AtrativoTuristico> atrativos;

    public TiturecoList() {
        this.atrativos = new ArrayList<>();

    }

    @Override
    public boolean cadastrarAtrativo(AtrativoTuristico atrativo) {
            if (this.atrativos.contains(atrativo)) {
                return false;
            }
            atrativos.add(atrativo);

        return true;
    }

    @Override
    public boolean apagarAtrativo(String nomeAtrativo, String cidade, String estado) {
       for(AtrativoTuristico o: atrativos){
           if(o.getNome().equals(nomeAtrativo) && o.getCidade().equals(cidade) && o.getEstado().equals(estado)){
               this.atrativos.remove(o);
               return true;

           }
       }
        return false;
    }


    public List<AtrativoTuristico> getAtrativo() {
        return this.atrativos;
    }

    @Override
    public List<AtrativoTuristico> pesquisaAtrativoDaCidade(String cidade, String estado) {
        ArrayList<AtrativoTuristico> listaDeAtrativo = new ArrayList<>();
        for(AtrativoTuristico p : atrativos){
            if (p.getCidade().equals(cidade) && p.getEstado().equals(estado)){
                listaDeAtrativo.add(p);
            }
        }
        return listaDeAtrativo;
    }

}