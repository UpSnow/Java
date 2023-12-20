import java.util.Scanner;
//Calcular preço da gasolina
public class calcularGasolina {
    public static void main(String[] args){
        System.out.println("Calcular gasolina");
        Scanner leitor = new Scanner(System.in);
        double Valor = 0;
        double menoValor = 0;
        int quantidade = 3;
        double [] valorDados = new double[quantidade];
        for( int k=0; k<quantidade; k++){
            System.out.println("quantos litros?");
            double litro = Double.parseDouble(leitor.nextLine());
            System.out.println("valor da gasolina:");
            double gasolina = Double.parseDouble(leitor.nextLine());
            double soma = (litro*gasolina);
            Valor +=soma;
            valorDados[k]=soma;
            if(soma < menoValor || menoValor==0){
                menoValor = soma;

            }

        }


        System.out.println(Q(valorDados));// Menor valor pela função
        System.out.printf("meno valor:%.2f\n",menoValor);
        System.out.printf("media: %.2f\n",Valor/3);



        leitor.close();
    }
    //
    public static double Q (double [] numero){
       double g = 0;
       for (int k = 0; k<numero.length; k++){
           if( numero[k] < g || g==0 ){
                g = numero[k];

            }

        }return g;

    }

}





