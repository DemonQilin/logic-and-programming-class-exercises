if __name__ == '__main__':
    print("\n--- PROGRAMA PARA CALCULAR SALARIO POR HORAS SEMANALES ---\n")

    hours = int(input("Ingrese las horas trabajadas durante la semana > "))

    if hours <= 48:
        salary = hours * 15000
    elif hours <= 70:
        salary = 48 * 15000 + (hours - 48) * 18000
    else:
        salary = 48 * 15000 + (hours - 48) * 22000

    print(f"\nTu salario para esta semana es de: $ {salary}")