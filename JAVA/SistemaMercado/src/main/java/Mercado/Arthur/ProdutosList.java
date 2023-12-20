package Mercado.Arthur;

import java.util.ArrayList;
import java.util.List;

public class ProdutosList  implements SistemaMercado{

    private List<Produto> produtos;

    public ProdutosList (){
        this.produtos = new ArrayList<>();

    }
    public ProdutosList (List<Produto> listaInicial){
        this.produtos = listaInicial;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    @Override
    public boolean cadastraProdutos(Produto produtos) throws ProdutosJaCadastradoException {
        if(this.produtos.contains(produtos)){
            throw new ProdutosJaCadastradoException("Esse produto já foi cadastrado." + produtos.getNome()+
                    produtos.getTipo() + produtos.getMarca());
        }else{
            this.produtos.add(produtos);
            return true;
        }

    }

    public Produto pesquisaProdutos(String nome, String tipo ) throws ProdutosNaoEncontradoException {
        for(Produto p: produtos){
            if(p.getNome().equals(nome) && p.getTipo().equals(tipo)){
                return p;
            }
        }
         throw new ProdutosNaoEncontradoException("Esse produto não foi encontrado." + "nome:" + nome
                 + "tipo:" +tipo) ;
    }


    public Produto apagaProdutos(String nome, String tipo, String marca) throws ProdutoJaApagadoException {
        for (Produto p: produtos){
           if (p.getNome().equals(nome) && p.getTipo().equals(tipo) && p.getMarca().equals(marca)){
               this.produtos.remove(p);
               return null;
           }
       }
        throw new ProdutoJaApagadoException("Esse produto ja foi apagado") ;

    }

}
