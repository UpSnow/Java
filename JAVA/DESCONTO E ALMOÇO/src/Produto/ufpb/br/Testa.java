package Produto.ufpb.br;
import java.util.Scanner;

public class Testa {

    public static double calculaSomatorioDescontos (Produto[] produtos){
        double  soma1= 0.0;
        double soma2 = 0.0;
        for( Produto h: produtos){
            double j =h.getPreco();
            soma2+= j;
            soma1 += ProgramaDescontos.calculaValorComDesconto(j);

        }
        return soma2-soma1;
    }

    public static String  verificaProdutoComMaiorDesconto (Produto[] produtos){
        if(produtos.length == 0){
            return "não há produtos na lista";
        }else{
            String nomeProdutoMaiorDesconto = produtos[0].getNome();
            double maiorDesconto = produtos[0].getPreco();
            if(maiorDesconto <50){
                maiorDesconto = 0.0;
            }else if(maiorDesconto<100){
                maiorDesconto *= 0.05;
            }else{
                maiorDesconto *= 0.10;
            }
            for (Produto w:produtos){
                double descontoAtual = w.getPreco();
                if(descontoAtual<50){
                    descontoAtual =0.0;
                }else if(descontoAtual<100){
                    descontoAtual*=0.05;
                }else{
                    descontoAtual*=0.10;
                }
                if(descontoAtual>maiorDesconto){
                    descontoAtual = maiorDesconto;
                    nomeProdutoMaiorDesconto = w.getNome();
                }
            }
            return nomeProdutoMaiorDesconto;
        }
    }


    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos produtos você quer comprar?");
        int quant = Integer.parseInt(leitor.nextLine());
        Produto [] produtos = new Produto [quant];
        for (int k=0; k<quant; k++){
            Produto p = new Produto();
            System.out.println("Qual o nome do produto?");
            p.setNome(leitor.nextLine());
            System.out.println("Qual o preço original do produto?");
            p.setPreco(Double.parseDouble(leitor.nextLine()));
            double valorComDesconto = ProgramaDescontos.calculaValorComDesconto(p.getPreco());
            System.out.printf("O valor a pagar pelo produto é R$ %.2f\n",valorComDesconto);
            produtos[k] = p;
        }
        System.out.println("SOMA DOS DESCONTOS: " + ProgramaDescontos.calculaSomatorioDescontos(produtos));
        System.out.println("Produto com maior desconto:" + ProgramaDescontos.verificaProdutoComMaiorDesconto3(produtos));
        leitor.close();

    }

}
