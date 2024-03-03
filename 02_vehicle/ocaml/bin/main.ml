type vehicle = {
  brand: string;
  plate: string;
  color: string;
  model: int;
}

let details vehicle = 
  match vehicle with
  | { brand; plate; color; model } -> Printf.sprintf "Brand: %s,\nPlate: %s,\nColor: %s,\nModel: %d" brand plate color model

let main () = 
    let taxi = {
        brand = "Nissan";
        plate = "RTXB101";
        color = "Amarillo";
        model = 2022;
    } in

    let moto = {
        brand = "Yamanha";
        plate = "ABC42E";
        color = "Negra";
        model = 2021;
    } in

    let bus = {
        brand = "Chevrolet";
        plate = "RGD123";
        color = "De todos los colores";
        model = 2005;
    } in

    let () = print_endline "\nDetalles taxi" in
    let () = print_endline (details taxi) in

    let () = print_endline "\nDetalles moto" in
    let () = print_endline (details moto) in

    let () = print_endline "\nDetalles bus" in
    let () = print_endline (details bus) in

    ()

let () = main ()
