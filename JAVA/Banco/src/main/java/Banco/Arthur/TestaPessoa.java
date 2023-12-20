package Banco.Arthur;

import javax.swing.*;
import java.util.ArrayList;

public class TestaPessoa {
    public static void main(String[] args){
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        int k = 0;
        while(k<5){
            Pessoa pessoa =new Pessoa();
            String nome = JOptionPane.showInputDialog("coloque seu nome");
            pessoa.setnome(nome);
            int idade = Integer.parseInt(JOptionPane.showInputDialog("coloque sua idade"));
            pessoa.setIdade(idade);

            pessoas.add(pessoa);
            k++;

        }
        for(Pessoa p:pessoas){
            if(p.ehDeMaior(p.getIdade()) ){
                JOptionPane.showMessageDialog(null,p.getNome()+
                        " é de maior");
            }
            else{
                JOptionPane.showMessageDialog(null,p.getNome()+
                        " é de menor");
            }
        }


    }
}