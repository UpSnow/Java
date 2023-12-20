package Mercado.Arthur;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GravadoDeProduto {

    private String ArquivoProdutos;


    public GravadoDeProduto(String ArquivoProdutos){
        this.ArquivoProdutos = ArquivoProdutos;
    }

    public GravadoDeProduto(){
        this("C:\\Users\\arthu\\OneDrive\\Área de Trabalho\\SistemaMercado\\src\\main\\resources\\ Produtos.txt");
    }
    public void gravaProdutos(List<Produto> produtos) throws IOException {
        BufferedWriter escritor = null;
        try {
            escritor = new BufferedWriter(new FileWriter(this.ArquivoProdutos));
            for(Produto p: produtos){
                String linhaDoProduto = p.getNome()+"#"+ p.getTipo()+"#"+p.getMarca()+"#"+p.getPreco();
                escritor.write(linhaDoProduto+ "\n");
            }
        } finally {
            if(escritor!= null){
                escritor.close();
            }
        }


    }

    public List<Produto> lerProdutos () throws IOException{
        BufferedReader leitor =null;
        try {
            leitor =new BufferedReader( new FileReader(this.ArquivoProdutos));
            List<Produto> lista =new ArrayList<>();
            String linhaLida = null;
            do{
                linhaLida = leitor.readLine();
                if(linhaLida!=null){
                    String [] dados =linhaLida.split("#");
                    Produto c1 = new Produto(dados[0],dados[1],dados[2],Double.parseDouble(dados[3]));
                    lista.add(c1);
                }
            } while (linhaLida!=null);
                return lista;
        }finally {
            if (leitor!=null){
                leitor.close();
            }
        }

    }


}
