package Mercado.Arthur;

import javax.swing.*;
import java.io.IOException;
import java.util.List;

public class MeusProdutos {
    public static void main (String[] args){

        SistemaMercado sistema = null;
        GravadoDeProduto gravador =new GravadoDeProduto();
        try {
            List<Produto> ProdutosRecuperados = gravador.lerProdutos();
            JOptionPane.showMessageDialog(null,"Produtos recuperados");
            sistema = new ProdutosList(ProdutosRecuperados);
        }catch (IOException e){
            sistema =new ProdutosList();
            JOptionPane.showMessageDialog(null,"Sistema iniciado sem dados");
            JOptionPane.showMessageDialog(null,"Não foi possível recuperar contatos. Detalhe do erro:"+e.getMessage());
            e.printStackTrace();
        }


        boolean continuar = true;
        while (continuar){
            String opcao = JOptionPane.showInputDialog("""
 Digite uma opção:
 1.Cadastra produto
 2.Pesquisa produto
 3.Salvar
 4.Mostra produto cadastrado
 5.Apagar
 6.sair""");

            if(opcao.equals("1")){
                String nome = JOptionPane.showInputDialog("coloque o nome do produto:");
                String tipo = JOptionPane.showInputDialog("coloque o tipo:");
                String marca= JOptionPane.showInputDialog("coloque a marca");
                try {
                    double preco = Double.parseDouble(JOptionPane.showInputDialog("coloque o preço do produto:"));
                    Produto p1 = new Produto(nome, tipo, marca, preco);
                    try {
                        sistema.cadastraProdutos(p1);
                    } catch (ProdutosJaCadastradoException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                        continue;
                    }
                }catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
                    continue;
                }
                JOptionPane.showMessageDialog(null,"produto cadastrado.");


            } else if (opcao.equals("2")) {
                String nome = JOptionPane.showInputDialog("Coloque o nome do produto:");
                String tipo = JOptionPane.showInputDialog("Coloque o tipo:");
                try{
                    Produto produto = sistema.pesquisaProdutos(nome,tipo);
                    JOptionPane.showMessageDialog(null, produto);
                }catch (ProdutosNaoEncontradoException e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }



            } else if (opcao.equals("3")) {
                try {
                    gravador.gravaProdutos(sistema.getProdutos());
                    JOptionPane.showMessageDialog(null,"Produto salvo.");
                }catch (IOException e){
                    JOptionPane.showMessageDialog(null,"Problema ao salva produto. Detalhe do erro" + e.getMessage());
                }

            } else if (opcao.equals("4")) {
                JOptionPane.showMessageDialog(null, sistema.getProdutos());

            } else if (opcao.equals("5")) {
                String nome = JOptionPane.showInputDialog("Coloque o nome do produto:");
                String tipo = JOptionPane.showInputDialog("Coloque o tipo:");
                String marca= JOptionPane.showInputDialog("Coloque a marca");
                try {
                    sistema.apagaProdutos(nome,tipo,marca);
                    JOptionPane.showMessageDialog(null,"Produto apagado");
                }catch (ProdutoJaApagadoException e){
                    JOptionPane.showMessageDialog(null,"Produto ja apagado");
                }


            }else if (opcao.equals("6")){
                continuar = false;
            } else {
                JOptionPane.showMessageDialog( null,"Opção invalida. Tente de novo");
            }
        }
        JOptionPane.showMessageDialog(null,"Atè mais");

    }
}
