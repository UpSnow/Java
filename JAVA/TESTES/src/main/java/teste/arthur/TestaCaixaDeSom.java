package teste.arthur;

public class TestaCaixaDeSom {

    public static void main(String[] args) {
        CaixaDeSom caixa = new CaixaDeSom();
        caixa.adicionarEmissor(new Cachorro("Bob"));
        caixa.adicionarEmissor(new Tambor("P", "Giannini"));
        caixa.adicionarEmissor(new Cachorro("LUla"));
        caixa.adicionarEmissor(new Cachorro("Bob"));
        caixa.adicionarEmissor(new Tambor("g", "Buba"));
        caixa.adicionarEmissor(new Cachorro("LUla"));
        caixa.adicionarEmissor(new Tambor("m", "BoraBill"));
        caixa.tocarTodosOsEmissores();
    }

}
