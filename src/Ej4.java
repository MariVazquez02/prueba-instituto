import java.util.Scanner;
public class Ej4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        int suma = 0;
        int i;
        do {
            System.out.println("Escrbe un número positivo:");
            N= sc.nextInt();
        }while(N<0);
        for ( i = 1; i <= N; i++) {
            suma = suma +i ;
        }
        System.out.println("La suma de los " + N + " primeros números es " + suma);
    }
}
