import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n-- PROGRAMA PARA ENTREGAR SUBSIDIOS A ESTUDIANTES --\n");

        System.out.println("Ingrese el estrado del estudiante:");
        int estrato = input.nextInt();

        if (estrato <= 0) {
            System.err.println("\nEl estrato no puede ser negativo o cero");
            return;
        } else if (estrato > 6) {
            System.err.println("\nEl estrato no puede ser mayor a 6");
            return;
        }

        System.out.println("Ingrese el promedio del estudiante:");
        double average = input.nextDouble();

        if (average < 0) {
            System.err.println("\nEl promedio no puede ser negativo");
            return;
        } else if (average > 5) {
            System.err.println("\nEl promedio no puede ser mayor a 5");
            return;
        }

        int subsidio = 0;

        if ((estrato == 1 || estrato == 2) && average >= 4.0) {
            subsidio = 100000;
        } else if (estrato == 3 && average > 4.0) {
            subsidio = 80000;
        } else if (estrato > 3 && average > 4.5) {
            subsidio = 50000;
        } else {
            System.out.println("\nEl estudiante no cumple con las condiciones para recibir un subsidio");
            return;
        }

        System.out.println("\nEl subsidio para el estudiante es: $ " + subsidio);
    }
}
