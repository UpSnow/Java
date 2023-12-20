package arthur.atrativo;


public class Praia extends AtrativoTuristico {

    private boolean propriaParaBanho;
    private boolean perigoTubarao;
    private String tipoOrla;

    public static final String TIPO_PISCINAS_NATURAIS = "Piscinas Naturais";
    public static final String TIPO_ONDAS_FORTES = "Ondas Fortes";
    public static final String TIPO_ONDAS_MEDIAS = "Ondas Médias";

    public Praia(String nome, double latitude, double longitude, String comoChegar, String cidade, String estado,
            boolean propriaParaBanho, boolean perigoTubarao, String tipoOrla) {
        super (nome, latitude, longitude, comoChegar, cidade, estado);
        this.propriaParaBanho = propriaParaBanho;
        this.perigoTubarao = perigoTubarao;
        this.tipoOrla = tipoOrla;
    }

    public Praia() {
        this("",0.0,0.0,"","","",false,true,TIPO_ONDAS_FORTES);
    }

    public boolean ehPropriaParaBanho(){
        return propriaParaBanho;
    }
    public void setPropriaParaBanho(boolean ehPropriaParaBanho){
        this.propriaParaBanho = ehPropriaParaBanho;
    }

    public boolean temPerigotubarao(){
        return this.perigoTubarao;
    }
    public void setPerigoTubarao(boolean temPerigo){
        this.perigoTubarao = temPerigo;
    }
    public String getTipoOrla(){
        return tipoOrla;
    }
    public void setTipoOrla(String tipo){
        this.tipoOrla = tipo;
    }

    @Override
    public String toString() {
        return "Praia{" +"nome='" + getNome()+ '\'' +
                ", latitude=" + getLatitude() +
                ", longitude=" + getLongitude() +
                ", comoChegar='" + getComoChegar() + '\'' +
                ", cidade='" + getCidade() + '\'' +
                ", estado='" + getEstado() + '\'' +
                "propriaParaBanho=" + propriaParaBanho +
                ", perigoTubarao=" + perigoTubarao +
                ", tipoOrla='" + tipoOrla + '\'' +
                '}';
    }
}
