type day =
  | Monday
  | Tuesday
  | Wednesday
  | Thursday
  | Friday
  | Saturday
  | Sunday

let week_menu = "\nLunes (L)\nMartes (M)\nMiercoles(W)\nJueves (J)\nViernes (V)\nSabado (S)\nDomingo (D)"

let rec get_purchase_total value = 
  match value with
  | None -> let input = print_endline "Ingrese el valor de la compra del cliente:"; read_line () in get_purchase_total (Some input)
  | Some v -> 
    match (float_of_string_opt v) with
    | Some total when total > 0. -> total
    | Some _ -> prerr_endline "El valor de la compra debe ser un número positivo mayor a cero\n"; get_purchase_total None
    | None -> prerr_endline "El valor de la compra debe ser un número entero o decimal válido\n"; get_purchase_total None

let rec get_purchase_day value =
  match value with
  | None -> let input = print_endline "Ingrese la letra que corresponde al día de la compra según la lista mostrada:"; read_line () in get_purchase_day (Some input)
  | Some value ->
    match (String.lowercase_ascii value) with
    | "l" -> Monday
    | "m" -> Tuesday
    | "w" -> Wednesday
    | "j" -> Thursday
    | "v" -> Friday
    | "s" -> Saturday
    | "d" -> Sunday
    | _ -> prerr_endline "Día inválido. Únicamente se aceptan: L|M|W|J|V|S|D\n"; get_purchase_day None

let calculate_discount total day =
  match total with
  | total when total <= 100_000. -> 0.
  | total ->
    let achieve_the_highest_discount = total >= 200_000. in

    let discount_percentage = match day with
    | Monday | Wednesday | Friday -> if achieve_the_highest_discount then 0.15 else 0.1
    | Tuesday | Thursday -> if achieve_the_highest_discount then 0.18 else 0.12
    | Saturday | Sunday -> if achieve_the_highest_discount then 0.2 else 0.15 in

    discount_percentage *. total

let main () =
  let () = print_endline "\n-- PROGRAMA PARA CALCULAR DE DESCUENTOS POR COMPRAS - ALMACENES D1 --\n" in

  let purchase_total = get_purchase_total None in
  let purchase_day = print_endline week_menu; get_purchase_day None in
  let purchase_discount = calculate_discount purchase_total purchase_day in

  if purchase_discount > 0. then
    Printf.printf "\nEl descuento para la compra es de: $ %.2f\n" purchase_discount
  else
    print_endline "\nLa compra no tiene descuento"

let () = main ()