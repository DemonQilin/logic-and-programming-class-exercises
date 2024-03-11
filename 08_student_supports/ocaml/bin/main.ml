let () = print_endline "\n-- PROGRAMA PARA ENTREGAR SUBSIDIOS A ESTUDIANTES --\n"

let social_class = print_endline "Ingrese el estrato del estudiante:"; int_of_string (read_line ())

let () =
  if social_class >= 1 && social_class <= 6 then
      let grade = prerr_endline "Ingrese el promedio del estudiante:"; float_of_string (read_line ()) in

      if grade >= 0. && grade <= 5. then
        let support =
          if (social_class = 1 || social_class = 2) && grade >= 4. then
            100000
          else if social_class = 3 && grade > 4. then
            80000
          else if social_class > 3 && grade > 4.5 then
            50000
          else
            0 in
            
        if support > 0 then
          print_endline (Printf.sprintf "\nEl subsidio para el estudiante es: $ %d" support)
        else
          print_endline "\n El estudiante no cumple con las condiciones para recibir un subsidio"

      else
        prerr_endline "\nEl promedio debe ser un número entre 0 y 5"
  else
      prerr_endline "\nEl estrato debe ser un número entre 1 y 6"