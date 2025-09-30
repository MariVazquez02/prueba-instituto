import java.util.Scanner;
public class Ej7 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba una cantidad de números");
        int cantidad= sc.nextInt();
        while ( cantidad <=0) {
            System.out.println("Introducela de nuevo");
            cantidad = sc.nextInt();
        }
        double sumanum=0;
        double media=0;
        for (int i = 1; i <= cantidad; i++) {
            System.out.println("Escribe el numero" + i);
            double num = sc.nextDouble();
            sumanum+= num;

        }
        media= sumanum/cantidad;
        System.out.println("la media es" + media);
    }
}
