import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n--- PROGRAMA PARA CALCULAR SALARIO POR HORAS SEMANALES ---\n");

        System.out.println("Ingrese las horas trabajadas durante la semana:");
        int hours = input.nextInt();

        int salary;

        if (hours <= 48) {
            salary = hours * 15000;
        } else if (hours <= 70) {
            salary = 48 * 15000 + (hours - 48) * 18000;
        } else {
            salary = 48 * 15000 + (hours - 48) * 22000;
        }

        System.out.printf("\nTu salario para esta semana es de: $ %d%n", salary);
    }
}