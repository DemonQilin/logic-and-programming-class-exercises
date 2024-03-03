if __name__ == '__main__':
    print("\n--- PROGRAMA DE AUMENTO DE SALARIO POR CATEGORIAS ---\n")

    category = input("Ingresa la categoria a la que perteneces (A, B, C) > ")

    if category.lower() != 'a' and category.lower() != 'b' and category.lower() != 'c':
        print(f'La categoria "{category}" ingresada no existe')
    else:
        salary = float(input("Ingresa tu salario actual > "))

        if category.lower() == 'a':
            increment_percentage = 0.15
        elif category.lower() == 'b':
            increment_percentage = 0.1
        else:
            increment_percentage = 0.07

        increment = salary * increment_percentage
        new_salary = salary + increment

        print(f"\nTu aumento será de: $ {new_salary}")
        print(f"Tu nuevo salario será de: $ {new_salary}")