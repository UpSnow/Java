import javax.swing.JOptionPane;
public class Teste {

    public static void main(String[] args){

        String nota1Str = JOptionPane.showInputDialog("coloque sua nota:");
        String nota2Str = JOptionPane.showInputDialog("coloque sua nota:");
        double nota1 = Double.parseDouble(nota1Str);
        double nota2 = Double.parseDouble(nota2Str);
        double media = (nota1 + nota2) / 2;
        System.out.println(media);
        JOptionPane.showMessageDialog(null,media);


        String peso = JOptionPane.showInputDialog("coloque seu peso:");
        String altural = JOptionPane.showInputDialog("coloque sua altura:");
        double pesod = Double.parseDouble(peso);
        double alturald = Double.parseDouble(altural);
        double resultado = pesod / (alturald * alturald);
        JOptionPane.showMessageDialog (null,resultado);
        System.out.println(resultado);


        String Compra = JOptionPane.showInputDialog("valor da compra?");
        double Compravalor = Double.parseDouble(Compra);
        String Desconto = JOptionPane.showInputDialog("valor do desconto?");
        double Descontovalor = Double.parseDouble(Desconto);
        double Valor = Compravalor - (Compravalor * Descontovalor /100);
        JOptionPane.showMessageDialog (null,Valor);
        System.out.println(Valor);

        int QuantMacas = Integer.parseInt(JOptionPane.showInputDialog("Quantidade Maçãs"));
        int QuantMamao = Integer.parseInt(JOptionPane.showInputDialog("Quantidade Mamão"));
        double Valores = QuantMacas * 1  + QuantMamao * 3.50;
        JOptionPane.showMessageDialog(null,Valores);
        System.out.println(Valores);


    }
}
