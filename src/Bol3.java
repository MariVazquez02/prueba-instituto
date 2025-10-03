import  java.util.Scanner;
public class Bol3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num;
        long numO;
        int cifras=0;
        System.out.println("Dame un número");
        num = sc.nextInt();
        numO=num;

        while ( num != 0 ){
            num = num/10;
            cifras++;
        }


        System.out.println("El numero " + numO + " tiene "+ cifras+ " cifras");
    }
}

