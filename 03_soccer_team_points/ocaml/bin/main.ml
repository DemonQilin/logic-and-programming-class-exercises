let points_for_win = 3
let points_for_loss = 0
let points_for_tie = 1

let () = print_endline "\n--PROGRAMA PARA CALCULAR PUNTOS DE UN EQUIPO DE FUTBOL--\n"

let () = print_endline "Ingrese el nombre del equipo: "
let team_name = read_line ()

let () = print_endline (Printf.sprintf "Ingrese el número de partidos ganados por el equipo %s: " team_name)
let wins = int_of_string (read_line ())

let () = print_endline (Printf.sprintf "Ingrese el número de partidos perdidos por el equipo %s: " team_name)
let losses = int_of_string (read_line ())

let () = print_endline (Printf.sprintf "Ingrese el número de partidos empatados por el equipo %s: " team_name)
let ties = int_of_string (read_line ())

let points = (wins * points_for_win) + (losses * points_for_loss) + (ties * points_for_tie)

let () = print_endline (Printf.sprintf "\nEl equipo %s tiene un total de %d puntos" team_name points)