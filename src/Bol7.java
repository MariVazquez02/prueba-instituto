import  java.util.Scanner;
public class Bol7 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;
        int result=0;
        int resto=0;
        int divisor=1;
        int dividendo=1;

        System.out.println("Escribe un numero");
        n1= sc.nextInt();
        System.out.println("Escribe otro número");
        n2= sc.nextInt();
        while (n1<=0 || n2<=0){
            System.out.println("Introduce los 2 valores de nuevo");
            n1= sc.nextInt();
            n2= sc.nextInt();
        }

        if ( n1<n2){
            n1=divisor;
            n2=dividendo;
        }else{
            n2=divisor;
            n1=dividendo;
        }

        result=dividendo/divisor;
        resto=dividendo-(divisor*result);

        while( resto !=0){
            System.out.println(dividendo+":"+divisor+"="+result+" y el resto es "+resto);

        }
    }
}
