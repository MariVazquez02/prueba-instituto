import java.util.Scanner;
public class Ej9 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int perfecto=0;
        int divisor = 0;

        System.out.println("Escribe un número positivo:");
        num = sc.nextInt();

        while ( num < 0){
            System.out.println("Introduce el dato de nuevo ");
            num = sc.nextInt();
        }

        for (int i = 1; i < num; i++) {
            if ( num % i == 0) {
                i = divisor;
            }
            perfecto += divisor;
        }
        if (perfecto == num) {
            System.out.println("El numero es perfecto ");
        }else {
            System.out.println("El número no es perfecto");
        }
    }
}
