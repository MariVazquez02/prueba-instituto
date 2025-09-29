import java.util.Scanner;
public class Ej6 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A;
        int B;
        int producto=0;
        System.out.println("Escriba un número");
        A= sc.nextInt();
        System.out.println("Escribe otro número");
        B= sc.nextInt();
        for (int i = 1; i <= B; i++) {
            producto= A + producto;
        }
        System.out.println(A + "*" + B + "=" + producto);
    }
}
