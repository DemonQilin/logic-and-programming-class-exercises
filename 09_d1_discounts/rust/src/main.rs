use std::io;

enum Day {
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday,
}

fn main() {
    println!("\n-- PROGRAMA PARA CALCULAR DE DESCUENTOS POR COMPRAS - ALMACENES D1 --\n");

    let purchase_total = get_purchase_total();
    let purchase_day = get_purchase_day();
    let purchase_discount = calculate_discount(purchase_total, purchase_day);

    if purchase_discount > 0.0 {
        println!("\nEl descuento para la compra es de: $ {purchase_discount:.2}");
    } else {
        println!("\nLa compra no tiene descuento");
    }
}

fn get_purchase_total() -> f32 {
    let mut input = String::new();

    loop {
        println!("Ingrese el valor de la compra del cliente:");
        io::stdin().read_line(&mut input).unwrap();

        match input.trim().parse::<f32>() {
            Err(_) => {
                eprintln!("El valor de la compra debe ser un número entero o decimal válido\n")
            }
            Ok(total) if total < 0_f32 => {
                eprintln!("El valor de la compra debe ser un número positivo mayor a cero\n")
            }
            Ok(total) => break total,
        }

        input.clear();
    }
}

fn get_purchase_day() -> Day {
    let mut input = String::new();

    println!(
        "\nLunes (L)\nMartes (M)\nMiercoles(W)\nJueves (J)\nViernes (V)\nSabado (S)\nDomingo (D)"
    );

    loop {
        println!("Ingrese la letra que corresponde al día de la compra según la lista mostrada:");
        io::stdin().read_line(&mut input).unwrap();

        break match input.trim().to_lowercase().as_str() {
            "l" => Day::Monday,
            "m" => Day::Tuesday,
            "w" => Day::Wednesday,
            "j" => Day::Thursday,
            "v" => Day::Friday,
            "s" => Day::Saturday,
            "d" => Day::Sunday,
            _ => {
                eprintln!("Día inválido. Únicamente se aceptan: L|M|W|J|V|S|D\n");
                input.clear();

                continue;
            }
        };
    }
}

fn calculate_discount(total: f32, day: Day) -> f32 {
    if total <= 100000_f32 {
        return 0.0;
    }

    let achieve_the_highest_discount = total >= 200000_f32;

    let discount_percentage: f32 = match day {
        Day::Monday | Day::Wednesday | Day::Friday => {
            if achieve_the_highest_discount {
                0.15
            } else {
                0.1
            }
        }
        Day::Tuesday | Day::Thursday => {
            if achieve_the_highest_discount {
                0.18
            } else {
                0.12
            }
        }
        Day::Saturday | Day::Sunday => {
            if achieve_the_highest_discount {
                0.2
            } else {
                0.15
            }
        }
    };

    discount_percentage * total
}
