import java.util.Scanner;
public class Ej5 {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int numero;
        int veces= 0;
        do {
            System.out.println("Introduce un número ( ponga negativo para terminar): ");
            numero = sc.nextInt();
            if ( numero >= 0){
                veces++;
            }
        }while (numero < 0);
        System.out.println(" Has intoducido " + veces + " numeros positivos");
    }
}
