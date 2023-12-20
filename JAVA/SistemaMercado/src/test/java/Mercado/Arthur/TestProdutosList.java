package Mercado.Arthur;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestProdutosList {
    @Test
    public void TestProduto() throws ProdutosJaCadastradoException, ProdutosNaoEncontradoException, ProdutoJaApagadoException {
        ProdutosList sistemaProduto = new ProdutosList();
        Produto produto = new Produto("Arroz","comida","Prato Fino",10);
        assertTrue(sistemaProduto.cadastraProdutos(produto));
        Produto p = sistemaProduto.pesquisaProdutos("Arroz","comida");
        assertEquals(produto,p);
        Produto a = sistemaProduto.apagaProdutos("Arroz","comida","Prato Fino");
        assertEquals(null,a);





    }

}
