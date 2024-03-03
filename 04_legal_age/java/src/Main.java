import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\n--- PROGRAMA PARA DETERMINAR MAYORIA DE EDAD ---\n");

        System.out.println("Ingrese una edad:");
        int age = Integer.parseInt(input.readLine());

        if (age >= 18) {
            System.out.println("\nLa persona es MAYOR de edad");
        } else {
            System.out.println("\nLa persona es MENOR de edad");
        }
    }
}