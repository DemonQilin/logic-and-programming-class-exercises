use std::{io, process};
use std::io::Write;

fn main() {
    let mut input = String::new();

    println!("\n--- PROGRAMA DE AUMENTO DE SALARIO POR CATEGORIAS ---\n");

    print!("Ingresa la categoria a la que perteneces (A, B, C) > ");
    io::stdout().flush().unwrap();
    io::stdin().read_line(&mut input).unwrap();
    let category = input.trim().to_string();

    let increment_percentage = match category.as_str() {
        "a" | "A" => 0.15_f32,
        "b" | "B" => 0.1,
        "c" | "C" => 0.07,
        _ => {
            eprintln!("La categoria \"{category}\" ingresada no existe");
            process::exit(1);
        }
    };

    print!("Ingresa tu salario actual > ");
    io::stdout().flush().unwrap();
    input.clear();
    io::stdin().read_line(&mut input).unwrap();
    let salary = input.trim().parse::<f32>().expect("El salario debe ser un número");

    let increment = salary * increment_percentage;
    let new_salary = salary + increment;

    println!("\nTu aumento será de: $ {increment}");
    println!("Tu nuevo salario será de: $ {new_salary}");
}
