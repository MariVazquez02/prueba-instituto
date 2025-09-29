import java.util.Scanner;
public class Ej3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("A continuación, escriba 3 números: ");
        int n1;
        do {
            System.out.println("Escriba el primer número");
             n1 = sc.nextInt();
        }while (n1 <=0 );
        if (n1 % 2 == 0) {
            System.out.println("Es par.");
        }else {
            System.out.println( "Es impar");
        }
        int n2;
        do {
            System.out.println("Escriba el segundo número");
            n2 = sc.nextInt();
        }while (n2 <=0 );
        if (n2 % 2 == 0) {
            System.out.println("Es par.");
        }else {
            System.out.println("Es impar");
        }
        int n3;
        do {
            System.out.println("Escriba el tercer número");
            n3 = sc.nextInt();
        }while (n3 <=0 );
        if (n3 % 2 == 0) {
            System.out.println("Es par.");
        }else {
            System.out.println("Es impar");
        }
    }
}
