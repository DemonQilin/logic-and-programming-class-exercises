let () = print_endline "\n--- PROGRAMA PARA DETERMINAR MAYORIA DE EDAD ---\n"

let () = print_endline "Ingrese una edad:"
let age = int_of_string (read_line ())

let () = print_endline (if age >= 18 then "\nLa persona es MAYOR de edad" else "\nLa persona es MENOR de edad")