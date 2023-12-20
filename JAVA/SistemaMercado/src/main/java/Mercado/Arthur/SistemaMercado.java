package Mercado.Arthur;

import java.util.List;

public interface SistemaMercado {
    boolean cadastraProdutos(Produto produtos) throws ProdutosJaCadastradoException;
    Produto pesquisaProdutos(String nome, String tipo) throws ProdutosNaoEncontradoException;
    Produto apagaProdutos (String nome,String tipo,String marca) throws ProdutoJaApagadoException;
    List<Produto> getProdutos();


}
