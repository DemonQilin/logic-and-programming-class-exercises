let () = print_endline "\n--- PROGRAMA PARA CALCULAR SALARIO POR HORAS SEMANALES ---\n"

let hours = print_endline "Ingrese las horas trabajadas durante la semana:"; int_of_string (read_line ())

let salary = match hours with
| n when n <= 0 -> prerr_endline "Las horas deben ser un número entero positivo"; exit 1
| n when n <= 48 -> hours * 15000
| n when n <= 70 -> 48 * 15000 + (hours - 48) * 18000
| _ -> 48 * 15000 + (hours - 48) * 22000

let () = print_endline (Printf.sprintf "\nTu salario para esta semana es de $: %d" salary)