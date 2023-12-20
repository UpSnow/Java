package joga.dcx.ufpb;

import javax.swing.JOptionPane;

public class ProgramaAgenda {
        public static void main(String[] args) {
            int maxContatos = 1000;
            AgendaEnderecos agenda = new AgendaEnderecos(maxContatos);
            boolean sair = false;
            while (!sair) {
                int opcao = Integer.parseInt(JOptionPane.showInputDialog(
                        "Digite uma opção:\n1.Cadastrar contato\n"
                                + "2.Pesquisa endereço\n"
                                + "3.Pesquisa número de contatos do bairro\n"
                                + "4.Apaga contato\n5.Sair\n"));
                switch (opcao) {
                    case 1:
                        String nome = JOptionPane.showInputDialog("Qual o nome?");
                        String logradouro = JOptionPane.showInputDialog("Qual o logradouro (Rua, Av...)?");
                        String numero = JOptionPane.showInputDialog("Qual o número?");
                        String bairro = JOptionPane.showInputDialog("Qual o bairro?");
                        String regiao = JOptionPane.showInputDialog("qual é a região?");
                        Endereco end = new Endereco(logradouro, numero, bairro,"João Pessoa", "Paraíba",regiao);
                        Contato c = new Contato(nome, end);
                        agenda.cadastraContato(c);
                        break;
                    case 2:
                        String nomeContato = JOptionPane.showInputDialog("Qual o nome do contato?");
                        Endereco enderecoAchado = agenda.pesquisaEndereco(nomeContato);
                        if (enderecoAchado != null) {
                            JOptionPane.showMessageDialog(null, enderecoAchado.toString());
                        } else {
                            JOptionPane.showMessageDialog(null, "Contato não encontrado");
                        }
                        break;
                    case 3:
                        String nomeBairro = JOptionPane.showInputDialog("Qual bairro?");
                        int numContatosBairro = agenda.pesquisarQuantidadeDeContatosDoBairro(nomeBairro);
                        JOptionPane.showMessageDialog(null, "Quantidade:" + numContatosBairro);
                        break;
                    case 4:
                        String nomeContatoApagar = JOptionPane.showInputDialog("Qual o nome do contato?");
                        boolean apagou = agenda.apagaContato(nomeContatoApagar);
                        if (apagou) {
                            JOptionPane.showMessageDialog(null, "Contato removido com sucesso");
                        } else {
                            JOptionPane.showMessageDialog(null, "Falha: Contato não encontrado.");
                        }
                        break;
                    case 5:
                        sair = true;
                        break;
                    case 6:
                }


            }
            JOptionPane.showMessageDialog(null, "Até mais!");
        }
    }

