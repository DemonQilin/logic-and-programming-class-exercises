let () = print_endline "\n--- PROGRAMA DE AUMENTO DE SALARIO POR CATEGORIAS ---\n"

let category = print_endline "Ingresa la categoria a la que perteneces (A, B, C):"; read_line ()

let increment_percentage = match category with
| "a" | "A" -> 0.15
| "b" | "B" -> 0.1
| "c" | "C" -> 0.07
| _ -> prerr_endline (Printf.sprintf "La categoria \"%s\" ingresada no existe" category); exit 1

let salary = print_endline "Ingresa tu salario actual:"; float_of_string (read_line ())

let increment = salary *. increment_percentage
let new_salary = salary +. increment

let () = print_endline (Printf.sprintf "\nTu aumento será de: $ %f" increment);
print_endline (Printf.sprintf "Tu nuevo salario será de: $ %f" new_salary)
