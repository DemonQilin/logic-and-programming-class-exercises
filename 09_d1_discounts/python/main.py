import sys
from enum import Enum


class Day(Enum):
    MONDAY = 'MONDAY',
    TUESDAY = 'TUESDAY'
    WEDNESDAY = 'WEDNESDAY',
    THURSDAY = 'THURSDAY',
    FRIDAY = 'FRIDAY',
    SATURDAY = 'SATURDAY',
    SUNDAY = 'SUNDAY'


def get_purchase_total():
    while True:
        try:
            total = float(input('Ingrese el valor de la compra del cliente > '))
            if total <= 0:
                print('El valor de la compra debe ser un número mayor a cero\n', file=sys.stderr)
                continue
            break
        except:
            print('El valor de la compra debe ser un número entero o decimal válido', file=sys.stderr)

    return total


def get_purchase_day():
    print("\nLunes (L)\nMartes (M)\nMiercoles(W)\nJueves (J)\nViernes (V)\nSabado (S)\nDomingo (D)")

    while True:
        try:
            match input('Ingrese la letra que corresponde al día de la compra según la lista mostrada > ').lower():
                case 'l':
                    day = Day.MONDAY
                case 'm':
                    day = Day.TUESDAY
                case 'w':
                    day = Day.WEDNESDAY
                case 'j':
                    day = Day.THURSDAY
                case 'v':
                    day = Day.FRIDAY
                case 's':
                    day = Day.SATURDAY
                case 'd':
                    day = Day.SUNDAY
                case _:
                    raise Exception('Día inválido. Únicamente se aceptan: L|M|W|J|V|S|D\n')
            break
        except Exception as err:
            print(err, file=sys.stderr)

    return day


def calculate_discount(total, day):
    if total <= 100_000:
        return 0

    achieve_the_highest_discount = total >= 200_000

    match day:
        case Day.MONDAY | Day.WEDNESDAY | Day.FRIDAY:
            discount_percentage = 0.15 if achieve_the_highest_discount else 0.1
        case Day.TUESDAY | Day.THURSDAY:
            discount_percentage = 0.18 if achieve_the_highest_discount else 0.12
        case Day.SATURDAY | Day.SUNDAY:
            discount_percentage = 0.2 if achieve_the_highest_discount else 0.15

    return total * discount_percentage


def main():
    print("\n-- PROGRAMA PARA CALCULAR DE DESCUENTOS POR COMPRAS - ALMACENES D1 --\n")

    purchase_total = get_purchase_total()
    purchase_day = get_purchase_day()
    purchase_discount = calculate_discount(purchase_total, purchase_day)

    if purchase_discount > 0:
        print(f"\nEl descuento para la compra es de: ${purchase_discount:.2}")
    else:
        print("\nLa compra no tiene descuento")


if __name__ == '__main__':
    main()
