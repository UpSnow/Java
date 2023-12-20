package arthur.atrativo;

import javax.swing.*;


public class ProgramaTitureco {

    public static void main(String[] args) {
        TiturecoList sistema = new TiturecoList();
        boolean continuar = true;
        while (continuar){
            int opcao = Integer.parseInt(JOptionPane.showInputDialog(" \n 1- Cadastrar Atrativo \n 2- Pesquisar Atrativos da Cidade  \n 3- Listar Todos os Atrativos  \n 4 - Apagar Atrativo  \n " +
                    "" +
                    "5- Sair"));

            switch (opcao){
                case 1 : {
                    String opcao1 = JOptionPane.showInputDialog("Esse atrativo é praia?");
                    if (opcao1.equalsIgnoreCase("sim")) {

                        String Nome = JOptionPane.showInputDialog("Coloque o Nome do Atrativo:");
                        double Latitude = Double.parseDouble(JOptionPane.showInputDialog("Coloque a Latitude:"));
                        double Longitude = Double.parseDouble((JOptionPane.showInputDialog("Coloque a Longitude")));
                        String Cidade = JOptionPane.showInputDialog("Coloque a Cidade:");
                        String Estado = JOptionPane.showInputDialog("Coloque o Estado:");
                        String comoChegar = JOptionPane.showInputDialog("Como eu chego la?");
                        boolean propriaParaBanho = Boolean.parseBoolean(JOptionPane.showInputDialog("Esta praia é propria para banho?"));
                        boolean perigoTubarao = Boolean.parseBoolean(JOptionPane.showInputDialog("Esta praia tem tubarão? "));
                        String tipoOrla = JOptionPane.showInputDialog("Como são as ondas nessa praia?");
                        Praia p1 = new Praia(Nome,Latitude,Longitude,Cidade,Estado,comoChegar,propriaParaBanho,perigoTubarao,tipoOrla);
                        sistema.cadastrarAtrativo(p1);
                        JOptionPane.showMessageDialog(null, "Praia cadastrda");



                    }
                     else if (opcao1.equalsIgnoreCase("não")) {
                        String Nome = JOptionPane.showInputDialog("Coloque o Nome do Atrativo:");
                        double Latitude = Double.parseDouble(JOptionPane.showInputDialog("Coloque a Latitude:"));
                        double Longitude = Double.parseDouble((JOptionPane.showInputDialog("Coloque a Longitude")));
                        String Cidade = JOptionPane.showInputDialog("Coloque a Cidade:");
                        String Estado = JOptionPane.showInputDialog("Coloque o Estado:");
                        String comoChegar = JOptionPane.showInputDialog("Como eu chego la?");
                        AtrativoTuristico a1 = new AtrativoTuristico(Nome,Latitude,Longitude,Cidade,Estado,comoChegar);
                        sistema.cadastrarAtrativo(a1);
                        JOptionPane.showMessageDialog(null,"Atrativo cadastrado");

                    } else {
                        JOptionPane.showMessageDialog(null, "Digite 'sim' ou 'não'.");
                    }
                }break;

                case 2 : {
                    String Cidade = JOptionPane.showInputDialog("coloque a cidade:");
                    String Estado = JOptionPane.showInputDialog("coloque o estado:");
                    JOptionPane.showMessageDialog(null,sistema.pesquisaAtrativoDaCidade( Cidade,Estado));

                }break;

                case 3 :{
                    JOptionPane.showMessageDialog(null, sistema.getAtrativo());

                }break;

                case 4 :{
                    String Nome = JOptionPane.showInputDialog("coloque o nome do atrativo:");
                    String Cidade = JOptionPane.showInputDialog("coloque a cidade:");
                    String Estado = JOptionPane.showInputDialog("coloque o estado:");
                    boolean apagou = sistema.apagarAtrativo(Nome, Cidade, Estado);
                    if (apagou){
                        JOptionPane.showMessageDialog(null, "Atrativo apagado com sucesso!!!");
                    }else{
                        System.out.println("Atrativo Não Encontrado");
                    }
                }break;

                case 5 :{
                    continuar = false;
                }break;

                default: JOptionPane.showMessageDialog(null,"Digite um numero que Corresponde!");break;
            }
        }
    }

}