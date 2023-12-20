package Produto.ufpb.br;
import java.util.Scanner;

public class ProgramaDescontos {



    public static double calculaSomatorioDescontos(Produto [] produtos){
        double a = 0.0;
        for(int k=0; k<produtos.length; k++){
            double s= produtos[k].getPreco();
            double q = 0.0;
            if(s >= 50 && s<100){
                q = 0.05*s;
            }
            else if (s>=100){
                q =  0.10*s;
            }
            a+=q;

    }
        return a;


}
    public static double calculaDescontoEmProduto(Produto p){
        if (p.getPreco()<50){
            return 0.0;
        } else if (p.getPreco()<100){
            return p.getPreco()*0.05;
        } else {
            return p.getPreco()*0.10;
        }
    }



    public static String verificaProdutoComMaiorDesconto3 (Produto[] produtos){
        if (produtos.length==0){
            return "Não há produtos na lista";
        } else {
            String nomeProdutoMaiorDesconto = produtos[0].getNome();
            double maiorDesconto = calculaDescontoEmProduto(produtos[0]);
            for (int k=1; k< produtos.length; k++){
                double descontoAtual = calculaDescontoEmProduto(produtos[k]);
                if (descontoAtual> maiorDesconto){
                    maiorDesconto = descontoAtual;
                    nomeProdutoMaiorDesconto = produtos[k].getNome();
                }
            }
            return nomeProdutoMaiorDesconto;
        }
    }


    public static double calculaValorComDesconto(double valorProduto) {
        if (valorProduto < 50) {
            return (valorProduto);
        } else if (valorProduto < 100) {
            return (valorProduto - (valorProduto * 0.05));
//5% de desconto se valor entre 50 e 100 (sem incluir 100)
        } else {
            return (valorProduto - (valorProduto * 0.10));
//10% de desconto
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
            double valorComDesconto =
                    calculaValorComDesconto(p.getPreco());
            System.out.printf("O valor a pagar pelo produto é R$ %.2f\n",valorComDesconto);
            produtos[k] = p;
        }
        System.out.println(verificaProdutoComMaiorDesconto3(produtos));

        leitor.close();
    }



}

