import java.util.Scanner;

  public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int numero = scanner.nextInt();

        if (numero > 0){
            System.out.println(numero +" é positivo");
        } else if ( numero < 0 ) {
            System.out.println(numero +" é negativo");
        }
        else {
            System.out.println(" o número é igual a: "+numero);
        }
    }


    }


