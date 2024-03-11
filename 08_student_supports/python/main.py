import sys

if __name__ == '__main__':
    print("\n-- PROGRAMA PARA ENTREGAR SUBSIDIOS A ESTUDIANTES --\n")

    social_class = int(input("Ingrese el estrato del estudiante > "))

    if 1 <= social_class <= 6:
        grade = float(input("Ingrese el promedio del estudiante > "))

        if 0 <= grade <= 5:
            support = 0

            if (social_class == 1 or social_class == 2) and grade >= 4:
                support = 100000
            elif social_class == 3 and grade > 4:
                support = 80000
            elif social_class > 3 and grade > 4.5:
                support = 50000

            if support > 0:
                print(f"\nEl subsidio para el estudiante es: $ {support}")
            else:
                print(f"\nEl estudiante no cumple con las condiciones para recibir un subsidio")

        else:
            print("\nEl promedio debe ser un número entre 0 y 5", file=sys.stderr)
    else:
        print("\nEl estrato debe ser un número entre 1 y 6", file=sys.stderr)
