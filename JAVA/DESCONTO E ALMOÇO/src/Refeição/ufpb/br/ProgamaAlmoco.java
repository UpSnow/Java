package Refeição.ufpb.br;

import javax.swing.*;

public class ProgamaAlmoco {
    public static void main(String[] args){
        int  tipo = Integer.parseInt(JOptionPane.showInputDialog("coloque a quantidade"));
        double preco =Double.parseDouble(JOptionPane.showInputDialog("coloque o preço:"));
        double TipoPreco = tipo*preco;
        System.out.println("valor gasto pelo RU " + TipoPreco);
    }
}
