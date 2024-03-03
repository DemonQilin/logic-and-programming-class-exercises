import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\n--- PROGRAMA DE AUMENTO DE SALARIO POR CATEGORIAS ---\n");

        System.out.println("Ingresa la categoria a la que perteneces (A, B, C):");
        String category = input.readLine().toLowerCase();

        if (!category.equalsIgnoreCase("a") && !category.equalsIgnoreCase("b") && !category.equalsIgnoreCase("c")) {
            System.out.printf("La categoria \"%s\" ingresada no existe", category);
        } else {
            System.out.println("Ingresa tu salario actual:");
            double salary = Integer.parseInt(input.readLine());

            double increment_percentage;

            if (category.equalsIgnoreCase("a")) {
                increment_percentage = 0.15;
            } else if (category.equalsIgnoreCase("b")) {
                increment_percentage = 0.1;
            } else {
                increment_percentage = 0.07;
            }

            double increment = salary * increment_percentage;
            double new_salary = salary + increment;

            System.out.println("\nTu aumento será de: $ " + increment);
            System.out.println("Tu nuevo salario será de: $ " + new_salary);
        }
    }
}