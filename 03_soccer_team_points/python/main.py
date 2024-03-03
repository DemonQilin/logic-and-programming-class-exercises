POINTS_FOR_WIN = 3
POINTS_FOR_LOSS = 0
POINTS_FOR_TIE = 1

if __name__ == '__main__':
    print("\n--PROGRAMA PARA CALCULAR PUNTOS DE UN EQUIPO DE FUTBOL--\n")

    team_name = input("Ingrese el nombre del equipo > ")
    wins = int(input(f"Ingrese la cantidad de partidos ganados por el equipo {team_name} > "))
    losses = int(input(f"Ingrese la cantidad de partidos perdidos por el equipo {team_name} > "))
    ties = int(input(f"Ingrese la cantidad de partidos empatados por el equipo {team_name} > "))

    points = wins * POINTS_FOR_WIN + losses * POINTS_FOR_LOSS + ties * POINTS_FOR_TIE

    print(f"\nEl equipo {team_name} tiene un total de {points} puntos")