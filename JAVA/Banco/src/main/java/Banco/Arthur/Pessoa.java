package Banco.Arthur;

public class Pessoa {
    private String nome;
    private int idade;


    public Pessoa(String nome, int idade){
        this.nome =nome;
        this.idade =idade;
    }

    public Pessoa(){
        this("",0);
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setnome( String nome){
        this.nome =nome;
    }
    public void setIdade(int idade){
        this.idade =idade;
    }

    public String toString(){
        return "O nome é " + this.getNome() +
                " Idade é " + this.getIdade();
    }

    public boolean ehDeMaior (int idade){
        if (idade>=18){
            return true;
        }
        return false;
    }
}
