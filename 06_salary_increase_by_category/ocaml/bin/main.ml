let () = print_endline "\n--- PROGRAMA DE AUMENTO DE SALARIO POR CATEGORIAS ---\n"

let category = print_endline "Ingresa la categoria a la que perteneces (A, B, C):"; read_line ()

let () = let lowercase = String.lowercase_ascii category in

if lowercase <> "a" && lowercase <> "b" && lowercase <> "c" then
  print_endline (Printf.sprintf "La categoria \"%s\" ingresada no existe" category)
else
  let salary = print_endline "Ingresa tu salario actual:"; float_of_string (read_line ()) in

  let increment_percentage = if lowercase = "a" then
    0.15
  else
    if lowercase = "b" then
      0.1
    else
      0.07 in

  let increment = salary *. increment_percentage in
  let new_salary = salary +. increment in

  print_endline (Printf.sprintf "\nTu aumento será de: $ %f" increment);
  print_endline (Printf.sprintf "Tu nuevo salario será de: $ %f" new_salary)
