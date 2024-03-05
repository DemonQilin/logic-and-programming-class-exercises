import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n-- PROGRAMA PARA CALCULAR DE DESCUENTOS POR COMPRAS - ALMACENES D1 --\n");

        double purchaseTotal = getPurchaseTotal();
        Day purchaseDay = getPurchaseDay();
        double purchaseDiscount = calculateDiscount(purchaseTotal, purchaseDay);

        if (purchaseDiscount > 0) {
            DecimalFormat decimalFormat = new DecimalFormat("0.00");
            decimalFormat.setRoundingMode(RoundingMode.UP);

            System.out.println("\nEl descuento para la compra es de: $ " + decimalFormat.format(purchaseDiscount));
        } else {
            System.out.println("\nLa compra no tiene descuento");
        }
    }

    private static double calculateDiscount(double purchaseTotal, Day purchaseDay) {
        if (purchaseTotal <= 100000) return 0;

        boolean achieveTheHighestDiscount = purchaseTotal >= 200000;

//      Java 12 required
        double discountPercentage = switch (purchaseDay) {
            case MONDAY, WEDNESDAY, FRIDAY -> achieveTheHighestDiscount ? 0.15 : 0.1;
            case TUESDAY, THURSDAY -> achieveTheHighestDiscount ? 0.18 : 0.12;
            case SATURDAY, SUNDAY -> achieveTheHighestDiscount ? 0.2 : 0.15;
        };

        return discountPercentage * purchaseTotal;
    }

    private static double getPurchaseTotal() {
        double total;

        Scanner input = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Ingrese el valor de la compra del cliente:");
                 total = input.nextDouble();
                if (total <= 0) {
                    System.out.println("El valor de la compra debe ser un número mayor a cero\n");
                    continue;
                };

                break;
            } catch (Exception err) {
                input.nextLine();
                System.out.println("El valor de la compra debe ser un número entero o decimal válido\n");
            }
        }

        return total;
    }

    private static Day getPurchaseDay() {
        Day day;

        Scanner input = new Scanner(System.in);

        System.out.println("\nLunes (L)\nMartes (M)\nMiercoles(W)\nJueves (J)\nViernes (V)\nSabado (S)\nDomingo (D)");

        while (true) {
            try {
                System.out.println("Ingrese la letra que corresponde al día de la compra según la lista mostrada:");
                day = Day.fromString(input.nextLine());
                break;
            } catch (Exception err) {
                System.out.println("Día invalido \n");
            }
        }

        return day;
    }
}

enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

//    Require Java 12
      public static Day fromString(String letter) throws Exception {
          return switch (letter.toUpperCase()) {
              case "L" -> Day.MONDAY;
              case "M" -> Day.TUESDAY;
              case "W" -> Day.WEDNESDAY;
              case "J" -> Day.THURSDAY;
              case "V" -> Day.FRIDAY;
              case "S" -> Day.SATURDAY;
              case "D" -> Day.SUNDAY;
              default -> throw new Exception();
          };
      }
}