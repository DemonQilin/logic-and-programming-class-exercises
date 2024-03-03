let increment_percentage = 0.1

let () = print_endline "\n--- PROGRAMA PARA AUMENTAR EL SALARIO ---\n"

let () = print_endline "Ingresa tu salario actual:"
let salary = float_of_string (read_line ())

let () = print_endline "Ingresa el salario base:"
let base = float_of_string (read_line ())

let () = if salary < 2.0 *. base then
  let increase = salary *. increment_percentage in
  let new_salary = salary +. increase in
  let () = print_endline (Printf.sprintf "\nTu aumento será de: $ %f" increase) in
  print_endline (Printf.sprintf "Tu nuevo salario será de: $ %f" new_salary)
else
  print_endline "\nNo tienes derecho a un aumento"