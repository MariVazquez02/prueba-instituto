import java.util.Scanner;
public class Ej2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número del 1 al 10");
        int num= sc.nextInt();
        if (num < 1 || num>10) {
            System.err.println("No es un número del 1 al 10");
            } else {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + "*" + num + "=" + num* i );
        }
    }
    }
}
