import java.util.Scanner;

public class Beecrowd {

            public static void main(String[] args) {
                System.out.println("Ver numeros primos");
                Scanner leitor = new Scanner(System.in);
                System.out.println("Quantidade de repetições");
                int repeticao = Integer.parseInt(leitor.nextLine());
                for (int k = 0; k<repeticao; k++ ){
                    System.out.println("Coloque um numero.");
                    int num =Integer.parseInt(leitor.nextLine());
                    boolean ehPrimo=  true;
                    for (int j = 2; j<num; j++){
                        if(num %  j == 0){
                            ehPrimo= false;
                            break;
                        }
                    }if (ehPrimo) {
                        System.out.printf("ehPrimo %d\n", num);
                    }else{
                        System.out.printf("não é ehPrimo %d\n", num);
                    }

                }leitor.close();
            }
            }

