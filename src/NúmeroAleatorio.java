import java.util.Scanner;
// Si cierro el escaner no puedo volver a abrirlo
public class NúmeroAleatorio {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

    }
// Buscar un numero aleatorio sin un minimo interpuesto pero si un max
    public static int generarAleatorio(int max) {
        return (int) (Math.random() * max +1);

    }
//Buscar un numero aleatorio con un minimo interpuesto
    public static int generarAleatorio(int min, int max){
        return (int) (Math.random() * (max-min +1) +min);
    }
}
