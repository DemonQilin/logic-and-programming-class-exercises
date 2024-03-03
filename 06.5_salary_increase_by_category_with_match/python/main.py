import sys

CATEGORIES = ['a', 'b', 'c']

if __name__ == '__main__':
    print("\n--- PROGRAMA DE AUMENTO DE SALARIO POR CATEGORIAS ---\n")

    category = input("Ingresa la categoria a la que perteneces (A, B, C) > ")

    match category.lower():
        case 'a' | 'A':
            increment_percentage = 0.15
        case 'b' | 'B':
            increment_percentage = 0.1
        case 'c' | 'C':
            increment_percentage = 0.07
        case _:
            print(f'La categoria "{category}" ingresada no existe', file=sys.stderr)
            sys.exit(1)

    salary = float(input("Ingresa tu salario actual > "))

    increment = salary * increment_percentage
    new_salary = salary + increment

    print(f"\nTu aumento será de: $ {new_salary}")
    print(f"Tu nuevo salario será de: $ {new_salary}")
