import java.util.Scanner;

public class Main {
    // INICIO
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--PROGRAMA PARA LA SUMA DE DOS NUMEROS--\n");

        System.out.println("Ingrese el valor del primer numero:");
        int first_number = input.nextInt();

        System.out.println("Ingrese el valor del segundo numero:");
        int second_number = input.nextInt();

        int total = first_number + second_number;

        System.out.println("\nLa suma de los numeros es: " + total);
    }
    // FIN
}