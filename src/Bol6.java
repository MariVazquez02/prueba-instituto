import java.util.Scanner;
public class Bol6 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numAl;
        double nota=0;
        int suspen=0;
        int aprob=0;
        double porcentajeA=0;
        double porcentajeB=0;

        System.out.println("Introduzca el numero de alumnos");
        numAl= sc.nextInt();

        for (int i = 1; i <=numAl; i++) {
            System.out.println("Introduzca la nota del alumno " + i);
            nota = sc.nextDouble();

            if ( nota >= 5){
                aprob++;
            }else {
                suspen++;
            }
        }

        porcentajeA= (aprob* 100)/numAl;
        porcentajeB= (suspen*100)/numAl;

        System.out.println("Han aprobado " + aprob + " y han suspendido " + suspen + " alumnos." );
        System.out.println("Ha aprobado el " + porcentajeA + "% y ha suspendido el " + porcentajeB + " %");
    }
}
