import java.util.Scanner;
public class Ej7 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        int cantidad=0;
        int media=0;
        do {
            System.out.println("Escribe 3 numeros:");
            System.out.println("Primer número");
            n1 = sc.nextInt();


        }while (cantidad >=4);
        media = n1 /2;
        System.out.println("La media es ");
    }
}
