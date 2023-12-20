package Refeição.ufpb.br;

import java.util.Scanner;

public class Teste3 {

    public static int calculaQuantidadeAlmoco (RefeicaoRealizada [] refeicao){
        int quantidade = 0;
        for(RefeicaoRealizada l:refeicao){
            if(l.getTipoRefeicao().equals("Almoço")){
                quantidade ++;
            }
        }return quantidade;
    }

    public static boolean tipoCafe(RefeicaoRealizada [] refeicao){
        for(RefeicaoRealizada d : refeicao){
            if(d.getTipoRefeicao().equals("CAFÉ")){
                return true;
            }
        }return false;
    }


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantas refeições foram servidas hoje?");
        int quantidadeRefeicoes = Integer.parseInt(leitor.nextLine());
        RefeicaoRealizada [] refeicoes = new RefeicaoRealizada[quantidadeRefeicoes];
        for (int k = 0; k < quantidadeRefeicoes; k++) {
            System.out.println("Matrícula do(a) aluno(a) [" + (k + 1) + "]");
            String matricula = leitor.nextLine();
            System.out.println("Qual o tipo de refeição? CAFÉ, ALMOÇO ou JANTAR");
            String tipoRefeicao = leitor.nextLine();
            refeicoes[k] = new RefeicaoRealizada(matricula, tipoRefeicao);
            System.out.printf("%s\n", refeicoes[k].toString());}


// TODO: Código a acrescentar
        System.out.println("A quantidade de almoço é " + calculaQuantidadeAlmoco(refeicoes));
        if(tipoCafe(refeicoes)){
            System.out.println("teve café ");
        } else{
            System.out.println("não teve café");
        }

        System.out.printf("FIM DO PROGRAMA");
        leitor.close();
    }// fim do main
}// fim da classe Teste 3
