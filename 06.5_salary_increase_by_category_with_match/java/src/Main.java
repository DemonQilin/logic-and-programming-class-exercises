import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;


public class Main {
    private static final List<String> CATEGORIES = Arrays.asList("a","b","c");

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\n--- PROGRAMA DE AUMENTO DE SALARIO POR CATEGORIAS ---\n");

        System.out.println("Ingresa la categoria a la que perteneces (A, B, C):");
        String category = input.readLine();

        double increment_percentage = 0;

        try {
            increment_percentage = switch (category) {
                case "a", "A" -> 0.15;
                case "b", "B" -> 0.1;
                case "c", "C" -> 0.07;
                default -> {
                    throw new IllegalArgumentException(String.format("La categoria \"%s\" ingresada no existe", category));
                }
            };
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }

        System.out.println("Ingresa tu salario actual:");
        double salary = Integer.parseInt(input.readLine());

        double increment = salary * increment_percentage;
        double new_salary = salary + increment;

        System.out.println("\nTu aumento será de: $ " + increment);
        System.out.println("Tu nuevo salario será de: $ " + new_salary);
    }
}