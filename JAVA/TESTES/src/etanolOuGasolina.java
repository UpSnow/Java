import java.util.Scanner;
//Escolher entre etanol ou gasolina
public class etanolOuGasolina {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Para quantos postos será a pesquisa? ");
        int Quantidade = Integer.parseInt(leitor.nextLine());
        for(int k=0; k<Quantidade; k++) {
            System.out.println("como é o nome do posto?");
            String Nome = leitor.nextLine();
            System.out.println("Qual o preço do litro de gasolina?");
            double gasolina = Double.parseDouble(leitor.nextLine());
            System.out.println("Qual o preço do litro do etanol?");
            double etanol = Double.parseDouble(leitor.nextLine());
            if(etanol < 0.70 * gasolina){
                System.out.println("melhor abastecer com etanol");
            } else{
                System.out.println("melhor abastecer com gasolina");

            }
        }
        System.out.println("fim do programa");
        leitor.close();

    }

}
