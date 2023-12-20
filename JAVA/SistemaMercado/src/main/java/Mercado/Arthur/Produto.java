package Mercado.Arthur;

import java.util.Objects;

public class Produto {

    private String nome;
    private String tipo;
    private String marca;
    private  double preco;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produtos = (Produto) o;
        return Objects.equals(nome, produtos.nome) && Objects.equals(tipo, produtos.tipo) && Objects.equals(marca, produtos.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, tipo, marca);
    }

    public Produto(String nome, String tipo, String marca, double preco){
       this.nome= nome;
       this.tipo =tipo;
       this.marca =marca;
       this.preco =preco;
   }
   public Produto(){
       this("","","",0.0);
   }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


    public String toString() {
       return   "Nome: "+this.nome +" Tipo: " +this.tipo + " Marca: " + this.marca + " Preço: " +this.preco;
    }
}
