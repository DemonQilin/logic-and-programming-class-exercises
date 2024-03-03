INCREMENT_PERCENTAGE = 0.1

if __name__ == '__main__':
    print("\n--- PROGRAMA PARA AUMENTAR EL SALARIO ---\n")

    salary = float(input("Ingresa tu salario actual > "))
    base = float(input("Ingresa el salario base > "))

    if salary < 2 * base:
        increase = salary * INCREMENT_PERCENTAGE
        new_salary = salary + increase

        print(f"\nTu aumento será de: $ {increase}")
        print(f"Tu nuevo salario será de: $ {new_salary}")
    else:
        print("\nNo tienes derecho a un aumento")