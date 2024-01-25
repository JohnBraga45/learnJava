import java.util.Random;

  public class Main {
    public static void main(String[] args) {
        Random generate = new Random();
//        Usando while
//        int i =0;
//        while (i < 6 ){
//
//            int number = generate.nextInt(10);
//            System.out.println(number);
//            i++;
//
//        }
        //usando for
        for (int i = 0; i < 6; i++ ){
        int number = generate.nextInt(10);
            System.out.println(number);
        }
        }


    }


