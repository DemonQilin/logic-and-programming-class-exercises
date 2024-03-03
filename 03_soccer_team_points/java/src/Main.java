import java.util.Scanner;

public class Main {
    private static final int POINTS_FOR_WIN = 3;
    private static final int POINTS_FOR_LOST = 0;
    private static final int POINTS_FOR_TIE = 1;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--PROGRAMA PARA CALCULAR PUNTOS DE UN EQUIPO DE FUTBOL--\n");

        System.out.println("Ingrese el nombre del equipo:");
        String team_name = input.nextLine();

        System.out.println(String.format("Ingrese la cantidad de partidos ganados por %s:", team_name));
        int win = input.nextInt();

        System.out.println(String.format("Ingrese la cantidad de partidos perdidos por %s:", team_name));
        int lost = input.nextInt();

        System.out.println(String.format("Ingrese la cantidad de partidos empatados por %s:", team_name));
        int ties = input.nextInt();

        int total = win * POINTS_FOR_WIN + lost * POINTS_FOR_LOST + ties * POINTS_FOR_TIE;

        System.out.println("\nEl equipo " + team_name + " tiene un total de " + total + " puntos");
    }
}