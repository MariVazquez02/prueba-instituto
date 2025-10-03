import java.util.Scanner;
public class Bol4 {
    public static final int MAX_INTENTOS =5;
    //Lo de arriba es una constante
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aleatorio= (int)(Math.random() *100 +1);
        int intentos =0;
        boolean acertado= false;
        while ( intentos < MAX_INTENTOS && !acertado){
            System.out.println("Elige un num entre 1 y 100");
            int a= sc.nextInt();
            if (a> 100 || a<1){
                System.out.println("este numero esinvalido");
            } else {
                if( aleatorio<a){
                    System.out.println("El número " +a+ "es mayor");
                } else if (aleatorio>a){}
                System.out.println("El numero " + a+ " es menor");
                }
            }
    }
}
