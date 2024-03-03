import java.util.Scanner;

public class Main {
    private static final double INCREMENT_PERCENTAGE = 0.1;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n--- PROGRAMA PARA AUMENTAR EL SALARIO ---\n");

        System.out.println("Ingresa tu salario actual:");
        double salary = input.nextInt();

        System.out.println("Ingresa el salario base:");
        double base = input.nextInt();

        if (salary < 2 * base) {
            double increase = salary * INCREMENT_PERCENTAGE;
            double new_salary = salary + increase;

            System.out.println("\nTu aumento será de: $ " + increase);
            System.out.println("Tu nuevo salario será de: $ " + new_salary);
        } else {
            System.out.println("\nNo tienes derecho a un aumento");
        }
    }
}