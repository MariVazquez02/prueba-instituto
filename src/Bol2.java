import java.util.Scanner;
public class Bol2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base;
        int exponente;
        System.out.println("Dame la base");
        base = sc.nextInt();
        System.out.println("Dame el exponente");
        exponente= sc.nextInt();

        while(base < 0){
            System.out.println("Introduce la base de nuevo");
            base = sc.nextInt();
        }
        while (exponente<0){
            System.out.println("Introduce el exponente de nuevo");
            exponente = sc.nextInt();
        }

        int potencia =1;
        for (int i = 1; i <=exponente; i++) {
            potencia *=base;
        }
        System.out.println("La potencia es "+ potencia);
    }
}
