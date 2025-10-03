import java.util.Scanner;
public class Bol5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int divisores=0;

        System.out.println("Introduce un numero primo");
        num = sc.nextInt();
// si el numero es par no va a ser primo por lo que sera mas facil de encontrar
        for (int i = 1; i <=num ; i++) {
            if(num % i ==0){
                divisores++;
            }
        }
        if ( divisores == 2){
            System.out.println("El número " + num + " es primo");
        }else {
            System.out.println("El número " + num + " no es primo");
        }

    }
}
