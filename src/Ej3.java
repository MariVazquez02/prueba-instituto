import java.util.Scanner;
public class Ej3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe 3 números:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == 0){
            System.out.println("Primer número fallido, intentalo de nuevo");
            a = sc.nextInt();
        }else if (a % 2 == 0){
            System.out.println(a + " es par.");
        }else {
            System.out.println(a + " es impar");
        }

        if (b == 0){
            System.out.println("Segundo número fallido, intentalo de nuevo");
            b = sc.nextInt();
        }else if (a % 2 == 0){
            System.out.println(b + " es par.");
        }else {
            System.out.println(b + " es impar");
        }

        if (c == 0){
            System.out.println("Tercer número fallido, intentalo de nuevo");
            c = sc.nextInt();
        }else if (a % 2 == 0){
            System.out.println(c + " es par.");
        }else {
            System.out.println(c + " es impar");
        }


    }
}
