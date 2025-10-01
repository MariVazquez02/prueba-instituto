import java.util.Scanner;
public class Bol1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        System.out.println("Escribe un numero");
        num1 = sc.nextInt();
        System.out.println("Escribe otro");
        num2= sc.nextInt();
        System.out.println("Y otro");
        num3= sc.nextInt();

        if ( num1 < num2 && num1 <num3){
            if ( num2 < num3){
                System.out.println(num1 + num2 + num3);
            }else {
                System.out.println(num1 + num3+ num2);
            }

        } else if (num2 < num1 && num2 < num3) {
            if ( num1 < num3){
                System.out.println(num2 + num1 + num3);
            }else {
                System.out.println(num2+ num3 + num1);
            }

        }else if( num3 < num2 && num3 <num1){
            if(num2 < num1){
                System.out.println(num3 + num2 + num1);
            }else {
                System.out.println(num3 + num1 + num2);
            }

        }

    }
}
