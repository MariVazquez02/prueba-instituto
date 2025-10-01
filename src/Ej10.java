import java.util.Scanner;
public class Ej10 {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num =0;

        do {
            System.out.println("introduce un numero positivo");
            if ( num <0){
                System.out.println("El numeo debe ser positivo o 0");

            }

        }while (num < 0);
        int factorial= 1;
        for (int i = 1; i < num; i++) {
            factorial*=i;
        }
        System.out.println("El factorial es " + factorial);
    }
}
