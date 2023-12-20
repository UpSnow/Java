package arthur.atrativo;

import java.util.Objects;

public class AtrativoTuristico {

    private String nome;
    private double latitude;
    private double longitude;

    private String comoChegar;
    private String cidade;
    private String estado;

    public AtrativoTuristico() {
        this("",0.0,0.0,"","","");

    }

    public AtrativoTuristico(String nome, double latitude, double longitude, String comoChegar, String cidade,
            String estado) {
        this.nome = nome;
        this.latitude = latitude;
        this.longitude = longitude;
        this.comoChegar = comoChegar;
        this.cidade = cidade;
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AtrativoTuristico that = (AtrativoTuristico) o;
        return Objects.equals(nome, that.nome) && Objects.equals(cidade, that.cidade) && Objects.equals(estado, that.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cidade, estado);
    }

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public double getLatitude() {
        return latitude;
    }


    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }


    public double getLongitude() {
        return longitude;
    }


    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }


    public String getComoChegar() {
        return comoChegar;
    }

    public void setComoChegar(String comoChegar) {
        this.comoChegar = comoChegar;
    }


    public String getCidade() {
        return cidade;
    }


    public void setCidade(String cidade) {
        this.cidade = cidade;
    }


    public String getEstado() {
        return estado;
    }


    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "AtrativoTuristico{" +
                "nome='" + nome + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", comoChegar='" + comoChegar + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
